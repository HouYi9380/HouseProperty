package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.VistProcessMapper;
import cn.jingzhoulive.domain.UserExample;
import cn.jingzhoulive.domain.VistProcess;
import cn.jingzhoulive.domain.VistProcessExample;
import cn.jingzhoulive.service.IVisitProcessService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-5-3.
 */
@Service
public class VisitProcessServiceImpl implements IVisitProcessService{

    @Autowired
    private VistProcessMapper processMapper;

    public int insert(VistProcess record) {
        return processMapper.insert(record);
    }

    public PageInfo<VistProcess> selectUserBySelected(Integer isCheck, String keywork, String startTime, String endTime, Integer page, Integer pageLenth) {
        VistProcessExample example = new VistProcessExample();
        VistProcessExample.Criteria criteria = example.createCriteria();
//        if(keywork != null)
//            criteria.and(keywork);
        if(startTime != null)
            criteria.andCreateTimeGreaterThanOrEqualTo(startTime);
        if(endTime != null)
            criteria.andCreateTimeLessThanOrEqualTo(endTime);
        if(isCheck != null)
            criteria.andIsCheckEqualTo(isCheck);

        PageHelper.startPage(page, pageLenth);
        List<VistProcess> vistList = processMapper.selectByExample(example);
        PageInfo<VistProcess> p=new PageInfo<VistProcess>(vistList);
        return p;
    }

    public int updateByPrimaryKeySelective(VistProcess record) {
        return processMapper.updateByPrimaryKeySelective(record);
    }

    public int progressSumByGuider(int guider, int progress) {
        return processMapper.progressSumByGuider(guider, progress);
    }

    public PageInfo<VistProcess> selectAllLastProcess(Integer guider) {
//        List<ProprocessMapper.selectAllLastProcess(guider);
        return null;
    }
}
