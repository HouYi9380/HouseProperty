package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.Sms;
import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.domain.VistProcess;
import cn.jingzhoulive.service.ISmsService;
import cn.jingzhoulive.service.IUserService;
import cn.jingzhoulive.service.IVisitProcessService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.DateUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-4-24.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private ISmsService smsService;

    @Autowired
    private IVisitProcessService processService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    @ResponseBody
    public String getUser() {
        User user = userService.selectUser(10000);
        System.out.println("name:" + user.getName());
        System.out.println("1234");
        String json = JSONObject.toJSONString(user);
        System.out.println("json:" + json);
        System.out.println("123455");
        return json;
    }

    /**
     * 用户首页带验证码登陆
     * 首先验证验证码是否在5min钟内；
     * 其次用户不存在，保存phone及pwd，用户存在，则更新密码
     *
     * @param phone
     * @param code
     * @param pwd
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(String phone,
                        String code,
                        String pwd) {

        boolean state = false;
        String msg;
        List<User> data = null;
        // check phone and code;
        Sms sms = smsService.getLastSMSFromType(phone, 1); // type = 1 短信验证
        if (sms != null) {
            // 判断时间是否是5min内
            int in = DateUtils.checkTimeInSecond(300, sms.getTime());
            if (in < 0) {
                state = false;
                msg = "验证码过期";
            } else {
                User user = userService.selectUserByPhone(phone);
                if (user == null) { //添加用户
                    User newUser = new User();
                    user.setPhone(phone);
                    user.setPwd(pwd);
                    user.setCode(code);
                    user.setCreateTime(DateUtils.getSystemTime());
                    user.setChangTime(DateUtils.getSystemTime());
                    int insertUserBack = userService.insertUser(newUser);
                    if (insertUserBack > 0) {
                        state = true;
                        msg = "success";
                        data = new ArrayList<User>();
                        data.add(user);
                    } else {
                        state = false;
                        msg = "添加用户失败";
                    }
                } else { //更新密码
                    if (user.getPwd().equals(pwd)) { //密码一致，成功
                        state = true;
                        msg = "success";
                        data = new ArrayList<User>();
                        data.add(user);
                    } else { // 密码不一致，更新密码
                        user.setPwd(pwd);
                        user.setChangTime(DateUtils.getSystemTime());
                        if (userService.updateUser(user) > 0) {
                            state = true;
                            msg = "success";
                            data = new ArrayList<User>();
                            data.add(user);
                        } else {
                            state = false;
                            msg = "更新密码出错";
                        }
                    }
                }
            }
        } else {
            state = false;
            msg = "验证码不存在";
        }
        return BackJsonUtils.getInstance().getBackJsonUtils(state, msg, data);
    }

    /**
     * 自动登陆，校验用户名,密码
     *
     * @param phone
     * @param pwd
     * @return
     */
    @RequestMapping("/aulogin")
    @ResponseBody
    public String autoLogin(@RequestParam String phone,
                            @RequestParam String pwd) {
        User user = userService.getUserByPhoneAndPwd(phone, pwd);
        if (user == null) {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "用户不存在", null);
        }
        List<User> userList = new ArrayList<User>();
        userList.add(user);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", userList);
    }

    /**
     * 更新最近访问模块，是新房？二手房？还是出租房？
     *
     * @param uid
     * @param lately
     * @return
     */
    @RequestMapping("/lately")
    @ResponseBody
    public String lastVisited(int uid, int lately) {
        if (userService.updateUserByUidAndLately(uid, lately) > 0) {
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "sucdess", null);
        }
        return BackJsonUtils.getInstance().getBackJsonUtils(false, "更新失败", null);
    }


    /**
     * 按条件查询所有用户
     *
     * @param mid
     * @param keyword
     * @param registType
     * @param startTime
     * @param endTime
     * @param page
     * @param length
     * @return
     */
    @RequestMapping("/userlist")
    @ResponseBody
    public String getUserList(int mid,
                              @RequestParam(required = false) String keyword,
                              @RequestParam(required = false) Integer registType,
                              @RequestParam(required = false) String startTime,
                              @RequestParam(required = false) String endTime,
                              @RequestParam(required = true) Integer page,
                              @RequestParam(required = true) Integer length) {

        PageInfo<User> userPageInfo = userService.selectUserBySelected(keyword, registType, startTime, endTime, page, length);

        List<PageInfo<User>> userPages = null;
        if (userPageInfo != null) {
            userPages = new ArrayList<PageInfo<User>>();
            userPages.add(userPageInfo);
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", userPages);
        } else {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "查询失败", null);
        }
    }


    /**
     * 根据uid查询用户
     *
     * @param mid
     * @param uid
     */
    @RequestMapping("/onedetail")
    @ResponseBody
    public String getUserById(int mid,
                              int uid) {
        User user = userService.selectUser(uid);
        if (user == null) {
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "用户不存在", null);
        }
        List<User> users = new ArrayList<User>();
        users.add(user);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", users);
    }


    @RequestMapping("/extend")
    @ResponseBody
    public String setExtentendInfo(int uid,
                                   String phone,
                                   String name,
                                   String nick,
                                   String icid,
                                   Integer paytype,
                                   String payid,
                                   String residence) {

        User user = new User();
        user.setUid(uid);
        user.setPhone(phone);
        user.setName(name);
        user.setNick(nick);
        user.setIcid(icid);
        user.setPayType(paytype);
        user.setPayId(payid);
        user.setResidence(residence);
        int updateBack = userService.updateByPrimaryKeySelective(user);
        if (updateBack > 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(false, "更新失败", null);
    }


    /**
     * 用户滚动信息
     *
     * @param uid
     * @return
     */
    @RequestMapping("/rolling")
    @ResponseBody
    public String rolling(Integer uid) {
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "用户滚动信息,预留", null);
    }

    /**
     * 邀请成为用户
     *
     * @param phone
     * @param pwd
     * @param guider
     * @return
     */
    public String invite(String phone,
                         String pwd,
                         Integer guider) {
        boolean state = false;
        String msg;
        List<User> list = null;
        User user = userService.selectUserByPhone(phone);
        if (user == null) { //添加用户
            User newUser = new User();
            user.setPhone(phone);
            user.setPwd(pwd);
            user.setGuider(guider);
            user.setRegistType(2);
            user.setCreateTime(DateUtils.getSystemTime());
            user.setChangTime(DateUtils.getSystemTime());
            int insertUserBack = userService.insertUser(newUser);
            if (insertUserBack > 0) {
                state = true;
                msg = "success";
                list = new ArrayList<User>();
                list.add(user);
            } else {
                state = false;
                msg = "添加用户失败";
            }
            return BackJsonUtils.getInstance().getBackJsonUtils(state, msg, list);
        }
        else
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "用户已存在", null);
    }

    /**
     * 推荐,要测试数据回滚
     * @param phone
     * @param icid
     * @param name
     * @param bid
     * @param guider
     * @return
     */
    @RequestMapping("/recommend")
    @ResponseBody
    public String recommend(String phone,
                            String pwd,
                            String icid,
                            String name,
                            Integer bid,
                            Integer guider){
        // 查guider是否存在，若不存在返回错误信息
        User guiderUser = userService.selectUser(guider);
        if(guiderUser == null)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "推荐者不存在", null);
        //查是否phone存在
        String curTime = DateUtils.getSystemTime();
        Integer uid = null;
        User user = userService.selectUserByPhone(phone);
        if(user != null){
            //如果phone存在，并且guider存在，返回错误信息
            if(user.getGuider() != null) {
                if(guider.equals(user.getGuider()))
                    return BackJsonUtils.getInstance().getBackJsonUtils(false, "推不要重复推荐", null);
                return BackJsonUtils.getInstance().getBackJsonUtils(false, "用户已存在推荐者", null);
            }
            //如果phone存在，并且guider不存在，将guider设置，并生在访问流程表里生成一条数据
            user.setGuider(guider);
            user.setIcid(icid);
            user.setName(name);
            user.setRegistType(3);
            int updateBack = userService.updateUser(user);
            if(updateBack <= 0)
                return BackJsonUtils.getInstance().getBackJsonUtils(false, "更新被推荐者失败", null);
            uid = user.getUid();

        }else { // 用户不存在
            User newUser = new User();
            newUser.setPhone(phone);
            newUser.setPwd(pwd);
            newUser.setCode("0");
            user.setRegistType(3);
            newUser.setCreateTime(curTime);
            newUser.setChangTime(curTime);
            int insertUserBack = userService.insertUser(newUser);
            if(insertUserBack <= 0)
                return BackJsonUtils.getInstance().getBackJsonUtils(false, "添加用户失败", null);
            uid = newUser.getUid();
        }

        // 添加访问流程
        VistProcess vistProcess = new VistProcess();
        vistProcess.setGuider(guider);
        vistProcess.setUid(user.getUid());
        vistProcess.setBid(bid);
        vistProcess.setProgress(1); // 未到访
        vistProcess.setIsCheck(1);
        vistProcess.setAvailability(1);
        vistProcess.setCreateTime(curTime);
        vistProcess.setChangTime(curTime);
        int insertVP = processService.insert(vistProcess);
        if(insertVP <= 0)
            return BackJsonUtils.getInstance().getBackJsonUtils(false, "访问流程添加失败", null);
        return BackJsonUtils.getInstance().getBackJsonUtils(true, "推荐成功", null);
    }


//wangyan



}
