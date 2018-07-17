package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.Operationlogs;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by zhangmin on 18-7-8.
 */
public interface IOperationLogsService {
    int addLog(String content, Integer mid, Integer type, String table);
    PageInfo<Operationlogs> getList(Integer action, String starttime, String endtime, int page, int length);
}
