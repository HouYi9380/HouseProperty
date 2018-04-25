package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.IUserDao;
import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
