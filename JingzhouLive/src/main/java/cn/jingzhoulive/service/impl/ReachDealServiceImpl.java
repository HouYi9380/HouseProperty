package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.ReachDealMapper;
import cn.jingzhoulive.domain.ReachDeal;
import cn.jingzhoulive.domain.ReachDealExample;
import cn.jingzhoulive.service.IReachDealService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-5-3.
 */
@Service
public class ReachDealServiceImpl implements IReachDealService{
    @Autowired
    private ReachDealMapper rdMapper;

    public int insert(ReachDeal record) {
        return rdMapper.insert(record);
    }

    public ReachDeal selectByPrimaryKey(Integer rid) {
        return rdMapper.selectByPrimaryKey(rid);
    }

    public PageInfo<ReachDeal> selectUserBySelected(String keyword, String startTime, String endTime, int page, int pageLenth) {
        ReachDealExample example = new ReachDealExample();
        ReachDealExample.Criteria criteria = example.createCriteria();
//        if(keyword != null && (!keyword.isEmpty()))
//            criteria.and(keywork);
        if(startTime != null && (!startTime.isEmpty()))
            criteria.andCreateTimeGreaterThanOrEqualTo(startTime);
        if(endTime != null && (!endTime.isEmpty()))
            criteria.andCreateTimeLessThanOrEqualTo(endTime);

        PageHelper.startPage(page, pageLenth);
        List<ReachDeal> vistList = rdMapper.selectByExample(example);
        System.out.println("vistList:" + vistList.size());
        PageInfo<ReachDeal> p=new PageInfo<ReachDeal>(vistList);
        return p;
    }
}
