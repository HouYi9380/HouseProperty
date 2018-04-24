package cn.jingzhoulive.domain;

public class ReachDealWithBLOBs extends ReachDeal {
    private String hostPrice;

    private String price;

    private String firstcv;

    private String secondcv;

    public ReachDealWithBLOBs(Integer rid, Integer vid, Integer uid, Integer guider, Integer bid, Integer dealPrice, Integer cid, String pics, String createTime, String changTime, String hostPrice, String price, String firstcv, String secondcv) {
        super(rid, vid, uid, guider, bid, dealPrice, cid, pics, createTime, changTime);
        this.hostPrice = hostPrice;
        this.price = price;
        this.firstcv = firstcv;
        this.secondcv = secondcv;
    }

    public ReachDealWithBLOBs() {
        super();
    }

    public String getHostPrice() {
        return hostPrice;
    }

    public void setHostPrice(String hostPrice) {
        this.hostPrice = hostPrice == null ? null : hostPrice.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
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
}