package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductParamExample() {
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

        public Criteria andProductParamIdIsNull() {
            addCriterion("product_param_id is null");
            return (Criteria) this;
        }

        public Criteria andProductParamIdIsNotNull() {
            addCriterion("product_param_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductParamIdEqualTo(Integer value) {
            addCriterion("product_param_id =", value, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdNotEqualTo(Integer value) {
            addCriterion("product_param_id <>", value, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdGreaterThan(Integer value) {
            addCriterion("product_param_id >", value, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_param_id >=", value, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdLessThan(Integer value) {
            addCriterion("product_param_id <", value, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_param_id <=", value, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdIn(List<Integer> values) {
            addCriterion("product_param_id in", values, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdNotIn(List<Integer> values) {
            addCriterion("product_param_id not in", values, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdBetween(Integer value1, Integer value2) {
            addCriterion("product_param_id between", value1, value2, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductParamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_param_id not between", value1, value2, "productParamId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyIsNull() {
            addCriterion("product_param_key is null");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyIsNotNull() {
            addCriterion("product_param_key is not null");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyEqualTo(String value) {
            addCriterion("product_param_key =", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyNotEqualTo(String value) {
            addCriterion("product_param_key <>", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyGreaterThan(String value) {
            addCriterion("product_param_key >", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyGreaterThanOrEqualTo(String value) {
            addCriterion("product_param_key >=", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyLessThan(String value) {
            addCriterion("product_param_key <", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyLessThanOrEqualTo(String value) {
            addCriterion("product_param_key <=", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyLike(String value) {
            addCriterion("product_param_key like", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyNotLike(String value) {
            addCriterion("product_param_key not like", value, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyIn(List<String> values) {
            addCriterion("product_param_key in", values, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyNotIn(List<String> values) {
            addCriterion("product_param_key not in", values, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyBetween(String value1, String value2) {
            addCriterion("product_param_key between", value1, value2, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamKeyNotBetween(String value1, String value2) {
            addCriterion("product_param_key not between", value1, value2, "productParamKey");
            return (Criteria) this;
        }

        public Criteria andProductParamValueIsNull() {
            addCriterion("product_param_value is null");
            return (Criteria) this;
        }

        public Criteria andProductParamValueIsNotNull() {
            addCriterion("product_param_value is not null");
            return (Criteria) this;
        }

        public Criteria andProductParamValueEqualTo(String value) {
            addCriterion("product_param_value =", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueNotEqualTo(String value) {
            addCriterion("product_param_value <>", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueGreaterThan(String value) {
            addCriterion("product_param_value >", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("product_param_value >=", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueLessThan(String value) {
            addCriterion("product_param_value <", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueLessThanOrEqualTo(String value) {
            addCriterion("product_param_value <=", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueLike(String value) {
            addCriterion("product_param_value like", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueNotLike(String value) {
            addCriterion("product_param_value not like", value, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueIn(List<String> values) {
            addCriterion("product_param_value in", values, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueNotIn(List<String> values) {
            addCriterion("product_param_value not in", values, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueBetween(String value1, String value2) {
            addCriterion("product_param_value between", value1, value2, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamValueNotBetween(String value1, String value2) {
            addCriterion("product_param_value not between", value1, value2, "productParamValue");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeIsNull() {
            addCriterion("product_param_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeIsNotNull() {
            addCriterion("product_param_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeEqualTo(Date value) {
            addCriterion("product_param_create_time =", value, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeNotEqualTo(Date value) {
            addCriterion("product_param_create_time <>", value, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeGreaterThan(Date value) {
            addCriterion("product_param_create_time >", value, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_param_create_time >=", value, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeLessThan(Date value) {
            addCriterion("product_param_create_time <", value, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_param_create_time <=", value, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeIn(List<Date> values) {
            addCriterion("product_param_create_time in", values, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeNotIn(List<Date> values) {
            addCriterion("product_param_create_time not in", values, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeBetween(Date value1, Date value2) {
            addCriterion("product_param_create_time between", value1, value2, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_param_create_time not between", value1, value2, "productParamCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeIsNull() {
            addCriterion("product_param_update_time is null");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeIsNotNull() {
            addCriterion("product_param_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeEqualTo(Date value) {
            addCriterion("product_param_update_time =", value, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeNotEqualTo(Date value) {
            addCriterion("product_param_update_time <>", value, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeGreaterThan(Date value) {
            addCriterion("product_param_update_time >", value, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_param_update_time >=", value, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeLessThan(Date value) {
            addCriterion("product_param_update_time <", value, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_param_update_time <=", value, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeIn(List<Date> values) {
            addCriterion("product_param_update_time in", values, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeNotIn(List<Date> values) {
            addCriterion("product_param_update_time not in", values, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("product_param_update_time between", value1, value2, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_param_update_time not between", value1, value2, "productParamUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelIsNull() {
            addCriterion("product_param_is_del is null");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelIsNotNull() {
            addCriterion("product_param_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelEqualTo(Byte value) {
            addCriterion("product_param_is_del =", value, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelNotEqualTo(Byte value) {
            addCriterion("product_param_is_del <>", value, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelGreaterThan(Byte value) {
            addCriterion("product_param_is_del >", value, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_param_is_del >=", value, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelLessThan(Byte value) {
            addCriterion("product_param_is_del <", value, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("product_param_is_del <=", value, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelIn(List<Byte> values) {
            addCriterion("product_param_is_del in", values, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelNotIn(List<Byte> values) {
            addCriterion("product_param_is_del not in", values, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelBetween(Byte value1, Byte value2) {
            addCriterion("product_param_is_del between", value1, value2, "productParamIsDel");
            return (Criteria) this;
        }

        public Criteria andProductParamIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("product_param_is_del not between", value1, value2, "productParamIsDel");
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