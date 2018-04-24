package cn.jingzhoulive.domain;

public class Buildings {
    private Integer bid;

    private Integer type;

    private String title;

    private String address;

    private String contacts;

    private String phone;

    private String area;

    private String latitude;

    private String longtitude;

    private Integer decoration;

    private Integer shared;

    private Integer commissionId;

    private String acreage;

    private String houseType;

    private Integer recommend;

    private String createTime;

    private String changTime;

    public Buildings(Integer bid, Integer type, String title, String address, String contacts, String phone, String area, String latitude, String longtitude, Integer decoration, Integer shared, Integer commissionId, String acreage, String houseType, Integer recommend, String createTime, String changTime) {
        this.bid = bid;
        this.type = type;
        this.title = title;
        this.address = address;
        this.contacts = contacts;
        this.phone = phone;
        this.area = area;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.decoration = decoration;
        this.shared = shared;
        this.commissionId = commissionId;
        this.acreage = acreage;
        this.houseType = houseType;
        this.recommend = recommend;
        this.createTime = createTime;
        this.changTime = changTime;
    }

    public Buildings() {
        super();
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude == null ? null : longtitude.trim();
    }

    public Integer getDecoration() {
        return decoration;
    }

    public void setDecoration(Integer decoration) {
        this.decoration = decoration;
    }

    public Integer getShared() {
        return shared;
    }

    public void setShared(Integer shared) {
        this.shared = shared;
    }

    public Integer getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Integer commissionId) {
        this.commissionId = commissionId;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage == null ? null : acreage.trim();
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
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