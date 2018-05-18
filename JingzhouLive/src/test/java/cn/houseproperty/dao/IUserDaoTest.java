package cn.houseproperty.dao;

import cn.jingzhoulive.dao.BuildingsMapper;
import cn.jingzhoulive.dao.IUserDao;
import cn.jingzhoulive.dao.VistProcessMapper;
import cn.jingzhoulive.domain.User;
import cn.jingzhoulive.domain.VistProcess;
import cn.jingzhoulive.service.IBuildingService;
import cn.jingzhoulive.utils.DateUtils;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * Created by zhangmin on 18-4-22.
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-*.xml"})
public class IUserDaoTest {
    @Autowired
    private IUserDao userDao;

    @Autowired
    private BuildingsMapper buildingsMapper;

    @Autowired
    private VistProcessMapper mapper;

    @Test
    public void testSelectUser() throws Exception {
        int id = 10000;
        User user = userDao.selectUser(id);
        System.out.println(user.getName());
//        System.out.println("123");
    }

    @Test
    public void testPageHelp(){
        PageHelper.startPage(0, 10);
        List<User> userList = userDao.selectByList();
        PageInfo<User> p=new PageInfo<User>(userList);
        System.out.println(JSON.toJSONString(p));
    }

    @Test
    public void testInsertAndBack(){
        System.out.println("111");
        VistProcess vistProcess = new VistProcess();
        vistProcess.setGuider(1);
        vistProcess.setUid(1);
        vistProcess.setBid(1);
        vistProcess.setProgress(1); // 未到访
        vistProcess.setIsCheck(1);
        vistProcess.setAvailability(1);
        String curTime = DateUtils.getSystemTime();
        vistProcess.setCreateTime(curTime);
        vistProcess.setChangTime(curTime);
        int back = mapper.insertVP(vistProcess);
        System.out.println("back:" + back);
        System.out.println(vistProcess.getVid());
    }



}
