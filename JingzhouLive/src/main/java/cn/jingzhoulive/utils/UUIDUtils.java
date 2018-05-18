package cn.jingzhoulive.utils;

import java.util.UUID;

/**
 * Created by zhangmin on 18-5-18.
 */
public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

//    public static void main(String[] args) {
//        System.out.println("格式前的UUID ： " + UUID.randomUUID().toString());
//        System.out.println("格式化后的UUID ：" + getUUID());
//    }
}
