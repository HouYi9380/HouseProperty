package cn.jingzhoulive.domain;

public class ReachDeal {
    private Integer rid;

    private Integer vid;

    private Integer uid;

    private Integer guider;

    private Integer bid;

    private Integer dealPrice;

    private Integer cid;

    private String pics;

    private String createTime;

    private String changTime;

    public ReachDeal(Integer rid, Integer vid, Integer uid, Integer guider, Integer bid, Integer dealPrice, Integer cid, String pics, String createTime, String changTime) {
        this.rid = rid;
        this.vid = vid;
        this.uid = uid;
        this.guider = guider;
        this.bid = bid;
        this.dealPrice = dealPrice;
        this.cid = cid;
        this.pics = pics;
        this.createTime = createTime;
        this.changTime = changTime;
    }

    public ReachDeal() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGuider() {
        return guider;
    }

    public void setGuider(Integer guider) {
        this.guider = guider;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Integer dealPrice) {
        this.dealPrice = dealPrice;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getChangTime() {
        return changTime;
    }

    public void setChangTime(String changTime) {
        this.changTime = changTime == null ? null : changTime.trim();
    }
}