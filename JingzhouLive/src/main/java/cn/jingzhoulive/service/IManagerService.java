package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.Manager;
import com.github.pagehelper.PageInfo;

/**
 * Created by zhangmin on 18-4-26.
 */
public interface IManagerService {

    Manager checkUser(String phone, String pwd);

    Manager updateByPrimaryKeySelective(Manager manager);

    Manager getManagerByPrimaryKey(int mid);

    int updateManager(Manager manager);

    int insert(Manager record);

    public PageInfo<Manager> selectUserBySelected(String keyword, int page, int pageSize);
}
