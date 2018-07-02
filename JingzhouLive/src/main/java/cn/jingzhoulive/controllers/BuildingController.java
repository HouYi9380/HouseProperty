package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.Buildings;
import cn.jingzhoulive.domain.BuildingsWithBLOBs;
import cn.jingzhoulive.service.IBuildingService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.DateUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-4-27.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired
    private IBuildingService buildingService;

    @RequestMapping("/add")
    @ResponseBody
    public String addBuildingInfo(int type,
                                  String title,
                                  String address,
                                  String contacts,
                                  String phone,
                                  String area,
                                  String latitude,
                                  String longtitude,
                                  @RequestParam(required = false) String pics,
                                  String favourable,
                                  String traffic,
                                  String buildingInfo,
                                  Integer decoration,
                                  Integer shared,
                                  Integer commissionId,
                                  Long price,
                                  String acreage,
                                  String houseType,
                                  Integer recommend){
        String curTime = DateUtils.getSystemTime();

        BuildingsWithBLOBs buildingsWithBLOBs = new BuildingsWithBLOBs(null, type, title, address, contacts, phone,
                area, latitude, longtitude, decoration, shared, commissionId, price, acreage, houseType, recommend,
                curTime, curTime, pics, favourable, traffic, buildingInfo);

        int ret = buildingService.addBuilding(buildingsWithBLOBs);

        return BackJsonUtils.getInstance().getBackJsonUtils(ret > 0 ? true : false, ret > 0 ? "success" : "添加失败", null);
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateBuildingInfo(
                                        int bid,
                                        @RequestParam (required = false) Integer type,
                                        @RequestParam (required = false) String title,
                                        @RequestParam (required = false) String address,
                                        @RequestParam (required = false) String contacts,
                                        @RequestParam (required = false) String phone,
                                        @RequestParam (required = false) String area,
                                        @RequestParam (required = false) String latitude,
                                        @RequestParam (required = false) String longtitude,
                                        @RequestParam (required = false) String pics,
                                        @RequestParam (required = false) String favourable,
                                        @RequestParam (required = false) String traffic,
                                        @RequestParam (required = false) String buildingInfo,
                                        @RequestParam (required = false) Integer decoration,
                                        @RequestParam (required = false) Integer shared,
                                        @RequestParam (required = false) Integer commissionId,
                                        @RequestParam (required = false) Long price,
                                        @RequestParam (required = false) String acreage,
                                        @RequestParam (required = false) String houseType,
                                        @RequestParam (required = false) Integer recommend) {
        String curTime = DateUtils.getSystemTime();

        BuildingsWithBLOBs buildingsWithBLOBs = new BuildingsWithBLOBs(bid, type, title, address, contacts, phone,
                area, latitude, longtitude, decoration, shared, commissionId, price, acreage, houseType, recommend,
                curTime, curTime, pics, favourable, traffic, buildingInfo);
        int ret = buildingService.updateByPrimaryKeyWithBLOBs(buildingsWithBLOBs);
        return BackJsonUtils.getInstance().getBackJsonUtils(ret > 0 ? true : false, ret > 0 ? "success" : "更新失败", null);
    }

    @RequestMapping("/search")
    @ResponseBody
    public String search( @RequestParam (required = false) Integer type,
                          @RequestParam (required = false) String keyword,
                          @RequestParam (required = false) String houseType,
                          @RequestParam (required = false) Long startPrice,
                          @RequestParam (required = false) Long endPrice,
                          @RequestParam (required = false) String startAcreage,
                          @RequestParam (required = false) String endAcreage,
                          @RequestParam (required = false) String areaid,
                          int page,
                          int length){
        PageInfo<BuildingsWithBLOBs> buildPageInfo = buildingService.selectByExamplePageable(type, keyword,houseType,
                startPrice,endPrice,startAcreage, endAcreage,areaid, page,length);
        if(buildPageInfo == null){
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
        List<PageInfo<BuildingsWithBLOBs>> list = new ArrayList<PageInfo<BuildingsWithBLOBs>>();
        list.add(buildPageInfo);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", list);
    }

    @RequestMapping("/currenthouse")
    @ResponseBody
    public String getBuildings(Integer bid){
        BuildingsWithBLOBs buildingsWithBLOBs = buildingService.selectByPrimaryKey(bid);
        if(buildingsWithBLOBs == null){
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "数据不存在", null);
        }
        System.out.println("housetype:" + buildingsWithBLOBs.getHouseType());
        List<BuildingsWithBLOBs> list = new ArrayList<BuildingsWithBLOBs>();
        list.add(buildingsWithBLOBs);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", list);
    }

    @RequestMapping("/recommend")
    @ResponseBody
    public String recommend(String areaid,
                            int type,
                            int page,
                            int length){
        PageInfo<BuildingsWithBLOBs> buildPageInfo = buildingService.selectByExamplePageable(type, null,null,
                null,null,null, null, areaid, page,length);
        if(buildPageInfo == null){
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
        List<PageInfo<BuildingsWithBLOBs>> list = new ArrayList<PageInfo<BuildingsWithBLOBs>>();
        list.add(buildPageInfo);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", list);
    }

}
