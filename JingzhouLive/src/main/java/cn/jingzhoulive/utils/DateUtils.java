package cn.jingzhoulive.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangmin on 18-4-25.
 */
public class DateUtils {

    public static long getLongSystemTime(){
        return System.currentTimeMillis();
    }

    public static String getSystemTime(){
       Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat();
        // format方法 将Date格式化为日期/时间字符串
        return dateFormat.format(date);
    }

    /**
     * 判断时间与当前时间 是否在规定的秒内，比如短信验证码需要5 × 30 s 内
     * @param second
     * @param checkTime 与系统当前时间比较的时间
     * @return
     */
    public static int checkTimeInSecond(final int second, final long checkTime){
        long curTime = System.currentTimeMillis();
        if(second * 1000 < curTime - checkTime){
            return -1;
        }
        return 1;
    }


}
