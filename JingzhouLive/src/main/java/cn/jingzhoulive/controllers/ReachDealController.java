package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.ReachDeal;
import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.service.IReachDealService;
import cn.jingzhoulive.service.IUserService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.DateUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangmin on 18-5-3.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/reachdeal")
public class ReachDealController {

    @Autowired
    private IReachDealService reachDealService;

    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public String getList(
                          @RequestParam(required = false) String keyword,
                          @RequestParam(required = false) String starttime,
                          @RequestParam(required = false) String endtime,
                          int page,
                          int length){

        PageInfo<ReachDeal> reachDealPage = reachDealService.selectUserBySelected(keyword, starttime,endtime,page, length);
        if (reachDealPage != null) {
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", reachDealPage);
        } else {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(
                      Integer vid,
                      Integer uid,
                      Integer guider,
                      Integer bid,
                      Long hostprice,
                      Long price,
                      Long dealprice,
                      Integer cid,
                      Long firstcv,
                      Long secondcv){
        String curTime = DateUtils.getSystemTime();
        ReachDeal reachDeal = new ReachDeal();
        reachDeal.setVid(vid);
        reachDeal.setUid(uid);
        reachDeal.setGuider(guider);
        reachDeal.setBid(bid);
        reachDeal.setHostPrice(hostprice);
        reachDeal.setPrice(price);
        reachDeal.setDealPrice(dealprice);
        reachDeal.setCid(cid);
        reachDeal.setFirstcv(firstcv);
        reachDeal.setSecondcv(secondcv);
        reachDeal.setCreateTime(curTime);
        reachDeal.setChangTime(curTime);

        int back = reachDealService.insert(reachDeal);
        if(back <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "添加失败", null);
        //查询推荐人
        User guiderUser = userService.selectUser(guider);
        if(guiderUser != null){
            // 添加佣金
            //判断是否有上一级,若有，添加二级佣金
            if(guiderUser.getGuider() != null){
                User ggUser = userService.selectUser(guiderUser.getGuider());
                if(ggUser != null){
                    //添加二级佣金
                }
            }
        }

        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/get")
    @ResponseBody
    public String getFromVid(Integer rid){
        ReachDeal reachDeal = reachDealService.selectByPrimaryKey(rid);
        if(reachDeal == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "获取失败", null);
        else
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", reachDeal);

    }


}
