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
        long curTime = getLongSystemTime();
        long time = curTime - checkTime;
        System.out.println("curTime -checkTime" + time);
        System.out.println("second*1000*1000" + second * 1000);
        if(second * 1000 < curTime - checkTime){
            return -1;
        }
        return 1;
    }

    public static String longTimeToStr(final long time){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(time);
        System.out.println(formatter.format(date));
        return formatter.format(date);
    }

    public static void printTime(long time){
        long totalMilliSeconds = time;
        long totalSeconds = totalMilliSeconds / 1000;

        //求出现在的秒
        long currentSecond = totalSeconds % 60;

        //求出现在的分
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        //求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        //显示时间
        System.out.println("总毫秒为： " + totalMilliSeconds);
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    }
}
