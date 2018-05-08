package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.CommissionProcess;
import cn.jingzhoulive.domain.MyCommission;
import cn.jingzhoulive.domain.MyVisitProcess;
import cn.jingzhoulive.domain.VistProcess;
import cn.jingzhoulive.service.ICommissionProcessService;
import cn.jingzhoulive.service.IUserService;
import cn.jingzhoulive.service.IVisitProcessService;
import cn.jingzhoulive.utils.BackJsonUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangmin on 18-5-4.
 */
@RestController
@RequestMapping("/mine")
public class MineController {

    @Autowired
    private ICommissionProcessService commissionProcessService;

    @Autowired
    private IVisitProcessService visitProcessService;

    @Autowired
    private IUserService userService;
    /**
     * 我的佣金
     * @param uid
     * @return
     */
    @RequestMapping("/commission")
    @ResponseBody
    public String commission(Integer uid,
                             int page,
                             int length){
        long total = commissionProcessService.priceSumByProgress(uid, null);
        long onGoing = commissionProcessService.priceSumByProgress(uid, 1); // 发放中
        PageInfo<CommissionProcess> commissionProcessPageInfo =
                commissionProcessService.selectUserBySelected(uid, null,
                        null,null,null,page, length);
        MyCommission myCommission = new MyCommission();
        myCommission.setData(commissionProcessPageInfo);
        myCommission.setTotalamount(total);
        myCommission.setOngoing(onGoing);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", myCommission);
    }

    /**
     * 我的邀请
     * @param uid
     * @return
     */
    @RequestMapping("/invite")
    @ResponseBody
    public String invite(Integer uid){
        int total = userService.getNumValideateUserByUid(uid);
        int validate = userService.getNumValideateUserByUid(uid);
//        PageInfo
        return null;
    }

    /**
     * 我的推荐
     * @param uid
     * @return
     */
    @RequestMapping("/recommend")
    @ResponseBody
    public String recommend(Integer uid){
        int total = visitProcessService.progressSumByGuider(uid, 1);  //查询总推荐人数
        int complited = visitProcessService.progressSumByGuider(uid, 4);  //查询忆完成人数
        PageInfo<VistProcess> vistProcessPageInfo = visitProcessService.selectAllLastProcess(uid);
        MyVisitProcess myVisitProcess = new MyVisitProcess();
        myVisitProcess.setCompleted(complited);
        myVisitProcess.setTotalrecommend(total);
        myVisitProcess.setData(vistProcessPageInfo);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", myVisitProcess);
    }

    /**
     * 进度提交
     * @param uid
     * @param guider
     * @param bid
     * @param progress
     * @return
     */
    @RequestMapping("/check")
    @ResponseBody
    public String addProcess(Integer uid,
                             Integer guider,
                             Integer bid,
                             Integer progress){
        VistProcess vistProcess = new VistProcess();
        vistProcess.setUid(uid);
        vistProcess.setGuider(guider);
        vistProcess.setBid(bid);
        vistProcess.setProgress(progress);
        vistProcess.setIsCheck(1);
        vistProcess.setAvailability(1);
        int insertBack = visitProcessService.insert(vistProcess);
        if(insertBack > 0){
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        }
        return BackJsonUtils.getInstance().getBackJsonUtils(false, "提交失败", null);
    }

    @RequestMapping("/secondrecommend")
    @ResponseBody
    public String secondRecommend(Integer uid,
                                  Integer guider){
        return null;
    }
}
