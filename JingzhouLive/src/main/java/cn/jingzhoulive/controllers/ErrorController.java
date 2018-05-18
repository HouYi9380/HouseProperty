package cn.jingzhoulive.controllers;

import cn.jingzhoulive.utils.BackJsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangmin on 18-5-18.
 */
@RequestMapping("/error")
@RestController
public class ErrorController {
    @RequestMapping("/unlogin")
    @ResponseBody()
    public String unLoginError(){
        return BackJsonUtils.getInstance().getBackJsonUtils(false, "未登陆", null);
    }
}
