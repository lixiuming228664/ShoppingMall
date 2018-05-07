package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
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

        public Criteria andProductStateIsNull() {
            addCriterion("product_state is null");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNotNull() {
            addCriterion("product_state is not null");
            return (Criteria) this;
        }

        public Criteria andProductStateEqualTo(Byte value) {
            addCriterion("product_state =", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotEqualTo(Byte value) {
            addCriterion("product_state <>", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThan(Byte value) {
            addCriterion("product_state >", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_state >=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThan(Byte value) {
            addCriterion("product_state <", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThanOrEqualTo(Byte value) {
            addCriterion("product_state <=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateIn(List<Byte> values) {
            addCriterion("product_state in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotIn(List<Byte> values) {
            addCriterion("product_state not in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateBetween(Byte value1, Byte value2) {
            addCriterion("product_state between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotBetween(Byte value1, Byte value2) {
            addCriterion("product_state not between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andProductIsDelIsNull() {
            addCriterion("product_is_del is null");
            return (Criteria) this;
        }

        public Criteria andProductIsDelIsNotNull() {
            addCriterion("product_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andProductIsDelEqualTo(Byte value) {
            addCriterion("product_is_del =", value, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelNotEqualTo(Byte value) {
            addCriterion("product_is_del <>", value, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelGreaterThan(Byte value) {
            addCriterion("product_is_del >", value, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_is_del >=", value, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelLessThan(Byte value) {
            addCriterion("product_is_del <", value, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("product_is_del <=", value, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelIn(List<Byte> values) {
            addCriterion("product_is_del in", values, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelNotIn(List<Byte> values) {
            addCriterion("product_is_del not in", values, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelBetween(Byte value1, Byte value2) {
            addCriterion("product_is_del between", value1, value2, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("product_is_del not between", value1, value2, "productIsDel");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("product_type_id is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("product_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Byte value) {
            addCriterion("product_type_id =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Byte value) {
            addCriterion("product_type_id <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Byte value) {
            addCriterion("product_type_id >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_type_id >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Byte value) {
            addCriterion("product_type_id <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Byte value) {
            addCriterion("product_type_id <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Byte> values) {
            addCriterion("product_type_id in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Byte> values) {
            addCriterion("product_type_id not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Byte value1, Byte value2) {
            addCriterion("product_type_id between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("product_type_id not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeIsNull() {
            addCriterion("product_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeIsNotNull() {
            addCriterion("product_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeEqualTo(Date value) {
            addCriterion("product_create_time =", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeNotEqualTo(Date value) {
            addCriterion("product_create_time <>", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeGreaterThan(Date value) {
            addCriterion("product_create_time >", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_create_time >=", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeLessThan(Date value) {
            addCriterion("product_create_time <", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_create_time <=", value, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeIn(List<Date> values) {
            addCriterion("product_create_time in", values, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeNotIn(List<Date> values) {
            addCriterion("product_create_time not in", values, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeBetween(Date value1, Date value2) {
            addCriterion("product_create_time between", value1, value2, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_create_time not between", value1, value2, "productCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeIsNull() {
            addCriterion("product_update_time is null");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeIsNotNull() {
            addCriterion("product_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeEqualTo(Date value) {
            addCriterion("product_update_time =", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeNotEqualTo(Date value) {
            addCriterion("product_update_time <>", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeGreaterThan(Date value) {
            addCriterion("product_update_time >", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_update_time >=", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeLessThan(Date value) {
            addCriterion("product_update_time <", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_update_time <=", value, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeIn(List<Date> values) {
            addCriterion("product_update_time in", values, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeNotIn(List<Date> values) {
            addCriterion("product_update_time not in", values, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("product_update_time between", value1, value2, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_update_time not between", value1, value2, "productUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImagesIsNull() {
            addCriterion("product_images is null");
            return (Criteria) this;
        }

        public Criteria andProductImagesIsNotNull() {
            addCriterion("product_images is not null");
            return (Criteria) this;
        }

        public Criteria andProductImagesEqualTo(String value) {
            addCriterion("product_images =", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotEqualTo(String value) {
            addCriterion("product_images <>", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesGreaterThan(String value) {
            addCriterion("product_images >", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesGreaterThanOrEqualTo(String value) {
            addCriterion("product_images >=", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesLessThan(String value) {
            addCriterion("product_images <", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesLessThanOrEqualTo(String value) {
            addCriterion("product_images <=", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesLike(String value) {
            addCriterion("product_images like", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotLike(String value) {
            addCriterion("product_images not like", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesIn(List<String> values) {
            addCriterion("product_images in", values, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotIn(List<String> values) {
            addCriterion("product_images not in", values, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesBetween(String value1, String value2) {
            addCriterion("product_images between", value1, value2, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotBetween(String value1, String value2) {
            addCriterion("product_images not between", value1, value2, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseIsNull() {
            addCriterion("product_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseIsNotNull() {
            addCriterion("product_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseEqualTo(String value) {
            addCriterion("product_warehouse =", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseNotEqualTo(String value) {
            addCriterion("product_warehouse <>", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseGreaterThan(String value) {
            addCriterion("product_warehouse >", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("product_warehouse >=", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseLessThan(String value) {
            addCriterion("product_warehouse <", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseLessThanOrEqualTo(String value) {
            addCriterion("product_warehouse <=", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseLike(String value) {
            addCriterion("product_warehouse like", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseNotLike(String value) {
            addCriterion("product_warehouse not like", value, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseIn(List<String> values) {
            addCriterion("product_warehouse in", values, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseNotIn(List<String> values) {
            addCriterion("product_warehouse not in", values, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseBetween(String value1, String value2) {
            addCriterion("product_warehouse between", value1, value2, "productWarehouse");
            return (Criteria) this;
        }

        public Criteria andProductWarehouseNotBetween(String value1, String value2) {
            addCriterion("product_warehouse not between", value1, value2, "productWarehouse");
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