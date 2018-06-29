package cn.jingzhoulive.domain;

/**
 * Created by zhangmin on 18-6-21.
 */
public class MyInviteCountData {
    int uid;
    String name;
    String phone;
    String pic;
    int remonnd;
    int completed;
    int unfinished;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getRemonnd() {
        return remonnd;
    }

    public void setRemonnd(int remonnd) {
        this.remonnd = remonnd;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getUnfinished() {
        return unfinished;
    }

    public void setUnfinished(int unfinished) {
        this.unfinished = unfinished;
    }
}
