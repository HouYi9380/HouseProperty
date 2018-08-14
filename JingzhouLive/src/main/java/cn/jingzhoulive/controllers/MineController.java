package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.*;
import cn.jingzhoulive.service.ICommissionProcessService;
import cn.jingzhoulive.service.IMineService;
import cn.jingzhoulive.service.IUserService;
import cn.jingzhoulive.service.IVisitProcessService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.DataUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by zhangmin on 18-5-4.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/mine")
public class MineController {

    @Autowired
    private ICommissionProcessService commissionProcessService;

    @Autowired
    private IVisitProcessService visitProcessService;

    @Autowired
    private IUserService userService;

    @Autowired
    private IMineService mineService;
    /**
     * 我的佣金
     * @param uid
     * @return
     */
    @RequestMapping("/commission")
    @ResponseBody
    public String commission(Integer uid){

        List<MyCommission> myCommissionList = mineService.getAllMyCommission(uid);
        long totalPrice = 0;
        long onGoing = 0;

        for(MyCommission myCommission : myCommissionList){
            if(myCommission.getProgress() == 1){
                onGoing += myCommission.getPrice();
            }
            totalPrice += myCommission.getPrice();
        }

        MineAllCommission mineAllCommission = new MineAllCommission();
        mineAllCommission.setTotalamount(totalPrice);
        mineAllCommission.setOnging(onGoing);
        mineAllCommission.setData(myCommissionList);

        return  BackJsonUtils.getInstance().getBackJsonUtils(true, "success", mineAllCommission);
    }

    /**
     * 我的邀请
     * @param uid
     * @return
     */
    @RequestMapping("/invite")
    @ResponseBody
    public String invite(Integer uid){
       List<MyInvite> myInvites = mineService.getAllMyInvite(uid);
       int totalPerson = 0 ;
       int validatePerson = 0;
        Map<Integer, MyInvite> myInviteMap = new HashMap<>() ;
        Map<Integer, MyInviteCountData> myInviteCountDataMap = new HashMap<>();

       for(MyInvite myInvite : myInvites){
           System.out.println("myinvite:" + myInvite.toString());
            int uidTmp = myInvite.getUid();
            Integer tmpBid = myInvite.getBid();
            if(!myInviteMap.containsKey(uidTmp)){
                myInviteMap.put(uidTmp, myInvite);
                totalPerson += 1;
                if(myInvite.getIcid() != null){
                    validatePerson += 1;
                }
            }
            if(tmpBid != null){
               MyInviteCountData countData = myInviteCountDataMap.get(uidTmp);
               if(countData == null){
                   countData = new MyInviteCountData();
               }
               int remmond  = countData.getRemonnd();
               int complted = countData.getCompleted();
               int unfinished = countData.getUnfinished();
               int progress = myInvite.getProgress();
               if(myInvite.getBid() != 0) {
                   countData.setRemonnd(remmond + 1);
                   if (progress == 4) {
                       countData.setCompleted(complted + 1);
                   } else {
                       countData.setUnfinished(unfinished + 1);
                   }
               }else{
                   countData.setCompleted(complted);
                   countData.setUnfinished(unfinished);
               }
               countData.setName(myInvite.getName());
               countData.setPhone(myInvite.getPhone());
               countData.setPic(myInvite.getPic());
               countData.setUid(myInvite.getUid());
               myInviteCountDataMap.put(uidTmp, countData);

               System.out.println("myInviteCountDataMap count:" + myInviteCountDataMap.size());
            }
       }
       List<MyInviteCountData> myInviteCountDatas = new ArrayList<>(myInviteCountDataMap.values());

       MineAllInvite mineAllInvite = new MineAllInvite();
       mineAllInvite.setTotalperson(totalPerson);
       mineAllInvite.setValideateperson(validatePerson);
       mineAllInvite.setData(myInviteCountDatas);
       return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", mineAllInvite);
    }

