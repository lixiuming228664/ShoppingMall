package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductImagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductImagesExample() {
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

        public Criteria andProductImagesIdIsNull() {
            addCriterion("product_images_id is null");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdIsNotNull() {
            addCriterion("product_images_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdEqualTo(Integer value) {
            addCriterion("product_images_id =", value, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdNotEqualTo(Integer value) {
            addCriterion("product_images_id <>", value, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdGreaterThan(Integer value) {
            addCriterion("product_images_id >", value, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_images_id >=", value, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdLessThan(Integer value) {
            addCriterion("product_images_id <", value, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_images_id <=", value, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdIn(List<Integer> values) {
            addCriterion("product_images_id in", values, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdNotIn(List<Integer> values) {
            addCriterion("product_images_id not in", values, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdBetween(Integer value1, Integer value2) {
            addCriterion("product_images_id between", value1, value2, "productImagesId");
            return (Criteria) this;
        }

        public Criteria andProductImagesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_images_id not between", value1, value2, "productImagesId");
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

        public Criteria andProductImagePathIsNull() {
            addCriterion("product_image_path is null");
            return (Criteria) this;
        }

        public Criteria andProductImagePathIsNotNull() {
            addCriterion("product_image_path is not null");
            return (Criteria) this;
        }

        public Criteria andProductImagePathEqualTo(String value) {
            addCriterion("product_image_path =", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathNotEqualTo(String value) {
            addCriterion("product_image_path <>", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathGreaterThan(String value) {
            addCriterion("product_image_path >", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("product_image_path >=", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathLessThan(String value) {
            addCriterion("product_image_path <", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathLessThanOrEqualTo(String value) {
            addCriterion("product_image_path <=", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathLike(String value) {
            addCriterion("product_image_path like", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathNotLike(String value) {
            addCriterion("product_image_path not like", value, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathIn(List<String> values) {
            addCriterion("product_image_path in", values, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathNotIn(List<String> values) {
            addCriterion("product_image_path not in", values, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathBetween(String value1, String value2) {
            addCriterion("product_image_path between", value1, value2, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImagePathNotBetween(String value1, String value2) {
            addCriterion("product_image_path not between", value1, value2, "productImagePath");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelIsNull() {
            addCriterion("product_image_is_del is null");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelIsNotNull() {
            addCriterion("product_image_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelEqualTo(Byte value) {
            addCriterion("product_image_is_del =", value, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelNotEqualTo(Byte value) {
            addCriterion("product_image_is_del <>", value, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelGreaterThan(Byte value) {
            addCriterion("product_image_is_del >", value, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_image_is_del >=", value, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelLessThan(Byte value) {
            addCriterion("product_image_is_del <", value, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("product_image_is_del <=", value, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelIn(List<Byte> values) {
            addCriterion("product_image_is_del in", values, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelNotIn(List<Byte> values) {
            addCriterion("product_image_is_del not in", values, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelBetween(Byte value1, Byte value2) {
            addCriterion("product_image_is_del between", value1, value2, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("product_image_is_del not between", value1, value2, "productImageIsDel");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeIsNull() {
            addCriterion("product_image_create_time is null");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeIsNotNull() {
            addCriterion("product_image_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeEqualTo(Date value) {
            addCriterion("product_image_create_time =", value, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeNotEqualTo(Date value) {
            addCriterion("product_image_create_time <>", value, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeGreaterThan(Date value) {
            addCriterion("product_image_create_time >", value, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_image_create_time >=", value, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeLessThan(Date value) {
            addCriterion("product_image_create_time <", value, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_image_create_time <=", value, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeIn(List<Date> values) {
            addCriterion("product_image_create_time in", values, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeNotIn(List<Date> values) {
            addCriterion("product_image_create_time not in", values, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeBetween(Date value1, Date value2) {
            addCriterion("product_image_create_time between", value1, value2, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_image_create_time not between", value1, value2, "productImageCreateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeIsNull() {
            addCriterion("product_image_update_time is null");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeIsNotNull() {
            addCriterion("product_image_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeEqualTo(Date value) {
            addCriterion("product_image_update_time =", value, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeNotEqualTo(Date value) {
            addCriterion("product_image_update_time <>", value, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeGreaterThan(Date value) {
            addCriterion("product_image_update_time >", value, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("product_image_update_time >=", value, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeLessThan(Date value) {
            addCriterion("product_image_update_time <", value, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("product_image_update_time <=", value, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeIn(List<Date> values) {
            addCriterion("product_image_update_time in", values, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeNotIn(List<Date> values) {
            addCriterion("product_image_update_time not in", values, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("product_image_update_time between", value1, value2, "productImageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andProductImageUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("product_image_update_time not between", value1, value2, "productImageUpdateTime");
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