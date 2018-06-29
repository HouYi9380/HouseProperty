package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.Manager;
import cn.jingzhoulive.service.IManagerService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.CommonUtils;
import cn.jingzhoulive.utils.DateUtils;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-4-26.
 */
@RestController
@RequestMapping("/managers")
public class ManagerController {

    @Autowired
    private IManagerService service;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam String phone,
                        @RequestParam String pwd,
                        HttpSession httpSession){
        Manager manager = service.checkUser(phone, pwd);
        if(manager != null){
            List<Manager> managers = new ArrayList<Manager>();
            managers.add(manager);
            httpSession.setAttribute(CommonUtils.S_ManagerId, manager.getMid());
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", managers);
        }
        return BackJsonUtils.getInstance().getBackJsonUtils(false, "用户名或密码错误", null);
    }

    @RequestMapping("/loginout")
    @ResponseBody
    public String loginOut(HttpSession session){
        session.invalidate();
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    /**
     * 修改用户信息，成功返回用户数据
     * @param mid
     * @param name
     * @param nick
     * @param position
     * @return
     */

    @RequestMapping("/extend")
    @ResponseBody
    public String modefyUserInfo(@RequestParam Integer mid,
                                 @RequestParam (required = false) String name,
                                 @RequestParam (required = false) String nick,
                                 @RequestParam (required = false) String position){
        if(name == null && nick == null && position == null || mid == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "信息不能为空", null);

        Manager manager = new Manager();
        manager.setMid(mid);
        manager.setName(name);
        manager.setNick(nick);
        manager.setPositon(position);
        Manager backManager = service.updateByPrimaryKeySelective(manager);
        if(backManager == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "更新失败", null);
        List<Manager> managers = new ArrayList<Manager>();
        managers.add(backManager);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", managers);
    }

    @RequestMapping("/changepwd")
    @ResponseBody
    public String changePwd(Integer mid, String prePwd, String newPwd){
        Manager manager =service.getManagerByPrimaryKey(mid);
        if(manager == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "用户不存在", null);
        if(!manager.getPwd().equals(prePwd))
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "用户密码错误", null);
        manager.setPwd(newPwd);
        if(service.updateManager(manager) <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "更新密码失败", null);
        List<Manager> managers = new ArrayList<Manager>();
        managers.add(manager);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", managers);
    }

    @RequestMapping("/list")
    @ResponseBody
    public String getList(@RequestParam(required = false) String keyword,
                          int page,
                          int length){

        PageInfo<Manager> managerPageInfo = service.selectUserBySelected(keyword, page, length);

        System.out.println("back:" + managerPageInfo);

        if (managerPageInfo != null) {
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", managerPageInfo);
        } else {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(String name,
                      String phone,
                      String positon){

        Manager manager = new Manager();
        manager.setName(name);
        manager.setPhone(phone);
        manager.setPwd("123456");
        manager.setPower(2);
        manager.setPositon(positon);
        manager.setAvailability(1);
        manager.setCreateTime(DateUtils.getSystemTime());
        manager.setChangTime(DateUtils.getSystemTime());
        int insertBack = service.insert(manager);
        if(insertBack < 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "添加失败", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String setInvalid(Integer mid,
                             Integer onemid){
        Manager manager = new Manager();
        manager.setMid(onemid);
        manager.setAvailability(2); // 无效
        Manager updateBack = service.updateByPrimaryKeySelective(manager);
        if(updateBack == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "删除失败", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

    @RequestMapping("/recovery")
    @ResponseBody
    public String resetPwd(Integer mid,
                           Integer onemid){
        Manager manager = new Manager();
        manager.setMid(onemid);
        manager.setPwd("123456"); // 无效
        Manager updateBack = service.updateByPrimaryKeySelective(manager);
        if(updateBack == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "删除失败", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
    }

}
