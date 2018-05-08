package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.CommissionPolicyMapper;
import cn.jingzhoulive.domain.CommissionPolicy;
import cn.jingzhoulive.domain.CommissionPolicyExample;
import cn.jingzhoulive.service.ICommissonPolicyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-5-3.
 */
@Service
public class CommissionPolicyServiceImpl implements ICommissonPolicyService{
    @Autowired
    private CommissionPolicyMapper mapper;

    public int insert(CommissionPolicy record) {
        return mapper.insert(record) ;
    }

    public int updateByPrimaryKeyWithBLOBs(CommissionPolicy record) {
        return mapper.updateByPrimaryKeyWithBLOBs(record);
    }

    public PageInfo<CommissionPolicy> selectAll(int page, int pageSize) {
        CommissionPolicyExample example = new CommissionPolicyExample();
        CommissionPolicyExample.Criteria criteria = example.createCriteria();
//        if(keywork != null)
//            criteria.and(keywork);

        PageHelper.startPage(page, pageSize);
        List<CommissionPolicy> list = mapper.selectByExampleWithBLOBs(example);
        PageInfo<CommissionPolicy> p=new PageInfo<CommissionPolicy>(list);
        return p;
    }
}
