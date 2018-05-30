package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.Information;
import com.github.pagehelper.PageInfo;

/**
 * Created by zhangmin on 18-4-28.
 */
public interface IInformationService {
    public PageInfo<Information> selectUserBySelected(String keywork, String areaId, Integer type,
                                                      String startTime, String endTime, Integer page, int pageLenth);
    public int insert(Information record);

    int updateByPrimaryKeyWithBLOBs(Information record);

    int updateByPrimaryKeySelected(Information record);

    int deleteByPrimaryKey(Integer iid);

    Information selectByPrimaryKey(Integer iid);
}
