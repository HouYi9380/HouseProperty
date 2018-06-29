package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.domain.VistProcess;
import cn.jingzhoulive.service.IVisitProcessService;
import cn.jingzhoulive.utils.BackJsonUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-5-3.
 */
@RestController
@RequestMapping("/visitprocess")
public class VisitProcessController {
    @Autowired
    private IVisitProcessService processService;

    @RequestMapping("/list")
    @ResponseBody
    public String list(@RequestParam(required = false) Integer ischeck,
                       @RequestParam(required = false) String keyword,
                       @RequestParam(required = false) String starttime,
                       @RequestParam(required = false) String endtime,
                       int page,
                       int length){

        PageInfo<VistProcess> vistPageInfo = processService.selectUserBySelected(ischeck,keyword,starttime,
                endtime, page, length);

        List<PageInfo<VistProcess>> vistPages = null;
        if (vistPageInfo != null) {
            vistPages = new ArrayList<PageInfo<VistProcess>>();
            vistPages.add(vistPageInfo);
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", vistPages);
        } else {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
    }

    /**
     * 审核操作
     * @param vid
     * @param ischeck
     * @param mark
     * @return
     */
    @RequestMapping("/check")
    @ResponseBody
    public String check(Integer vid,
                        Integer ischeck,
                        String mark){
        VistProcess vp = new VistProcess();
        vp.setVid(vid);
        vp.setIsCheck(ischeck);
        vp.setMark(mark);
        int back = processService.updateByPrimaryKeySelective(vp);
        if(back <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "设置失败", null);
        else
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }


    /**
     * 设置数据是否有效
     * @param vid
     * @param availability
     * @return
     */
    @RequestMapping("/availability")
    @ResponseBody
    public String setAvailable(
                               Integer vid,
                               Integer availability){
        VistProcess vp = new VistProcess();
        vp.setVid(vid);
        vp.setAvailability(availability);
        int back = processService.updateByPrimaryKeySelective(vp);
        if(back <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "设置失败", null);
        else
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/get")
    @ResponseBody
    public String getFromId(Integer vid){
        VistProcess vp = processService.getFromVid(vid);
        if(vp == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "获取失败", null);
        else
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", vp);
    }


}
