package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.CommissionPolicy;
import cn.jingzhoulive.domain.CommissionPolicyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommissionPolicyMapper {
    int countByExample(CommissionPolicyExample example);

    int deleteByExample(CommissionPolicyExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(CommissionPolicy record);

    int insertSelective(CommissionPolicy record);

    List<CommissionPolicy> selectByExampleWithBLOBs(CommissionPolicyExample example);

    List<CommissionPolicy> selectByExample(CommissionPolicyExample example);

    CommissionPolicy selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") CommissionPolicy record, @Param("example") CommissionPolicyExample example);

    int updateByExampleWithBLOBs(@Param("record") CommissionPolicy record, @Param("example") CommissionPolicyExample example);

    int updateByExample(@Param("record") CommissionPolicy record, @Param("example") CommissionPolicyExample example);

    int updateByPrimaryKeySelective(CommissionPolicy record);

    int updateByPrimaryKeyWithBLOBs(CommissionPolicy record);

    int updateByPrimaryKey(CommissionPolicy record);
}