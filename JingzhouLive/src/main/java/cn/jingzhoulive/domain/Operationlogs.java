package cn.jingzhoulive.domain;

public class Operationlogs {
    private Integer oid;

    private String content;

    private Integer mid;

    private Integer type;

    private String object;

    private String createTime;

    private String changTime;

    public Operationlogs(Integer oid, String content, Integer mid, Integer type, String object, String createTime, String changTime) {
        this.oid = oid;
        this.content = content;
        this.mid = mid;
        this.type = type;
        this.object = object;
        this.createTime = createTime;
        this.changTime = changTime;
    }

    public Operationlogs() {
        super();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object == null ? null : object.trim();
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