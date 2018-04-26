package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.service.IUserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangmin on 18-4-24.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
   private IUserService userService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(){
        User user = userService.selectUser(10000);
        System.out.println("name:" + user.getName());
        System.out.println("1234");
        String json = JSONObject.toJSONString(user);
        System.out.println("json:" + json);
        System.out.println("123455");
        return json;
    }
}
