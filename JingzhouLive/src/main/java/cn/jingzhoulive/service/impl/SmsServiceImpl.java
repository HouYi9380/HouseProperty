package cn.jingzhoulive.service.impl;

import cn.jingzhoulive.dao.ISMSDao;
import cn.jingzhoulive.domain.Sms;
import cn.jingzhoulive.service.ISmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangmin on 18-4-25.
 */
@Service
public class SmsServiceImpl implements ISmsService{

    @Autowired
    private ISMSDao ismsDao;

    public int newSMS(Sms sms) {
        return ismsDao.newSMS(sms);
    }

    public Sms getLastSMSFromType(String phone, int type) {
        return ismsDao.getLastSMSFromType(phone, type);
    }
}
