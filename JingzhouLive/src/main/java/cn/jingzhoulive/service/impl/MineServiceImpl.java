package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.MineMapper;
import cn.jingzhoulive.domain.MyCommission;
import cn.jingzhoulive.domain.MyInvite;
import cn.jingzhoulive.domain.MyRecommend;
import cn.jingzhoulive.domain.MySecondRecommend;
import cn.jingzhoulive.service.IMineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-6-20.
 */
@Service
public class MineServiceImpl implements IMineService{
    @Autowired
    private MineMapper mineMapper;

    @Override
    public List<MyCommission> getAllMyCommission(int uid) {
        return mineMapper.getAllMyCommission(uid);
    }

    @Override
    public List<MyInvite> getAllMyInvite(int uid) {
        return mineMapper.getAllMyInvite(uid);
    }

    @Override
    public List<MyRecommend> getAllMyRecommend(int uid) {
        return mineMapper.getAllMyRecommend(uid);
    }

    @Override
    public List<MySecondRecommend> getAllMySecondRecommend(int uid) {
        return mineMapper.getAllMySecondRecommend(uid);
    }
}
