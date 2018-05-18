package cn.jingzhoulive.controllers;

import cn.jingzhoulive.utils.CommonUtils;
import com.sun.istack.internal.logging.Logger;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by zhangmin on 18-5-18.
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

//    static String[] allowUrls =new String[]{"/toLogin","/login"};
    //日志
    protected Logger log = Logger.getLogger(getClass());

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handle) throws Exception {

        //创建session
        HttpSession session =request.getSession();

//        String managerId = (String)session.getAttribute(CommonUtils.S_ManagerId);
//        System.out.println("filter-managerId:" + managerId);
//
//        if(managerId !=null)
//        {
//            return true;
//        }
//        //重定向
//        response.sendRedirect(request.getContextPath()+"/error/unlogin");

        return true;


    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, @Nullable Exception ex) throws Exception {

    }
}
