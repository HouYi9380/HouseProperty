package cn.jingzhoulive.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by zhangmin on 18-5-17.
 */
@RestController
@RequestMapping("/session")
public class SessionTestController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(HttpSession httpSession){
        httpSession.setAttribute("user", "123456");
        return "success";
    }

    @RequestMapping("/getSession")
    @ResponseBody
    public String getSession(HttpSession httpSession){
        System.out.println("session:" + httpSession.getAttribute("user"));
       return "true";
    }
}
