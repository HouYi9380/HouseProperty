package cn.jingzhoulive.domain;

/**
 * Created by zhangmin on 18-4-25.
 * 短信验证类
 */
public class Sms {
    private Integer sid;
    private String phone;
    private String code;
    private Integer type; // 1 登陆验证码
    private Long time;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
