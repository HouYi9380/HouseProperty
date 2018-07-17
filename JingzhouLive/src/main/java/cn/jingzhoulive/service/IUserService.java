package cn.jingzhoulive.service;


import cn.jingzhoulive.domain.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by zhangmin on 18-4-22.
 */
public interface IUserService {
    public User selectUser(int uid);
    public User selectUserByPhone(String phone);
    public int insertUser(User user);
    public int updateUser(User user);
    public User getUserByPhoneAndPwd(String phone, String pwd);
    public int updateUserByUidAndLately(int uid, int lately);
    public PageInfo<User> selectAllPageable(int page, int pageSize);
    public  PageInfo<User> selectUserBySelected(String keywork, Integer registType,
                                                String startTime, String endTime, Integer page, int pageLenth);
    int updateByPrimaryKeySelective(User record);
    int getNumInviteUserByUid(int uid);
    int getNumValideateUserByUid(int uid);

    public PageInfo<User> selectInviteByType(Integer type,Integer guider,Integer page, int pageSize);
}
