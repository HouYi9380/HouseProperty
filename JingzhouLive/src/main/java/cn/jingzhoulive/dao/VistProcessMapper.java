package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.VistProcess;
import cn.jingzhoulive.domain.VistProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VistProcessMapper {
    int countByExample(VistProcessExample example);

    int deleteByExample(VistProcessExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(VistProcess record);

    //add by zm
    int insertVP(VistProcess record);

    int insertSelective(VistProcess record);

    List<VistProcess> selectByExample(VistProcessExample example);

    VistProcess selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") VistProcess record, @Param("example") VistProcessExample example);

    int updateByExample(@Param("record") VistProcess record, @Param("example") VistProcessExample example);

    int updateByPrimaryKeySelective(VistProcess record);

    int updateByPrimaryKey(VistProcess record);

    int progressSumByGuider(int guider, int  progress);

//    List<VistProcess> selectAllLastProcess(Integer guider);
}