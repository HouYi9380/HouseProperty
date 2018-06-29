package cn.jingzhoulive.domain;

import java.util.List;

/**
 * Created by zhangmin on 18-6-21.
 */
public class MineAllCommission {
    long totalamount;
    long onging;
    List<MyCommission> data;

    public long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(long totalamount) {
        this.totalamount = totalamount;
    }

    public long getOnging() {
        return onging;
    }

    public void setOnging(long onging) {
        this.onging = onging;
    }

    public List<MyCommission> getData() {
        return data;
    }

    public void setData(List<MyCommission> data) {
        this.data = data;
    }
}
