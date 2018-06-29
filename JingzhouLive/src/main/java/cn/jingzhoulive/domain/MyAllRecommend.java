package cn.jingzhoulive.domain;

import java.util.List;

/**
 * Created by zhangmin on 18-6-25.
 */
public class MyAllRecommend {
    Integer totalrecommend; //总推荐个数
    Integer completed;//已完成数
    List<MyAllRecommendData> data;
    public Integer getTotalrecommend() {
        return totalrecommend;
    }

    public void setTotalrecommend(Integer totalrecommend) {
        this.totalrecommend = totalrecommend;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public List<MyAllRecommendData> getData() {
        return data;
    }

    public void setData(List<MyAllRecommendData> data) {
        this.data = data;
    }
}
