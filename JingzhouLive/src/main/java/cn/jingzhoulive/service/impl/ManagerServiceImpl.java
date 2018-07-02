package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.ManagerMapper;
import cn.jingzhoulive.domain.Manager;
import cn.jingzhoulive.domain.ManagerExample;
import cn.jingzhoulive.service.IManagerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmin on 18-4-26.
 */
@Service
public class ManagerServiceImpl implements IManagerService{
    @Autowired
    private ManagerMapper managerMapper;

    /**
     * 验证管理员用户
     * @param phone
     * @param pwd
     * @return true: 用户存在
     */
    public Manager checkUser(String phone, String pwd) {
        ManagerExample example = new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);
        criteria.andPwdEqualTo(pwd);
        List<Manager> managerList = managerMapper.selectByExample(example);
        if(managerList == null){
            System.out.println("managerList = null");
            return null;
        }
        if(managerList.size() == 0) {
            System.out.println("managerList size = 0");
            return null;
        }
        return managerList.get(0);
    }


    public Manager updateByPrimaryKeySelective(Manager manager) {
        if(manager == null)
            return null;
        if(manager.getMid() == null)
            return null;
        int back = managerMapper.updateByPrimaryKeySelective(manager);
        if(back <= 0)
            return null;
        return this.getManagerByPrimaryKey(manager.getMid());
    }

    public Manager getManagerByPrimaryKey(int mid){
        return managerMapper.selectByPrimaryKey(mid);
    }

    public int updateManager(Manager manager) {
        return managerMapper.updateByPrimaryKey(manager);
    }

    public int insert(Manager record) {
        return managerMapper.insert(record);
    }

    public PageInfo<Manager> selectUserBySelected(String keyword, int page, int pageSize) {
        System.out.println("page:" + page);
        System.out.println("pageSize:" + pageSize);
        System.out.println("keyword" + keyword);
        ManagerExample example= new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        if(keyword != null && (!keyword.isEmpty())) {
            criteria.andPhoneLike(keyword);
            System.out.println("keyWorkd != null");
        }

        PageHelper.startPage(page, pageSize);
        List<Manager> vistList = managerMapper.selectByExample(example);
        System.out.println("vistList:" + vistList);
        PageInfo<Manager> p=new PageInfo<Manager>(vistList);
//        System.out.println("p:" + p);
        return p;
    }
}
