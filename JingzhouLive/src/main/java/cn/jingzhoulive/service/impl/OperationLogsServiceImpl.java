package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.OperationlogsMapper;
import cn.jingzhoulive.domain.Operationlogs;
import cn.jingzhoulive.domain.OperationlogsExample;
import cn.jingzhoulive.service.IOperationLogsService;
import cn.jingzhoulive.utils.DateUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-7-8.
 */
@Service
public class OperationLogsServiceImpl implements IOperationLogsService{
    @Autowired
    OperationlogsMapper mapper;

    @Override
    public int addLog(String content, Integer mid, Integer type, String table) {
        Operationlogs operationLogs = new Operationlogs();
        operationLogs.setContent(content);
        operationLogs.setMid(mid);
        operationLogs.setType(type);
        operationLogs.setObject(table);
        String time = DateUtils.getSystemTime();
        operationLogs.setCreateTime(time);

        int back = mapper.insert(operationLogs);
        if(back <= 0){
            System.out.println("addLogs error");
            System.out.println("addLogs error");
            System.out.println("addLogs error");
            System.out.println("addLogs error");
        }
        return back;
    }

    @Override
    public PageInfo<Operationlogs> getList(Integer action, String starttime, String endtime, int page, int length) {

        OperationlogsExample example = new OperationlogsExample();
        OperationlogsExample.Criteria criteria = example.createCriteria();
        if(action != null){
            criteria.andTypeEqualTo(action);
        }
        if(starttime != null && (!starttime.isEmpty())){
            criteria.andCreateTimeGreaterThanOrEqualTo(starttime);
        }
        if(endtime!= null && (!endtime.isEmpty())){
            criteria.andCreateTimeLessThanOrEqualTo(starttime);
        }
        PageHelper.startPage(page, length);
        List<Operationlogs> infoList = mapper.selectByExample(example);
        System.out.println("listsize:" + infoList.size());
        PageInfo<Operationlogs> p=new PageInfo<Operationlogs>(infoList);
        return p;
    }
}
