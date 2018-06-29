package cn.jingzhoulive.domain;

public class CommissionProcess {
    private Integer cpid;

    private Integer uid;

    private Integer guider;

    private Integer vid;

    private Long price;

    private Integer progress;

    private Integer payIdType;

    private String payId;

    private Integer toPayidType;

    private String toPayid;

    private Integer level;

    private String createTime;

    private String changTime;

    public CommissionProcess(Integer cpid, Integer uid, Integer guider, Integer vid, Long price, Integer progress, Integer payIdType, String payId, Integer toPayidType, String toPayid, Integer level, String createTime, String changTime) {
        this.cpid = cpid;
        this.uid = uid;
        this.guider = guider;
        this.vid = vid;
        this.price = price;
        this.progress = progress;
        this.payIdType = payIdType;
        this.payId = payId;
        this.toPayidType = toPayidType;
        this.toPayid = toPayid;
        this.level = level;
        this.createTime = createTime;
        this.changTime = changTime;
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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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