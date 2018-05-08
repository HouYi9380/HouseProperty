package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.CommissionProcessMapper;
import cn.jingzhoulive.domain.CommissionProcess;
import cn.jingzhoulive.domain.CommissionProcessExample;
import cn.jingzhoulive.service.ICommissionProcessService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-5-3.
 */
@Service
public class CommissionProcessServiceImpl implements ICommissionProcessService{

    @Autowired
    private CommissionProcessMapper cpMapper;

    public int insert(CommissionProcess record) {
        return cpMapper.insert(record);
    }

    public int updateByPrimaryKeySelective(CommissionProcess record) {
        return cpMapper.updateByPrimaryKeySelective(record);
    }

    public PageInfo<CommissionProcess> selectUserBySelected(Integer uid, Integer progress, String keywork, String startTime, String endTime, int page, int pageSize) {
        CommissionProcessExample example = new CommissionProcessExample();
        CommissionProcessExample.Criteria criteria = example.createCriteria();
        if(uid != null)
            criteria.andUidEqualTo(uid);
//        if(keywork != null)
//            criteria.and(keywork);
        if(startTime != null)
            criteria.andCreateTimeGreaterThanOrEqualTo(startTime);
        if(endTime != null)
            criteria.andCreateTimeLessThanOrEqualTo(endTime);
        if(progress!= null)
            criteria.andProgressEqualTo(progress);

        PageHelper.startPage(page, pageSize);
        List<CommissionProcess> vistList = cpMapper.selectByExample(example);
        PageInfo<CommissionProcess> p=new PageInfo<CommissionProcess>(vistList);
        return p;
    }

    public long priceSumByProgress(Integer uid, Integer progress) {
        return cpMapper.priceSumByProgress(uid, progress);
    }
}
