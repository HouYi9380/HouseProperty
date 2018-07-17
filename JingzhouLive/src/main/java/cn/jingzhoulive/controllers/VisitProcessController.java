package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.domain.VistProcess;
import cn.jingzhoulive.service.IOperationLogsService;
import cn.jingzhoulive.service.IVisitProcessService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.CommonUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-5-3.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/visitprocess")
public class VisitProcessController {
    @Autowired
    private IVisitProcessService processService;

    @Autowired
    private IOperationLogsService operationLogsService;

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
                        String mark,
                        HttpSession httpSession){
        Integer mid = (Integer)httpSession.getAttribute(CommonUtils.S_ManagerId);
        if(mid == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "您未登陆，请登陆", null);

        VistProcess vp = new VistProcess();
        vp.setVid(vid);
        vp.setIsCheck(ischeck);
        vp.setMark(mark);
        int back = processService.updateByPrimaryKeySelective(vp);
        if(back <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "设置失败", null);
        else {
            int addOp = operationLogsService.addLog("访问流程审核，vid"+vid+";状态更改为"+ischeck,
                    mid, 3, "vistorprocess");
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        }
    }


    /**
     * 设置数据是否有效
     * @param vid
     * @param availability
     * @return
     */
    @RequestMapping("/availability")
    @ResponseBody
    public String setAvailable(Integer vid,
                               Integer availability,
                               HttpSession httpSession){
        Integer mid = (Integer)httpSession.getAttribute(CommonUtils.S_ManagerId);
        if(mid == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "您未登陆，请登陆", null);
        VistProcess vp = new VistProcess();
        vp.setVid(vid);
        vp.setAvailability(availability);
        int back = processService.updateByPrimaryKeySelective(vp);
        if(back <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "设置失败", null);
        else {
            int addOp = operationLogsService.addLog("设置访问流程是否有效，vid"+vid,
                    mid, 1, "vistorprocess");
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        }
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
