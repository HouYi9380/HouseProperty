package cn.jingzhoulive.domain;

import java.util.ArrayList;
import java.util.List;

public class CommissionProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommissionProcessExample() {
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

        public Criteria andCpidIsNull() {
            addCriterion("cpid is null");
            return (Criteria) this;
        }

        public Criteria andCpidIsNotNull() {
            addCriterion("cpid is not null");
            return (Criteria) this;
        }

        public Criteria andCpidEqualTo(Integer value) {
            addCriterion("cpid =", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotEqualTo(Integer value) {
            addCriterion("cpid <>", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThan(Integer value) {
            addCriterion("cpid >", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpid >=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThan(Integer value) {
            addCriterion("cpid <", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidLessThanOrEqualTo(Integer value) {
            addCriterion("cpid <=", value, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidIn(List<Integer> values) {
            addCriterion("cpid in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotIn(List<Integer> values) {
            addCriterion("cpid not in", values, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidBetween(Integer value1, Integer value2) {
            addCriterion("cpid between", value1, value2, "cpid");
            return (Criteria) this;
        }

        public Criteria andCpidNotBetween(Integer value1, Integer value2) {
            addCriterion("cpid not between", value1, value2, "cpid");
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

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(Integer value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(Integer value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(Integer value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(Integer value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(Integer value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<Integer> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<Integer> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(Integer value1, Integer value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("progress not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeIsNull() {
            addCriterion("pay_id_type is null");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeIsNotNull() {
            addCriterion("pay_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeEqualTo(Integer value) {
            addCriterion("pay_id_type =", value, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeNotEqualTo(Integer value) {
            addCriterion("pay_id_type <>", value, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeGreaterThan(Integer value) {
            addCriterion("pay_id_type >", value, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id_type >=", value, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeLessThan(Integer value) {
            addCriterion("pay_id_type <", value, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id_type <=", value, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeIn(List<Integer> values) {
            addCriterion("pay_id_type in", values, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeNotIn(List<Integer> values) {
            addCriterion("pay_id_type not in", values, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_id_type between", value1, value2, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id_type not between", value1, value2, "payIdType");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeIsNull() {
            addCriterion("to_payid_type is null");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeIsNotNull() {
            addCriterion("to_payid_type is not null");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeEqualTo(Integer value) {
            addCriterion("to_payid_type =", value, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeNotEqualTo(Integer value) {
            addCriterion("to_payid_type <>", value, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeGreaterThan(Integer value) {
            addCriterion("to_payid_type >", value, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_payid_type >=", value, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeLessThan(Integer value) {
            addCriterion("to_payid_type <", value, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeLessThanOrEqualTo(Integer value) {
            addCriterion("to_payid_type <=", value, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeIn(List<Integer> values) {
            addCriterion("to_payid_type in", values, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeNotIn(List<Integer> values) {
            addCriterion("to_payid_type not in", values, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeBetween(Integer value1, Integer value2) {
            addCriterion("to_payid_type between", value1, value2, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("to_payid_type not between", value1, value2, "toPayidType");
            return (Criteria) this;
        }

        public Criteria andToPayidIsNull() {
            addCriterion("to_payid is null");
            return (Criteria) this;
        }

        public Criteria andToPayidIsNotNull() {
            addCriterion("to_payid is not null");
            return (Criteria) this;
        }

        public Criteria andToPayidEqualTo(String value) {
            addCriterion("to_payid =", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidNotEqualTo(String value) {
            addCriterion("to_payid <>", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidGreaterThan(String value) {
            addCriterion("to_payid >", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidGreaterThanOrEqualTo(String value) {
            addCriterion("to_payid >=", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidLessThan(String value) {
            addCriterion("to_payid <", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidLessThanOrEqualTo(String value) {
            addCriterion("to_payid <=", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidLike(String value) {
            addCriterion("to_payid like", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidNotLike(String value) {
            addCriterion("to_payid not like", value, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidIn(List<String> values) {
            addCriterion("to_payid in", values, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidNotIn(List<String> values) {
            addCriterion("to_payid not in", values, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidBetween(String value1, String value2) {
            addCriterion("to_payid between", value1, value2, "toPayid");
            return (Criteria) this;
        }

        public Criteria andToPayidNotBetween(String value1, String value2) {
            addCriterion("to_payid not between", value1, value2, "toPayid");
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