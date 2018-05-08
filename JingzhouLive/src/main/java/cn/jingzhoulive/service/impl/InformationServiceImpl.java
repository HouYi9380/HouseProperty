package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.InformationMapper;
import cn.jingzhoulive.domain.Information;
import cn.jingzhoulive.domain.InformationExample;
import cn.jingzhoulive.service.IInformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-4-28.
 */
@Service
public class InformationServiceImpl implements IInformationService {
    @Autowired
    private InformationMapper informationMapper;

    public PageInfo<Information> selectUserBySelected(String keywork, String areaId, Integer type, String startTime, String endTime, Integer page, int pageLenth) {
        InformationExample example = new InformationExample();
        InformationExample.Criteria criteria = example.createCriteria();
        if(keywork != null)
            criteria.andTitleLike(keywork);
        if(startTime != null)
            criteria.andCreateTimeGreaterThanOrEqualTo(startTime);
        if(endTime != null)
            criteria.andCreateTimeLessThanOrEqualTo(endTime);
        if(type != null)
            criteria.andTypeEqualTo(type);
        if(areaId != null)
            criteria.andAreaidEqualTo(areaId);

        PageHelper.startPage(page, pageLenth);
        List<Information> infoList = informationMapper.selectByExampleWithBLOBs(example);
        PageInfo<Information> p=new PageInfo<Information>(infoList);
        return p;
    }

    public int insert(Information record) {
        return informationMapper.insert(record);
    }

    public int updateByPrimaryKeyWithBLOBs(Information record) {
        return informationMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    public int deleteByPrimaryKey(Integer iid) {
        return informationMapper.deleteByPrimaryKey(iid);
    }
}
