package com.sdut.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarProductExample() {
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

        public Criteria andCarProductIdIsNull() {
            addCriterion("car_product_id is null");
            return (Criteria) this;
        }

        public Criteria andCarProductIdIsNotNull() {
            addCriterion("car_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarProductIdEqualTo(Integer value) {
            addCriterion("car_product_id =", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdNotEqualTo(Integer value) {
            addCriterion("car_product_id <>", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdGreaterThan(Integer value) {
            addCriterion("car_product_id >", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_product_id >=", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdLessThan(Integer value) {
            addCriterion("car_product_id <", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_product_id <=", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdIn(List<Integer> values) {
            addCriterion("car_product_id in", values, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdNotIn(List<Integer> values) {
            addCriterion("car_product_id not in", values, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdBetween(Integer value1, Integer value2) {
            addCriterion("car_product_id between", value1, value2, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_product_id not between", value1, value2, "carProductId");
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

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Integer value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Integer value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Integer value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Integer value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Integer> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Integer> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Integer value1, Integer value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelIsNull() {
            addCriterion("car_product_is_del is null");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelIsNotNull() {
            addCriterion("car_product_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelEqualTo(Byte value) {
            addCriterion("car_product_is_del =", value, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelNotEqualTo(Byte value) {
            addCriterion("car_product_is_del <>", value, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelGreaterThan(Byte value) {
            addCriterion("car_product_is_del >", value, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("car_product_is_del >=", value, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelLessThan(Byte value) {
            addCriterion("car_product_is_del <", value, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("car_product_is_del <=", value, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelIn(List<Byte> values) {
            addCriterion("car_product_is_del in", values, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelNotIn(List<Byte> values) {
            addCriterion("car_product_is_del not in", values, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelBetween(Byte value1, Byte value2) {
            addCriterion("car_product_is_del between", value1, value2, "carProductIsDel");
            return (Criteria) this;
        }

        public Criteria andCarProductIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("car_product_is_del not between", value1, value2, "carProductIsDel");
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