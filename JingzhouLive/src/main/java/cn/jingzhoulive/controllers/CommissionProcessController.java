package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.CommissionProcess;
import cn.jingzhoulive.service.ICommissionProcessService;
import cn.jingzhoulive.utils.BackJsonUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangmin on 18-5-3.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/commissionprocess")
public class CommissionProcessController {


    @Autowired
    private ICommissionProcessService cpService;
    @RequestMapping("/list")
    @ResponseBody
    public String getList(
                          Integer progress,
                          String keyword,
                          String startTime,
                          String endTime,
                          int page,
                          int length){
        PageInfo<CommissionProcess> vistPageInfo = cpService.selectUserBySelected(null, progress,keyword,startTime,
                endTime, page, length);

        if (vistPageInfo != null) {
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", vistPageInfo);
        } else {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
    }

    @RequestMapping("/progress")
    @ResponseBody
    public String changeProgress(
                                 Integer cpid,
                                 Integer progress){

        CommissionProcess cp = new CommissionProcess();
        cp.setCpid(cpid);
        cp.setProgress(progress);
        int back = cpService.updateByPrimaryKeySelective(cp);
        if (back > 0) {
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        } else {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
    }


}
