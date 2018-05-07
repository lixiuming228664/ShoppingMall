package com.sdut.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdIsNull() {
            addCriterion("car_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCarUserIdIsNotNull() {
            addCriterion("car_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarUserIdEqualTo(Integer value) {
            addCriterion("car_user_id =", value, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdNotEqualTo(Integer value) {
            addCriterion("car_user_id <>", value, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdGreaterThan(Integer value) {
            addCriterion("car_user_id >", value, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_user_id >=", value, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdLessThan(Integer value) {
            addCriterion("car_user_id <", value, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_user_id <=", value, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdIn(List<Integer> values) {
            addCriterion("car_user_id in", values, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdNotIn(List<Integer> values) {
            addCriterion("car_user_id not in", values, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdBetween(Integer value1, Integer value2) {
            addCriterion("car_user_id between", value1, value2, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_user_id not between", value1, value2, "carUserId");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNull() {
            addCriterion("car_name is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("car_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("car_name =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("car_name <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("car_name >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_name >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("car_name <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("car_name <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("car_name like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("car_name not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("car_name in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("car_name not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("car_name between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("car_name not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceIsNull() {
            addCriterion("car_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceIsNotNull() {
            addCriterion("car_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceEqualTo(Double value) {
            addCriterion("car_sum_price =", value, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceNotEqualTo(Double value) {
            addCriterion("car_sum_price <>", value, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceGreaterThan(Double value) {
            addCriterion("car_sum_price >", value, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("car_sum_price >=", value, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceLessThan(Double value) {
            addCriterion("car_sum_price <", value, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("car_sum_price <=", value, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceIn(List<Double> values) {
            addCriterion("car_sum_price in", values, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceNotIn(List<Double> values) {
            addCriterion("car_sum_price not in", values, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceBetween(Double value1, Double value2) {
            addCriterion("car_sum_price between", value1, value2, "carSumPrice");
            return (Criteria) this;
        }

        public Criteria andCarSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("car_sum_price not between", value1, value2, "carSumPrice");
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