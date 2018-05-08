package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.BuildingsExample;
import cn.jingzhoulive.domain.BuildingsWithBLOBs;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by zhangmin on 18-4-27.
 */
public interface IBuildingService {
    public int addBuilding(BuildingsWithBLOBs buildings);
    public int updateByPrimaryKeyWithBLOBs(BuildingsWithBLOBs record);
    BuildingsWithBLOBs selectByPrimaryKey(Integer bid);
    PageInfo<BuildingsWithBLOBs> selectByExamplePageable(Integer type,
                                                          String keyword,
                                                          String houseType,
                                                          Long startPrice,
                                                          Long endPricePrice,
                                                          String startAcreage,
                                                          String endAcreage,
                                                         int page,
                                                         int length);
}
