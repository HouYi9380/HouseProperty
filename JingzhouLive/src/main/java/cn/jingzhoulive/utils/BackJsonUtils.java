package cn.jingzhoulive.utils;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangmin on 18-4-25.
 */
public class BackJsonUtils<T> {
    private boolean res;
    private String msg;
    private List<T> data;

    private static BackJsonUtils instance = null;

    public static BackJsonUtils getInstance() {
        if(instance == null)
            instance = new BackJsonUtils();
        return instance;
    }

    public String getBackJsonUtils(final boolean res,
                                             final String msg,
                                             final List<T> data){
        BackJsonUtils<T> backJsonUtils = this.getInstance();
        backJsonUtils.setRes(res);
        backJsonUtils.setMsg(msg);
        backJsonUtils.setData(data);
        return JSON.toJSONString(backJsonUtils);
    }

    public String getBackJsonUtils(final boolean res,
                                   final String msg,
                                   final T data){
        BackJsonUtils<T> backJsonUtils = this.getInstance();
        backJsonUtils.setRes(res);
        backJsonUtils.setMsg(msg);
        List<T> list = new ArrayList<T>();
        backJsonUtils.setData(list);
        return JSON.toJSONString(backJsonUtils);
    }


    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
