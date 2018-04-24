package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.Operationlogs;
import cn.jingzhoulive.domain.OperationlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationlogsMapper {
    int countByExample(OperationlogsExample example);

    int deleteByExample(OperationlogsExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Operationlogs record);

    int insertSelective(Operationlogs record);

    List<Operationlogs> selectByExample(OperationlogsExample example);

    Operationlogs selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Operationlogs record, @Param("example") OperationlogsExample example);

    int updateByExample(@Param("record") Operationlogs record, @Param("example") OperationlogsExample example);

    int updateByPrimaryKeySelective(Operationlogs record);

    int updateByPrimaryKey(Operationlogs record);
}