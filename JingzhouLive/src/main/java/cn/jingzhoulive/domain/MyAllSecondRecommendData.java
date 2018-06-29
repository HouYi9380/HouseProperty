package cn.jingzhoulive.domain;

/**
 * Created by zhangmin on 18-6-25.
 */
public class MyAllSecondRecommendData {

    Integer bid;    //楼编号
    String title;   //楼名称
    Integer uid;    //被推荐人
    Long price;  //预计金额，或者是准确金额
    Integer progress; //当前进度
    Integer check;//审核状态

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }
}
