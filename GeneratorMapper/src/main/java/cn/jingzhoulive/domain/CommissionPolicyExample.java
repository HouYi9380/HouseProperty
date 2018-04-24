package cn.jingzhoulive.domain;

import java.util.ArrayList;
import java.util.List;

public class CommissionPolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommissionPolicyExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andFirstcvEqualTo(String value) {
            addCriterion("firstcv =", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvNotEqualTo(String value) {
            addCriterion("firstcv <>", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvGreaterThan(String value) {
            addCriterion("firstcv >", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvGreaterThanOrEqualTo(String value) {
            addCriterion("firstcv >=", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvLessThan(String value) {
            addCriterion("firstcv <", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvLessThanOrEqualTo(String value) {
            addCriterion("firstcv <=", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvLike(String value) {
            addCriterion("firstcv like", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvNotLike(String value) {
            addCriterion("firstcv not like", value, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvIn(List<String> values) {
            addCriterion("firstcv in", values, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvNotIn(List<String> values) {
            addCriterion("firstcv not in", values, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvBetween(String value1, String value2) {
            addCriterion("firstcv between", value1, value2, "firstcv");
            return (Criteria) this;
        }

        public Criteria andFirstcvNotBetween(String value1, String value2) {
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

        public Criteria andSecondcvEqualTo(String value) {
            addCriterion("secondcv =", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvNotEqualTo(String value) {
            addCriterion("secondcv <>", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvGreaterThan(String value) {
            addCriterion("secondcv >", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvGreaterThanOrEqualTo(String value) {
            addCriterion("secondcv >=", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvLessThan(String value) {
            addCriterion("secondcv <", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvLessThanOrEqualTo(String value) {
            addCriterion("secondcv <=", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvLike(String value) {
            addCriterion("secondcv like", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvNotLike(String value) {
            addCriterion("secondcv not like", value, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvIn(List<String> values) {
            addCriterion("secondcv in", values, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvNotIn(List<String> values) {
            addCriterion("secondcv not in", values, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvBetween(String value1, String value2) {
            addCriterion("secondcv between", value1, value2, "secondcv");
            return (Criteria) this;
        }

        public Criteria andSecondcvNotBetween(String value1, String value2) {
            addCriterion("secondcv not between", value1, value2, "secondcv");
            return (Criteria) this;
        }

        public Criteria andAvailablilityIsNull() {
            addCriterion("availablility is null");
            return (Criteria) this;
        }

        public Criteria andAvailablilityIsNotNull() {
            addCriterion("availablility is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablilityEqualTo(Integer value) {
            addCriterion("availablility =", value, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityNotEqualTo(Integer value) {
            addCriterion("availablility <>", value, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityGreaterThan(Integer value) {
            addCriterion("availablility >", value, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("availablility >=", value, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityLessThan(Integer value) {
            addCriterion("availablility <", value, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityLessThanOrEqualTo(Integer value) {
            addCriterion("availablility <=", value, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityIn(List<Integer> values) {
            addCriterion("availablility in", values, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityNotIn(List<Integer> values) {
            addCriterion("availablility not in", values, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityBetween(Integer value1, Integer value2) {
            addCriterion("availablility between", value1, value2, "availablility");
            return (Criteria) this;
        }

        public Criteria andAvailablilityNotBetween(Integer value1, Integer value2) {
            addCriterion("availablility not between", value1, value2, "availablility");
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