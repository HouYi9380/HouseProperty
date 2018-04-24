package cn.jingzhoulive.domain;

public class CommissionProcess {
    private Integer cpid;

    private Integer uid;

    private Integer guider;

    private Integer vid;

    private Integer progress;

    private Integer payIdType;

    private String payId;

    private Integer toPayidType;

    private String toPayid;

    private String createTime;

    private String changTime;

    private String price;

    public CommissionProcess(Integer cpid, Integer uid, Integer guider, Integer vid, Integer progress, Integer payIdType, String payId, Integer toPayidType, String toPayid, String createTime, String changTime, String price) {
        this.cpid = cpid;
        this.uid = uid;
        this.guider = guider;
        this.vid = vid;
        this.progress = progress;
        this.payIdType = payIdType;
        this.payId = payId;
        this.toPayidType = toPayidType;
        this.toPayid = toPayid;
        this.createTime = createTime;
        this.changTime = changTime;
        this.price = price;
    }

    public CommissionProcess() {
        super();
    }

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
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

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getPayIdType() {
        return payIdType;
    }

    public void setPayIdType(Integer payIdType) {
        this.payIdType = payIdType;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public Integer getToPayidType() {
        return toPayidType;
    }

    public void setToPayidType(Integer toPayidType) {
        this.toPayidType = toPayidType;
    }

    public String getToPayid() {
        return toPayid;
    }

    public void setToPayid(String toPayid) {
        this.toPayid = toPayid == null ? null : toPayid.trim();
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }
}