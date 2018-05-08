package cn.jingzhoulive.domain;

import com.github.pagehelper.PageInfo;

/**
 * Created by zhangmin on 18-5-4.
 */
public class MyVisitProcess {
    private int totalrecommend; //总推荐个数
    private int completed; // 推荐完成数
    private PageInfo<VistProcess> data; // 进程列表

    public int getTotalrecommend() {
        return totalrecommend;
    }

    public void setTotalrecommend(int totalrecommend) {
        this.totalrecommend = totalrecommend;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public PageInfo<VistProcess> getData() {
        return data;
    }

    public void setData(PageInfo<VistProcess> data) {
        this.data = data;
    }
}
