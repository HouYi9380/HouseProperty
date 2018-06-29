package cn.jingzhoulive.controllers;

import cn.jingzhoulive.domain.Sms;
import cn.jingzhoulive.service.ISmsService;
import cn.jingzhoulive.utils.BackJsonUtils;
import cn.jingzhoulive.utils.DataUtils;
import cn.jingzhoulive.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangmin on 18-4-25.
 */
@RestController
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private ISmsService iSmsService;

    /**
     * 用户 获取短信验证码
     * @param phone
     * @return
     */
    @RequestMapping(value = "/logincode")
    @ResponseBody
    public String sendSms(@RequestParam String phone){
        String code = DataUtils.getRandomInt(6);
        Sms sms = new Sms();
        sms.setCode(code);
        sms.setPhone(phone);
        sms.setType(1);
        sms.setTime(DateUtils.getLongSystemTime());
        int ret = iSmsService.newSMS(sms);

        String  back;
        // 插入数据库成功
        if(ret >0){
            back = BackJsonUtils.getInstance().getBackJsonUtils(true, "success", null);
        }else { //  插入数据库失败
            back = BackJsonUtils.getInstance().getBackJsonUtils(false, "添加数据失败", null);
        }
        return back;
    }
}
