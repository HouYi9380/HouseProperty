package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.Operationlogs;
import cn.jingzhoulive.service.IOperationLogsService;
import cn.jingzhoulive.utils.BackJsonUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-7-8.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/operationlogs")
public class OperationLogsController {

    @Autowired
    private IOperationLogsService operationLogsService;

    @RequestMapping("/list")
    public  String list(@RequestParam(required = false) Integer action,
                        @RequestParam(required = false) String starttime,
                        @RequestParam(required = false) String endtime,
                        int page,
                        int length){
        PageInfo<Operationlogs> operationlogsPageInfo = operationLogsService.getList(action, starttime, endtime, page, length);
        if(operationlogsPageInfo == null){
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
        List<PageInfo<Operationlogs>> list = new ArrayList<PageInfo<Operationlogs>>();
        list.add(operationlogsPageInfo);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", list);
    }

}
