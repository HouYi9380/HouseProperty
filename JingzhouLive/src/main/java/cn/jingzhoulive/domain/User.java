package cn.jingzhoulive.domain;

public class User {
    private Integer uid;

    private String phone;

    private String code;

    private String pwd;

    private Integer registType;

    private Integer guider;

    private String name;

    private String nick;

    private String pic;

    private String icid;

    private Integer payType;

    private String payId;

    private String residence;

    private Integer lately;

    private String createTime;

    private String changTime;

    public User(Integer uid, String phone, String code, String pwd, Integer registType, Integer guider, String name, String nick, String pic, String icid, Integer payType, String payId, String residence, Integer lately, String createTime, String changTime) {
        this.uid = uid;
        this.phone = phone;
        this.code = code;
        this.pwd = pwd;
        this.registType = registType;
        this.guider = guider;
        this.name = name;
        this.nick = nick;
        this.pic = pic;
        this.icid = icid;
        this.payType = payType;
        this.payId = payId;
        this.residence = residence;
        this.lately = lately;
        this.createTime = createTime;
        this.changTime = changTime;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getRegistType() {
        return registType;
    }

    public void setRegistType(Integer registType) {
        this.registType = registType;
    }

    public Integer getGuider() {
        return guider;
    }

    public void setGuider(Integer guider) {
        this.guider = guider;
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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getIcid() {
        return icid;
    }

    public void setIcid(String icid) {
        this.icid = icid == null ? null : icid.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public Integer getLately() {
        return lately;
    }

    public void setLately(Integer lately) {
        this.lately = lately;
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

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", phone='" + phone + '\'' +
                ", code='" + code + '\'' +
                ", pwd='" + pwd + '\'' +
                ", registType=" + registType +
                ", guider=" + guider +
                ", name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", pic='" + pic + '\'' +
                ", icid='" + icid + '\'' +
                ", payType=" + payType +
                ", payId='" + payId + '\'' +
                ", residence='" + residence + '\'' +
                ", lately=" + lately +
                ", createTime='" + createTime + '\'' +
                ", changTime='" + changTime + '\'' +
                '}';
    }
}