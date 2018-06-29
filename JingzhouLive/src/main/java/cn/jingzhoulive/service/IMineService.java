package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.MyCommission;
import cn.jingzhoulive.domain.MyInvite;
import cn.jingzhoulive.domain.MyRecommend;
import cn.jingzhoulive.domain.MySecondRecommend;

import java.util.List;

/**
 * Created by zhangmin on 18-6-20.
 */
public interface IMineService {

    List<MyCommission> getAllMyCommission(int uid);

    List<MyInvite> getAllMyInvite(int uid);

    List<MyRecommend> getAllMyRecommend(int uid);

    List<MySecondRecommend> getAllMySecondRecommend(int uid);
}
