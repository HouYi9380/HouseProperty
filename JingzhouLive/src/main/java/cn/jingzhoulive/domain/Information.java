package cn.jingzhoulive.domain;

public class Information {
    private Integer iid;

    private String title;

    private Integer type;

    private String pics;

    private String areaid;

    private String createTime;

    private String changTime;

    private String html;

    public Information(Integer iid, String title, Integer type, String pics, String areaid, String createTime, String changTime, String html) {
        this.iid = iid;
        this.title = title;
        this.type = type;
        this.pics = pics;
        this.areaid = areaid;
        this.createTime = createTime;
        this.changTime = changTime;
        this.html = html;
    }

    public Information() {
        super();
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
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

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
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

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html == null ? null : html.trim();
    }
}