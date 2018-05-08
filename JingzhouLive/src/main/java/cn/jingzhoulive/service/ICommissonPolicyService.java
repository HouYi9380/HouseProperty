package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.CommissionPolicy;
import com.github.pagehelper.PageInfo;

/**
 * Created by zhangmin on 18-5-3.
 */
public interface ICommissonPolicyService {

    int insert(CommissionPolicy record);
    int updateByPrimaryKeyWithBLOBs(CommissionPolicy record);
    PageInfo<CommissionPolicy> selectAll(int page, int pageSize);
}
