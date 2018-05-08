package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.CommissionProcess;
import com.github.pagehelper.PageInfo;

/**
 * Created by zhangmin on 18-5-3.
 */
public interface ICommissionProcessService {
    int insert(CommissionProcess record);

    int updateByPrimaryKeySelective(CommissionProcess record);

    PageInfo<CommissionProcess> selectUserBySelected(Integer uid, Integer progress, String keywork,
                                                            String startTime, String endTime, int page, int pageSize);
    // 统计佣金
    long priceSumByProgress(Integer uid, Integer progress);
}
