package cn.jingzhoulive.domain;

import com.github.pagehelper.PageInfo;

/**
 * Created by zhangmin on 18-5-4.
 */
public class MyCommission {
    private Long totalamount;
    private Long ongoing;
    private PageInfo<CommissionProcess> data;

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public Long getOngoing() {
        return ongoing;
    }

    public void setOngoing(Long ongoing) {
        this.ongoing = ongoing;
    }

    public PageInfo<CommissionProcess> getData() {
        return data;
    }

    public void setData(PageInfo<CommissionProcess> data) {
        this.data = data;
    }
}
