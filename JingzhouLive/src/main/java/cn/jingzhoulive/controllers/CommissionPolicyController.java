package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.CommissionPolicy;
import cn.jingzhoulive.service.ICommissonPolicyService;
import cn.jingzhoulive.service.IOperationLogsService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.CommonUtils;
import cn.jingzhoulive.utils.DateUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by zhangmin on 18-5-3.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/commissionpolicy")
public class CommissionPolicyController {

    @Autowired
    private ICommissonPolicyService cpService;

    @Autowired
    private IOperationLogsService operationLogsService;

    @RequestMapping("/list")
    @ResponseBody
    public String getList(int page,
                          int length){

        PageInfo<CommissionPolicy> vistPageInfo = cpService.selectAll(page, length);

        if (vistPageInfo != null) {
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", vistPageInfo);
        } else
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(String title,
                      Integer type,
                      String firstcv,
                      String secondcv,
                      String content,
                      HttpSession httpSession){

        Integer mid = (Integer)httpSession.getAttribute(CommonUtils.S_ManagerId);
        if(mid <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "您未登陆，请登陆", null);

        CommissionPolicy commissionPolicy = new CommissionPolicy();
        commissionPolicy.setTitle(title);
        commissionPolicy.setType(type);
        commissionPolicy.setFirstcv(firstcv);
        commissionPolicy.setSecondcv(secondcv);
        commissionPolicy.setContent(content);
        commissionPolicy.setAvailablility(1);
        String time = DateUtils.getSystemTime();
        commissionPolicy.setCreateTime(time);
        commissionPolicy.setChangTime(time);
        int addBack = cpService.insert(commissionPolicy);
        if(addBack  <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "添加失败", null);
        else {
            int addOp = operationLogsService.addLog("添加佣金政策，政策id:"+commissionPolicy.getCid(),
                    mid, 1, "CommissionPolicy");
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String setInvalid(Integer cid,
                             HttpSession httpSession){
        Integer mid = (Integer)httpSession.getAttribute(CommonUtils.S_ManagerId);
        if(mid == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "您未登陆，请登陆", null);

        CommissionPolicy commissionPolicy = new CommissionPolicy();
        commissionPolicy.setCid(cid);
        commissionPolicy.setAvailablility(2);
        int updateBack = cpService.updateByPrimaryKeySelective(commissionPolicy);
        if(updateBack <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "删除失败", null);
        else {
            int addOp = operationLogsService.addLog("删除佣金政策，政策id:"+cid,
                    mid, 1, "CommissionPolicy");
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        }
    }

    @RequestMapping("/get")
    @ResponseBody
    public String getFromCpid(Integer cpid){
        CommissionPolicy commissionPolicy = cpService.getFromCpid(cpid);
        if(commissionPolicy == null){
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "获取失败", null);
        }
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", commissionPolicy);
    }

    @RequestMapping("/update")
    @ResponseBody
    public String modefy(int cid,
                         String title,
                         int type,
                         String firstcv,
                         String secondcv,
                         String content,
                         HttpSession httpSession){

        Integer mid = (Integer)httpSession.getAttribute(CommonUtils.S_ManagerId);
        if(mid ==  null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "您未登陆，请登陆", null);

        CommissionPolicy commissionPolicy = new CommissionPolicy();
        commissionPolicy.setCid(cid);
        commissionPolicy.setTitle(title);
        commissionPolicy.setType(type);
        commissionPolicy.setFirstcv(firstcv);
        commissionPolicy.setSecondcv(secondcv);
        commissionPolicy.setContent(content);
        int update = cpService.updateByPrimaryKeySelective(commissionPolicy);
        if(update <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "更新失败", null);
        else {
            int addOp = operationLogsService.addLog("更新佣金政策，政策id:"+cid,
                    mid, 2, "CommissionPolicy");
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        }
    }
}