    /**
     * 我的推荐
     * @param uid
     * @return
     */
    @RequestMapping("/recommend")
    @ResponseBody
    public String recommend(Integer uid){
       List<MyRecommend> myRecommends = mineService.getAllMyRecommend(uid);

       MyAllRecommend myAllRecommend = new MyAllRecommend();
       int totalrecommend = 0;
       int completed = 0;
       List<MyAllRecommendData> myAllRecommendDataList = new ArrayList<>();

       for(MyRecommend myRecommend : myRecommends){
           int check = myRecommend.getIs_check();
           if(myRecommend.getAvailablility() != 1)
               continue;
            Integer bid = myRecommend.getBid();
            if(bid != null){
                totalrecommend++;
                if(check == 2 && myRecommend.getProgress() == 4)
                    completed++;
            }
            String firstcv = myRecommend.getFirstcv();
            Long price = myRecommend.getPrice();
            String countPriceStr = firstcv.replaceAll("a", price +"");
            long countPrice = DataUtils.evaluateExpression(countPriceStr);
//            long countPrice = Long.valueOf(
            MyAllRecommendData myAllRecommendData = new MyAllRecommendData();
            myAllRecommendData.setBid(bid);
            myAllRecommendData.setCheck(check);
            myAllRecommendData.setPrice(countPrice);
            myAllRecommendData.setProgress(myRecommend.getProgress());
            myAllRecommendData.setTitle(myRecommend.getBtitle());
            myAllRecommendData.setUid(myRecommend.getUid());
            myAllRecommendDataList.add(myAllRecommendData);
       }
       myAllRecommend.setCompleted(completed);
       myAllRecommend.setTotalrecommend(totalrecommend);
       myAllRecommend.setData(myAllRecommendDataList);
       return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", myAllRecommend);
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
                             Integer progress,
                             String bTitle,
                             Long price,
                             Integer commissionId){
        VistProcess vistProcess = new VistProcess();
        vistProcess.setUid(uid);
        vistProcess.setGuider(guider);
        vistProcess.setBid(bid);
        vistProcess.setProgress(progress);
        vistProcess.setIsCheck(1);
        vistProcess.setAvailability(1);
        vistProcess.setBtitle(bTitle);
        vistProcess.setCommissionId(commissionId);
        vistProcess.setPrice(price);
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
        List<MySecondRecommend> myRecommends = mineService.getAllMySecondRecommend(uid);

        MyAllSecondRecommend myAllRecommend = new MyAllSecondRecommend();
        int totalrecommend = 0;
        int completed = 0;
        List<MyAllSecondRecommendData> myAllRecommendDataList = new ArrayList<>();

        for(MySecondRecommend myRecommend : myRecommends){
            int check = myRecommend.getIs_check();
            if(myRecommend.getAvailablility() != 1)
                continue;
            Integer bid = myRecommend.getBid();
            if(bid != null){
                totalrecommend++;
                if(check == 2 && myRecommend.getProgress() == 4)
                    completed++;
            }
            String secondcv = myRecommend.getSecondcv();
            Long price = myRecommend.getPrice();
            long countPrice = Long.valueOf(secondcv.replaceAll("a", price +""));
            MyAllSecondRecommendData myAllRecommendData = new MyAllSecondRecommendData();
            myAllRecommendData.setBid(bid);
            myAllRecommendData.setCheck(check);
            myAllRecommendData.setPrice(countPrice);
            myAllRecommendData.setProgress(myRecommend.getProgress());
            myAllRecommendData.setTitle(myRecommend.getBtitle());
            myAllRecommendData.setUid(myRecommend.getUid());
            myAllRecommendDataList.add(myAllRecommendData);
        }
        myAllRecommend.setCompleted(completed);
        myAllRecommend.setTotalrecommend(totalrecommend);
        myAllRecommend.setData(myAllRecommendDataList);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", myAllRecommend);
    }
}
