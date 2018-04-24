package cn.jingzhoulive.domain;

public class CommissionPolicy {
    private Integer cid;

    private String title;

    private Integer type;

    private String firstcv;

    private String secondcv;

    private Integer availablility;

    private String createTime;

    private String changTime;

    private String content;

    public CommissionPolicy(Integer cid, String title, Integer type, String firstcv, String secondcv, Integer availablility, String createTime, String changTime, String content) {
        this.cid = cid;
        this.title = title;
        this.type = type;
        this.firstcv = firstcv;
        this.secondcv = secondcv;
        this.availablility = availablility;
        this.createTime = createTime;
        this.changTime = changTime;
        this.content = content;
    }

    public CommissionPolicy() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getFirstcv() {
        return firstcv;
    }

    public void setFirstcv(String firstcv) {
        this.firstcv = firstcv == null ? null : firstcv.trim();
    }

    public String getSecondcv() {
        return secondcv;
    }

    public void setSecondcv(String secondcv) {
        this.secondcv = secondcv == null ? null : secondcv.trim();
    }

    public Integer getAvailablility() {
        return availablility;
    }

    public void setAvailablility(Integer availablility) {
        this.availablility = availablility;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}