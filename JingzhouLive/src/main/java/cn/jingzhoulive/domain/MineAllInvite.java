package cn.jingzhoulive.domain;

import java.util.List;

/**
 * Created by zhangmin on 18-6-21.
 */
public class MineAllInvite {
    int totalperson;
    int valideateperson;
    List<MyInviteCountData> data;

    public int getTotalperson() {
        return totalperson;
    }

    public void setTotalperson(int totalperson) {
        this.totalperson = totalperson;
    }

    public int getValideateperson() {
        return valideateperson;
    }

    public void setValideateperson(int valideateperson) {
        this.valideateperson = valideateperson;
    }

    public List<MyInviteCountData> getData() {
        return data;
    }

    public void setData(List<MyInviteCountData> data) {
        this.data = data;
    }
}
