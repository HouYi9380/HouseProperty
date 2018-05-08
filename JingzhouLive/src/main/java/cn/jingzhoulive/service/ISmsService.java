package cn.jingzhoulive.service;

import cn.jingzhoulive.domain.Sms;

/**
 * Created by zhangmin on 18-4-25.
 */
public interface ISmsService {
    // 新建一条短信验证码
    public int newSMS(Sms sms);
    // 获取最后一条短信验证码
    public Sms getLastSMSFromType(String phone, int type); // type = 1 登陆短信验证
}
