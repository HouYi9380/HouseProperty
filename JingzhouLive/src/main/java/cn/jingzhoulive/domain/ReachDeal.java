package cn.jingzhoulive.domain;

public class ReachDeal {
    private Integer rid;

    private Integer vid;

    private Integer uid;

    private Integer guider;

    private Integer bid;

    private Long hostPrice;

    private Long price;

    private Long dealPrice;

    private Integer cid;

    private String pics;

    private Long firstcv;

    private Long secondcv;

    private String createTime;

    private String changTime;

    public ReachDeal(Integer rid, Integer vid, Integer uid, Integer guider, Integer bid, Long hostPrice, Long price, Long dealPrice, Integer cid, String pics, Long firstcv, Long secondcv, String createTime, String changTime) {
        this.rid = rid;
        this.vid = vid;
        this.uid = uid;
        this.guider = guider;
        this.bid = bid;
        this.hostPrice = hostPrice;
        this.price = price;
        this.dealPrice = dealPrice;
        this.cid = cid;
        this.pics = pics;
        this.firstcv = firstcv;
        this.secondcv = secondcv;
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

    public Long getHostPrice() {
        return hostPrice;
    }

    public void setHostPrice(Long hostPrice) {
        this.hostPrice = hostPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(Long dealPrice) {
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

    public Long getFirstcv() {
        return firstcv;
    }

    public void setFirstcv(Long firstcv) {
        this.firstcv = firstcv;
    }

    public Long getSecondcv() {
        return secondcv;
    }

    public void setSecondcv(Long secondcv) {
        this.secondcv = secondcv;
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