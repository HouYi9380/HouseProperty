package cn.houseproperty.dao;

import cn.jingzhoulive.dao.IUserDao;
import cn.jingzhoulive.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by zhangmin on 18-4-22.
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-*.xml"})
public class IUserDaoTest {
    @Autowired
    private IUserDao userDao;

    @Test
    public void testSelectUser() throws Exception {
        int id = 10000;
        User user = userDao.selectUser(id);
        System.out.println(user.getName());
//        System.out.println("123");
    }
}
