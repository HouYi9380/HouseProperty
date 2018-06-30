package cn.jingzhoulive.controllers;

import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.CommonUtils;
import cn.jingzhoulive.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangmin on 18-5-15.
 */
@RequestMapping("/upload")
@RestController
public class UploadController {
    @Value("${server.url}")
    private String serverUrl;
    @RequestMapping("/file")
    @ResponseBody
    public String upload(MultipartFile file, Integer type, HttpServletRequest request){

        if(file == null)
            return "false";
        System.out.println("file:" + file.getName());
        System.out.println("name :" + file.getOriginalFilename());
        request.getSession().getAttribute(CommonUtils.S_ManagerId);
        String backJsonUtils;

        if (file != null && !file.isEmpty()) {
//            //上传文件名
            String urlPath;
            if(type == null)
                urlPath = "others/";
            else if(type == 1)
                urlPath =  "mHead/";
            else {
                urlPath =  "unkown/";
            }
            String originalFileName = file.getOriginalFilename();
            urlPath = urlPath + UUIDUtils.getUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));

            String filename = file.getOriginalFilename();
            String path = request.getRealPath("/images/") + urlPath;

//            File filepath = new File(path,filename);
//            String path = "/home/zhangmin/download/" + new Date().getTime() +  file.getOriginalFilename();

            //通过CommonsMultipartFile的方法直接写文件
            try {
                File newFile=new File(path);
//            //判断路径是否存在，如果不存在就创建一个
                if (!newFile.getParentFile().exists()) {
                    newFile.getParentFile().mkdirs();
                }
                file.transferTo(newFile);

                String backUrl = serverUrl + "/images/" + urlPath;
                System.out.println("文件上传url:" + backUrl);
                backJsonUtils = BackJsonUtils.getInstance().getBackJsonUtils(true, "success",
                        serverUrl + urlPath);
            } catch (IOException e) {
                e.printStackTrace();
                backJsonUtils = BackJsonUtils.getInstance().getBackJsonUtils(false, "上传失败",null);

            }
        }else{
            backJsonUtils = BackJsonUtils.getInstance().getBackJsonUtils(false, "文件上传错误",null);
        }

        return backJsonUtils;
    }

    @RequestMapping("/multifile")
    @ResponseBody
    public String uploadMultiFile(MultipartFile[] files, Integer type, HttpServletRequest request){

        String backJsonUtils;
        String urlPath;
        List<String> urlList = new ArrayList<>();
        if(type == null)
            urlPath = "others/";
        else if(type == 1)
            urlPath =  "mHead/";
        else {
            urlPath = "unkown/";
        }
        for(MultipartFile file : files) {
            System.out.println("file:" + file.getName());
            System.out.println("name :" + file.getOriginalFilename());
            request.getSession().getAttribute(CommonUtils.S_ManagerId);
            if (file != null && !file.isEmpty()) {
//            //上传文件名
                String originalFileName = file.getOriginalFilename();
                String fileUrlPath = urlPath + UUIDUtils.getUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));

                String filename = file.getOriginalFilename();
                String path = request.getRealPath("/images/") + fileUrlPath;
                try {
                    File newFile = new File(path);
//            //判断路径是否存在，如果不存在就创建一个
                    if (!newFile.getParentFile().exists()) {
                        newFile.getParentFile().mkdirs();
                    }
                    file.transferTo(newFile);
                    String backUrl = serverUrl + "/images/" + fileUrlPath;
                    System.out.println("文件上传url:" + backUrl);
                    urlList.add(backUrl);
                } catch (IOException e) {
                    e.printStackTrace();
                    backJsonUtils = BackJsonUtils.getInstance().getBackJsonUtils(false, "上传失败", null);
                    return backJsonUtils;
                }
            } else {

                backJsonUtils = BackJsonUtils.getInstance().getBackJsonUtils(false, "文件上传错误", null);
                return backJsonUtils;
            }
        }

        backJsonUtils = BackJsonUtils.getInstance().getBackJsonUtils(true, "success", urlList);
        return backJsonUtils;
    }
}
