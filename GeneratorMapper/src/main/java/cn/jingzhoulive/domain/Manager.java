package cn.jingzhoulive.domain;

public class Manager {
    private Integer mid;

    private String phone;

    private String pwd;

    private Integer power;

    private String name;

    private String nick;

    private String pics;

    private String positon;

    private Integer availability;

    private String createTime;

    private String changTime;

    public Manager(Integer mid, String phone, String pwd, Integer power, String name, String nick, String pics, String positon, Integer availability, String createTime, String changTime) {
        this.mid = mid;
        this.phone = phone;
        this.pwd = pwd;
        this.power = power;
        this.name = name;
        this.nick = nick;
        this.pics = pics;
        this.positon = positon;
        this.availability = availability;
        this.createTime = createTime;
        this.changTime = changTime;
    }

    public Manager() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public String getPositon() {
        return positon;
    }

    public void setPositon(String positon) {
        this.positon = positon == null ? null : positon.trim();
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