package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNull() {
            addCriterion("order_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNotNull() {
            addCriterion("order_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdEqualTo(Integer value) {
            addCriterion("order_user_id =", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotEqualTo(Integer value) {
            addCriterion("order_user_id <>", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThan(Integer value) {
            addCriterion("order_user_id >", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_user_id >=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThan(Integer value) {
            addCriterion("order_user_id <", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_user_id <=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIn(List<Integer> values) {
            addCriterion("order_user_id in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotIn(List<Integer> values) {
            addCriterion("order_user_id not in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id not between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdIsNull() {
            addCriterion("order_user_path_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdIsNotNull() {
            addCriterion("order_user_path_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdEqualTo(Integer value) {
            addCriterion("order_user_path_id =", value, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdNotEqualTo(Integer value) {
            addCriterion("order_user_path_id <>", value, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdGreaterThan(Integer value) {
            addCriterion("order_user_path_id >", value, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_user_path_id >=", value, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdLessThan(Integer value) {
            addCriterion("order_user_path_id <", value, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_user_path_id <=", value, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdIn(List<Integer> values) {
            addCriterion("order_user_path_id in", values, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdNotIn(List<Integer> values) {
            addCriterion("order_user_path_id not in", values, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdBetween(Integer value1, Integer value2) {
            addCriterion("order_user_path_id between", value1, value2, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderUserPathIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_user_path_id not between", value1, value2, "orderUserPathId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Byte value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Byte value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Byte value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Byte value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Byte value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Byte> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Byte> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Byte value1, Byte value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Byte value1, Byte value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceIsNull() {
            addCriterion("order_sum_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceIsNotNull() {
            addCriterion("order_sum_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceEqualTo(Double value) {
            addCriterion("order_sum_price =", value, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceNotEqualTo(Double value) {
            addCriterion("order_sum_price <>", value, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceGreaterThan(Double value) {
            addCriterion("order_sum_price >", value, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("order_sum_price >=", value, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceLessThan(Double value) {
            addCriterion("order_sum_price <", value, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceLessThanOrEqualTo(Double value) {
            addCriterion("order_sum_price <=", value, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceIn(List<Double> values) {
            addCriterion("order_sum_price in", values, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceNotIn(List<Double> values) {
            addCriterion("order_sum_price not in", values, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceBetween(Double value1, Double value2) {
            addCriterion("order_sum_price between", value1, value2, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderSumPriceNotBetween(Double value1, Double value2) {
            addCriterion("order_sum_price not between", value1, value2, "orderSumPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIsNull() {
            addCriterion("order_update_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIsNotNull() {
            addCriterion("order_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeEqualTo(Date value) {
            addCriterion("order_update_time =", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotEqualTo(Date value) {
            addCriterion("order_update_time <>", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeGreaterThan(Date value) {
            addCriterion("order_update_time >", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_update_time >=", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeLessThan(Date value) {
            addCriterion("order_update_time <", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_update_time <=", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIn(List<Date> values) {
            addCriterion("order_update_time in", values, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotIn(List<Date> values) {
            addCriterion("order_update_time not in", values, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("order_update_time between", value1, value2, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_update_time not between", value1, value2, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelIsNull() {
            addCriterion("order_is_del is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelIsNotNull() {
            addCriterion("order_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelEqualTo(Byte value) {
            addCriterion("order_is_del =", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelNotEqualTo(Byte value) {
            addCriterion("order_is_del <>", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelGreaterThan(Byte value) {
            addCriterion("order_is_del >", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_is_del >=", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelLessThan(Byte value) {
            addCriterion("order_is_del <", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("order_is_del <=", value, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelIn(List<Byte> values) {
            addCriterion("order_is_del in", values, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelNotIn(List<Byte> values) {
            addCriterion("order_is_del not in", values, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelBetween(Byte value1, Byte value2) {
            addCriterion("order_is_del between", value1, value2, "orderIsDel");
            return (Criteria) this;
        }

        public Criteria andOrderIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("order_is_del not between", value1, value2, "orderIsDel");
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