package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.Information;
import cn.jingzhoulive.service.IInformationService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.DateUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-4-28.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/information")
public class InformationController {

    @Autowired
    private IInformationService informationService;


    @RequestMapping("/list")
    @ResponseBody
    public String getInformation(
                                 @RequestParam (required = false) String keyword,
                                 @RequestParam (required = false)Integer type,
                                 @RequestParam (required = false) String startTime,
                                 @RequestParam (required = false)String endTime,
                                 String areaId,
                                 int page,
                                 int length){

        PageInfo<Information> informationPageInfo = informationService.selectUserBySelected(keyword, areaId, type, startTime, endTime, page, length);
        if(informationPageInfo == null){
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
        List<PageInfo<Information>> list = new ArrayList<PageInfo<Information>>();
        list.add(informationPageInfo);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", list);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addInformation(String title,
                                 Integer type,
                                 String html,
                                 String pics,
                                 String areaid){

        String curTime = DateUtils.getSystemTime();

        Information information = new Information();
        information.setHtml(html);
        information.setCreateTime(curTime);
        information.setChangTime(curTime);
        information.setType(type);
        information.setTitle(title);
        information.setAreaid(areaid);
        information.setPics(pics);
        int insertBack = informationService.insert(information);
        if(insertBack < 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "添加失败", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/edit")
    @ResponseBody
    public String updateInformation(int iid,
                                    String title,
                                    Integer type,
                                    String html,
                                    String areaid) {
        System.out.println("information edit:");
        String curTime = DateUtils.getSystemTime();

        Information information = new Information();
        information.setIid(iid);
        information.setHtml(html);
//        information.setCreateTime(curTime);
        information.setChangTime(curTime);
        information.setType(type);
        information.setTitle(title);
        information.setAreaid(areaid);
        int insertBack = informationService.updateByPrimaryKeySelected(information);
        if(insertBack < 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "更新失败", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String deleteInformation(Integer mid,
                                    Integer iId){
        int deleteBack = informationService.deleteByPrimaryKey(iId);
        if(deleteBack< 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "删除失败", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/get")
    @ResponseBody
    public String getInformaitonFromId(Integer iid){
        Information information = informationService.selectByPrimaryKey(iid);
        if(information == null){
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "获取失败", null);
        }
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", information);
    }


}
