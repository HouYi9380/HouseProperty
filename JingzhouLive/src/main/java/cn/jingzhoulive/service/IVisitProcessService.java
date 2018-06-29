package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.VistProcess;
import com.github.pagehelper.PageInfo;

/**
 * Created by zhangmin on 18-5-3.
 */
public interface IVisitProcessService {
    int insert(VistProcess record);
    public PageInfo<VistProcess> selectUserBySelected(Integer isCheck, String keywork,
                                                      String startTime, String endTime, Integer page, Integer pageLenth);
    int updateByPrimaryKeySelective(VistProcess record);
    // 到访问人数或未到访问人数
    int progressSumByGuider(int guider, int  progress);
    //查询推荐的楼盘
     PageInfo<VistProcess> selectAllLastProcess(Integer guider);

    VistProcess getFromVid(Integer vid);
}
