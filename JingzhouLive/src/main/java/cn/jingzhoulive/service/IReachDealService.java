package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.ReachDeal;
import cn.jingzhoulive.domain.ReachDealExample;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-5-3.
 */
@Service
public interface IReachDealService {

    int insert(ReachDeal record);

    ReachDeal selectByPrimaryKey(Integer rid);

    public PageInfo<ReachDeal> selectUserBySelected(String keyword, String startTime, String endTime,
                                                    int page, int pageSize);
}
