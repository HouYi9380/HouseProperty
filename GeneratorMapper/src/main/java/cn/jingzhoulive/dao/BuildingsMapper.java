package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.Buildings;
import cn.jingzhoulive.domain.BuildingsExample;
import cn.jingzhoulive.domain.BuildingsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuildingsMapper {
    int countByExample(BuildingsExample example);

    int deleteByExample(BuildingsExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(BuildingsWithBLOBs record);

    int insertSelective(BuildingsWithBLOBs record);

    List<BuildingsWithBLOBs> selectByExampleWithBLOBs(BuildingsExample example);

    List<Buildings> selectByExample(BuildingsExample example);

    BuildingsWithBLOBs selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") BuildingsWithBLOBs record, @Param("example") BuildingsExample example);

    int updateByExampleWithBLOBs(@Param("record") BuildingsWithBLOBs record, @Param("example") BuildingsExample example);

    int updateByExample(@Param("record") Buildings record, @Param("example") BuildingsExample example);

    int updateByPrimaryKeySelective(BuildingsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BuildingsWithBLOBs record);

    int updateByPrimaryKey(Buildings record);
}