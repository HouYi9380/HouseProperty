package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.CommissionProcess;
import cn.jingzhoulive.domain.CommissionProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommissionProcessMapper {
    int countByExample(CommissionProcessExample example);

    int deleteByExample(CommissionProcessExample example);

    int deleteByPrimaryKey(Integer cpid);

    int insert(CommissionProcess record);

    int insertSelective(CommissionProcess record);

    List<CommissionProcess> selectByExampleWithBLOBs(CommissionProcessExample example);

    List<CommissionProcess> selectByExample(CommissionProcessExample example);

    CommissionProcess selectByPrimaryKey(Integer cpid);

    int updateByExampleSelective(@Param("record") CommissionProcess record, @Param("example") CommissionProcessExample example);

    int updateByExampleWithBLOBs(@Param("record") CommissionProcess record, @Param("example") CommissionProcessExample example);

    int updateByExample(@Param("record") CommissionProcess record, @Param("example") CommissionProcessExample example);

    int updateByPrimaryKeySelective(CommissionProcess record);

    int updateByPrimaryKeyWithBLOBs(CommissionProcess record);

    int updateByPrimaryKey(CommissionProcess record);
}