package cn.jingzhoulive.domain;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Integer value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Integer value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Integer value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Integer value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Integer value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Integer> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Integer> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Integer value1, Integer value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
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