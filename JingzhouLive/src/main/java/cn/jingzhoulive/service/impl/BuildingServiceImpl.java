package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.BuildingsMapper;
import cn.jingzhoulive.domain.BuildingsExample;
import cn.jingzhoulive.domain.BuildingsWithBLOBs;
import cn.jingzhoulive.service.IBuildingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-4-27.
 */
@Service
public class BuildingServiceImpl implements IBuildingService{
    @Autowired
    private BuildingsMapper buildingsMapper;

    public int addBuilding(BuildingsWithBLOBs buildings) {
        return buildingsMapper.insert(buildings);
    }

    public int updateByPrimaryKeyWithBLOBs(BuildingsWithBLOBs record) {
        return buildingsMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    public BuildingsWithBLOBs selectByPrimaryKey(Integer bid) {
        return buildingsMapper.selectByPrimaryKey(bid);
    }

    public PageInfo<BuildingsWithBLOBs> selectByExamplePageable(Integer type, String keyword, String houseType, Long startPrice,
                                                                Long endPrice, String startAcreage, String endAcreage, String area, int page, int length) {
        BuildingsExample example = new BuildingsExample();
        BuildingsExample.Criteria criteria = example.createCriteria();
        if(keyword != null && (!keyword.isEmpty()))
            criteria.andTitleLike(keyword);
        if(houseType!= null && (!keyword.isEmpty()))
            criteria.andHouseTypeEqualTo(houseType);
        if(startPrice!= null && (!keyword.isEmpty()))
            criteria.andPriceGreaterThan(startPrice);
        if(type != null )
            criteria.andTypeEqualTo(type);
        if(endPrice != null)
            criteria.andPriceLessThan(endPrice);
        if(startAcreage != null && (!startAcreage.isEmpty()))
            criteria.andAcreageGreaterThan(startAcreage);
        if(endAcreage!= null && (!endAcreage.isEmpty()))
            criteria.andAcreageLessThan(endAcreage);
        if(area != null && (!area.isEmpty())){
            criteria.andAreaEqualTo(area);
        }

        PageHelper.startPage(page, length);
        List<BuildingsWithBLOBs> infoList = buildingsMapper.selectByExampleWithBLOBs(example);
        PageInfo<BuildingsWithBLOBs> p=new PageInfo<BuildingsWithBLOBs>(infoList);
        return p;
    }


}
