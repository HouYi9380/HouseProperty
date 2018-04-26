package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.User;
import org.springframework.stereotype.Repository;


/**
 * Created by zhangmin on 18-4-20.
 */
@Repository
public interface IUserDao {
    User selectUser(int uid);
}
