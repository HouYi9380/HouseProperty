package cn.jingzhoulive.domain;

public class VistProcess {
    private Integer vid;

    private Integer uid;

    private Integer guider;

    private Integer bid;

    private Integer progress;
    //1, 未审核 2 已审核
    private Integer isCheck;

    private String mark;

    private Integer availability;

    private String createTime;

    private String changTime;

    public VistProcess(Integer vid, Integer uid, Integer guider, Integer bid, Integer progress, Integer isCheck, String mark, Integer availability, String createTime, String changTime) {
        this.vid = vid;
        this.uid = uid;
        this.guider = guider;
        this.bid = bid;
        this.progress = progress;
        this.isCheck = isCheck;
        this.mark = mark;
        this.availability = availability;
        this.createTime = createTime;
        this.changTime = changTime;
    }

    public VistProcess() {
        super();
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

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
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