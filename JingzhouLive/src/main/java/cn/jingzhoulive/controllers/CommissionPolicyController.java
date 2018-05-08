package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.CommissionPolicy;
import cn.jingzhoulive.service.ICommissonPolicyService;
import cn.jingzhoulive.utils.BackJsonUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangmin on 18-5-3.
 */
@RestController
@RequestMapping("/commissionpolicy")
public class CommissionPolicyController {

    @Autowired
    private ICommissonPolicyService cpService;


    @RequestMapping("/list")
    @ResponseBody
    public String getList(Integer mid,
                          int page,
                          int length){

        PageInfo<CommissionPolicy> vistPageInfo = cpService.selectAll(page, length);

        if (vistPageInfo != null) {
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", vistPageInfo);
        } else
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(Integer mid,
                      String title,
                      Integer type,
                      String firstcv,
                      String secondcv,
                      String content){
        CommissionPolicy commissionPolicy = new CommissionPolicy();
        commissionPolicy.setTitle(title);
        commissionPolicy.setType(type);
        commissionPolicy.setFirstcv(firstcv);
        commissionPolicy.setSecondcv(secondcv);
        commissionPolicy.setContent(content);
        int addBack = cpService.insert(commissionPolicy);
        if(addBack  <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "添加失败", null);
        else
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String setInvalid(Integer mid,
                             Integer cid){
        CommissionPolicy commissionPolicy = new CommissionPolicy();
        commissionPolicy.setCid(cid);
        commissionPolicy.setAvailablility(2);
        int updateBack = cpService.updateByPrimaryKeyWithBLOBs(commissionPolicy);
        if(updateBack <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "删除失败", null);
        else
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

}