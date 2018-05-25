package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.IUserDao;
import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.domain.UserExample;
import cn.jingzhoulive.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-4-22.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User selectUser(int userId) {
        return this.userDao.selectUser(userId);
    }

    public User selectUserByPhone(String phone) {
        return userDao.selectUserByPhone(phone);
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public User getUserByPhoneAndPwd(String phone, String pwd) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);
        criteria.andPwdEqualTo(pwd);
        List<User> managerList = userDao.selectByExample(example);
        return (managerList != null) ? managerList.get(0): null;
    }

    public int updateUserByUidAndLately(int uid, int lately) {
        User user = new User();
        user.setUid(uid);
        user.setLately(lately);
        return userDao.updateByPrimaryKeySelective(user);
    }

    public PageInfo<User> selectAllPageable(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<User> userList = userDao.selectByList();
        PageInfo<User> p=new PageInfo<User>(userList);
        return p;
    }

    public PageInfo<User> selectUserBySelected(String keywork, Integer registType, String startTime,
                                               String endTime, Integer page, int pageSize) {

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if(keywork != null && (!keywork.isEmpty()))
            criteria.andPhoneLike(keywork);
        if(startTime != null && (!startTime.isEmpty()))
            criteria.andCreateTimeGreaterThanOrEqualTo(startTime);
        if(endTime != null && (!endTime.isEmpty()))
            criteria.andCreateTimeLessThanOrEqualTo(endTime);
        if(registType != null) {
            criteria.andRegistTypeEqualTo(registType);
            System.out.println("registType is not null");
        }

        PageHelper.startPage(page, pageSize);
        List<User> userList = userDao.selectByExample(example);
        PageInfo<User> p=new PageInfo<User>(userList);
        return p;
    }

    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    public int getNumInviteUserByUid(int uid) {
        return userDao.getNumInviteUserByUid(uid);
    }

    public int getNumValideateUserByUid(int uid) {
        return userDao.getNumValideateUserByUid(uid);
    }
}
