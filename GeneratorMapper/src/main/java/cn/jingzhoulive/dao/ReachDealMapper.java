package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.ReachDeal;
import cn.jingzhoulive.domain.ReachDealExample;
import cn.jingzhoulive.domain.ReachDealWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReachDealMapper {
    int countByExample(ReachDealExample example);

    int deleteByExample(ReachDealExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(ReachDealWithBLOBs record);

    int insertSelective(ReachDealWithBLOBs record);

    List<ReachDealWithBLOBs> selectByExampleWithBLOBs(ReachDealExample example);

    List<ReachDeal> selectByExample(ReachDealExample example);

    ReachDealWithBLOBs selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") ReachDealWithBLOBs record, @Param("example") ReachDealExample example);

    int updateByExampleWithBLOBs(@Param("record") ReachDealWithBLOBs record, @Param("example") ReachDealExample example);

    int updateByExample(@Param("record") ReachDeal record, @Param("example") ReachDealExample example);

    int updateByPrimaryKeySelective(ReachDealWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ReachDealWithBLOBs record);

    int updateByPrimaryKey(ReachDeal record);
}