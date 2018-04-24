package cn.jingzhoulive.domain;

public class BuildingsWithBLOBs extends Buildings {
    private String pics;

    private String favourable;

    private String traffic;

    private String buildingInfo;

    private String price;

    public BuildingsWithBLOBs(Integer bid, Integer type, String title, String address, String contacts, String phone, String area, String latitude, String longtitude, Integer decoration, Integer shared, Integer commissionId, String acreage, String houseType, Integer recommend, String createTime, String changTime, String pics, String favourable, String traffic, String buildingInfo, String price) {
        super(bid, type, title, address, contacts, phone, area, latitude, longtitude, decoration, shared, commissionId, acreage, houseType, recommend, createTime, changTime);
        this.pics = pics;
        this.favourable = favourable;
        this.traffic = traffic;
        this.buildingInfo = buildingInfo;
        this.price = price;
    }

    public BuildingsWithBLOBs() {
        super();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public String getFavourable() {
        return favourable;
    }

    public void setFavourable(String favourable) {
        this.favourable = favourable == null ? null : favourable.trim();
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public String getBuildingInfo() {
        return buildingInfo;
    }

    public void setBuildingInfo(String buildingInfo) {
        this.buildingInfo = buildingInfo == null ? null : buildingInfo.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }
}