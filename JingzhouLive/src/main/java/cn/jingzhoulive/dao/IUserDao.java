package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.domain.UserExample;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by zhangmin on 18-4-20.
 */
@Repository
public interface IUserDao {
    User selectUser(int uid);
    User selectUserByPhone(String phone);
    int insertUser(User user);
    int updateUser(User user);
    User getUserByPhoneAndPwd(String phone, String pwd);
    int updateUserByUidAndLately(int uid, int lately);
    List<User> selectByList();
    List<User> selectByExample(UserExample example);
    int updateByPrimaryKeySelective(User record);
    int getNumInviteUserByUid(int uid);
    int getNumValideateUserByUid(int uid);
}
