package cn.jingzhoulive.dao;

import cn.jingzhoulive.domain.Sms;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangmin on 18-4-25.
 */
@Repository
public interface ISMSDao {
    // 新建一条短信验证码
    int newSMS(Sms sms);
    // 获取最后一条短信验证码
    Sms getLastSMSFromType(String phone, int type);
}
