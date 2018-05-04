package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.ReachDeal;
import cn.jingzhoulive.domain.ReachDealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReachDealMapper {
    int countByExample(ReachDealExample example);

    int deleteByExample(ReachDealExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(ReachDeal record);

    int insertSelective(ReachDeal record);

    List<ReachDeal> selectByExample(ReachDealExample example);

    ReachDeal selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") ReachDeal record, @Param("example") ReachDealExample example);

    int updateByExample(@Param("record") ReachDeal record, @Param("example") ReachDealExample example);

    int updateByPrimaryKeySelective(ReachDeal record);

    int updateByPrimaryKey(ReachDeal record);
}