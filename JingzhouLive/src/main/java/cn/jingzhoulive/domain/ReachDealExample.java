package cn.jingzhoulive.domain;

import java.util.ArrayList;
import java.util.List;

public class ReachDealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReachDealExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andGuiderIsNull() {
            addCriterion("guider is null");
            return (Criteria) this;
        }

        public Criteria andGuiderIsNotNull() {
            addCriterion("guider is not null");
            return (Criteria) this;
        }

        public Criteria andGuiderEqualTo(Integer value) {
            addCriterion("guider =", value, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderNotEqualTo(Integer value) {
            addCriterion("guider <>", value, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderGreaterThan(Integer value) {
            addCriterion("guider >", value, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderGreaterThanOrEqualTo(Integer value) {
            addCriterion("guider >=", value, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderLessThan(Integer value) {
            addCriterion("guider <", value, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderLessThanOrEqualTo(Integer value) {
            addCriterion("guider <=", value, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderIn(List<Integer> values) {
            addCriterion("guider in", values, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderNotIn(List<Integer> values) {
            addCriterion("guider not in", values, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderBetween(Integer value1, Integer value2) {
            addCriterion("guider between", value1, value2, "guider");
            return (Criteria) this;
        }

        public Criteria andGuiderNotBetween(Integer value1, Integer value2) {
            addCriterion("guider not between", value1, value2, "guider");
            return (Criteria) this;
        }

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andHostPriceIsNull() {
            addCriterion("host_price is null");
            return (Criteria) this;
        }

        public Criteria andHostPriceIsNotNull() {
            addCriterion("host_price is not null");
            return (Criteria) this;
        }

        public Criteria andHostPriceEqualTo(Long value) {
            addCriterion("host_price =", value, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceNotEqualTo(Long value) {
            addCriterion("host_price <>", value, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceGreaterThan(Long value) {
            addCriterion("host_price >", value, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("host_price >=", value, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceLessThan(Long value) {
            addCriterion("host_price <", value, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceLessThanOrEqualTo(Long value) {
            addCriterion("host_price <=", value, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceIn(List<Long> values) {
            addCriterion("host_price in", values, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceNotIn(List<Long> values) {
            addCriterion("host_price not in", values, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceBetween(Long value1, Long value2) {
            addCriterion("host_price between", value1, value2, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andHostPriceNotBetween(Long value1, Long value2) {
            addCriterion("host_price not between", value1, value2, "hostPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNull() {
            addCriterion("deal_price is null");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNotNull() {
            addCriterion("deal_price is not null");
            return (Criteria) this;
        }

        public Criteria andDealPriceEqualTo(Long value) {
            addCriterion("deal_price =", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotEqualTo(Long value) {
            addCriterion("deal_price <>", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThan(Long value) {
            addCriterion("deal_price >", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("deal_price >=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThan(Long value) {
            addCriterion("deal_price <", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThanOrEqualTo(Long value) {
            addCriterion("deal_price <=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceIn(List<Long> values) {
            addCriterion("deal_price in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotIn(List<Long> values) {
            addCriterion("deal_price not in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceBetween(Long value1, Long value2) {
            addCriterion("deal_price between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotBetween(Long value1, Long value2) {
            addCriterion("deal_price not between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("pics is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("pics is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("pics =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("pics <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("pics >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("pics >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("pics <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("pics <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("pics like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("pics not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("pics in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("pics not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("pics between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("pics not between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andFirstcvIsNull() {
            addCriterion("firstcv is null");
            return (Criteria) this;
        }

        public Criteria andFirstcvIsNotNull() {
            addCriterion("firstcv is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcvEqualTo(Long value) {
            addCriterion("firstcv =", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvNotEqualTo(Long value) {
            addCriterion("firstcv <>", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvGreaterThan(Long value) {
            addCriterion("firstcv >", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvGreaterThanOrEqualTo(Long value) {
            addCriterion("firstcv >=", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvLessThan(Long value) {
            addCriterion("firstcv <", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvLessThanOrEqualTo(Long value) {
            addCriterion("firstcv <=", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvIn(List<Long> values) {
            addCriterion("firstcv in", values, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvNotIn(List<Long> values) {
            addCriterion("firstcv not in", values, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvBetween(Long value1, Long value2) {
            addCriterion("firstcv between", value1, value2, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvNotBetween(Long value1, Long value2) {
            addCriterion("firstcv not between", value1, value2, "firstcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvIsNull() {
            addCriterion("secondcv is null");
            return (Criteria) this;
        }

        public Criteria andSecondcvIsNotNull() {
            addCriterion("secondcv is not null");
            return (Criteria) this;
        }

        public Criteria andSecondcvEqualTo(Long value) {
            addCriterion("secondcv =", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvNotEqualTo(Long value) {
            addCriterion("secondcv <>", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvGreaterThan(Long value) {
            addCriterion("secondcv >", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvGreaterThanOrEqualTo(Long value) {
            addCriterion("secondcv >=", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvLessThan(Long value) {
            addCriterion("secondcv <", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvLessThanOrEqualTo(Long value) {
            addCriterion("secondcv <=", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvIn(List<Long> values) {
            addCriterion("secondcv in", values, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvNotIn(List<Long> values) {
            addCriterion("secondcv not in", values, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvBetween(Long value1, Long value2) {
            addCriterion("secondcv between", value1, value2, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvNotBetween(Long value1, Long value2) {
            addCriterion("secondcv not between", value1, value2, "secondcv");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeIsNull() {
            addCriterion("chang_time is null");
            return (Criteria) this;
        }

        public Criteria andChangTimeIsNotNull() {
            addCriterion("chang_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangTimeEqualTo(String value) {
            addCriterion("chang_time =", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeNotEqualTo(String value) {
            addCriterion("chang_time <>", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeGreaterThan(String value) {
            addCriterion("chang_time >", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeGreaterThanOrEqualTo(String value) {
            addCriterion("chang_time >=", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeLessThan(String value) {
            addCriterion("chang_time <", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeLessThanOrEqualTo(String value) {
            addCriterion("chang_time <=", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeLike(String value) {
            addCriterion("chang_time like", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeNotLike(String value) {
            addCriterion("chang_time not like", value, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeIn(List<String> values) {
            addCriterion("chang_time in", values, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeNotIn(List<String> values) {
            addCriterion("chang_time not in", values, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeBetween(String value1, String value2) {
            addCriterion("chang_time between", value1, value2, "changTime");
            return (Criteria) this;
        }

        public Criteria andChangTimeNotBetween(String value1, String value2) {
            addCriterion("chang_time not between", value1, value2, "changTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}