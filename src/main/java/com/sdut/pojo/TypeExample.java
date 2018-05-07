package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeExample() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelIsNull() {
            addCriterion("type_is_del is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelIsNotNull() {
            addCriterion("type_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelEqualTo(Byte value) {
            addCriterion("type_is_del =", value, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelNotEqualTo(Byte value) {
            addCriterion("type_is_del <>", value, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelGreaterThan(Byte value) {
            addCriterion("type_is_del >", value, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_is_del >=", value, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelLessThan(Byte value) {
            addCriterion("type_is_del <", value, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("type_is_del <=", value, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelIn(List<Byte> values) {
            addCriterion("type_is_del in", values, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelNotIn(List<Byte> values) {
            addCriterion("type_is_del not in", values, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelBetween(Byte value1, Byte value2) {
            addCriterion("type_is_del between", value1, value2, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("type_is_del not between", value1, value2, "typeIsDel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIsNull() {
            addCriterion("type_level is null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIsNotNull() {
            addCriterion("type_level is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLevelEqualTo(Byte value) {
            addCriterion("type_level =", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotEqualTo(Byte value) {
            addCriterion("type_level <>", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThan(Byte value) {
            addCriterion("type_level >", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_level >=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThan(Byte value) {
            addCriterion("type_level <", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelLessThanOrEqualTo(Byte value) {
            addCriterion("type_level <=", value, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelIn(List<Byte> values) {
            addCriterion("type_level in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotIn(List<Byte> values) {
            addCriterion("type_level not in", values, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelBetween(Byte value1, Byte value2) {
            addCriterion("type_level between", value1, value2, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypeLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("type_level not between", value1, value2, "typeLevel");
            return (Criteria) this;
        }

        public Criteria andTypePidIsNull() {
            addCriterion("type_pid is null");
            return (Criteria) this;
        }

        public Criteria andTypePidIsNotNull() {
            addCriterion("type_pid is not null");
            return (Criteria) this;
        }

        public Criteria andTypePidEqualTo(Integer value) {
            addCriterion("type_pid =", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotEqualTo(Integer value) {
            addCriterion("type_pid <>", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidGreaterThan(Integer value) {
            addCriterion("type_pid >", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_pid >=", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidLessThan(Integer value) {
            addCriterion("type_pid <", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidLessThanOrEqualTo(Integer value) {
            addCriterion("type_pid <=", value, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidIn(List<Integer> values) {
            addCriterion("type_pid in", values, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotIn(List<Integer> values) {
            addCriterion("type_pid not in", values, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidBetween(Integer value1, Integer value2) {
            addCriterion("type_pid between", value1, value2, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypePidNotBetween(Integer value1, Integer value2) {
            addCriterion("type_pid not between", value1, value2, "typePid");
            return (Criteria) this;
        }

        public Criteria andTypeParamAIsNull() {
            addCriterion("type_param_a is null");
            return (Criteria) this;
        }

        public Criteria andTypeParamAIsNotNull() {
            addCriterion("type_param_a is not null");
            return (Criteria) this;
        }

        public Criteria andTypeParamAEqualTo(String value) {
            addCriterion("type_param_a =", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamANotEqualTo(String value) {
            addCriterion("type_param_a <>", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamAGreaterThan(String value) {
            addCriterion("type_param_a >", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamAGreaterThanOrEqualTo(String value) {
            addCriterion("type_param_a >=", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamALessThan(String value) {
            addCriterion("type_param_a <", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamALessThanOrEqualTo(String value) {
            addCriterion("type_param_a <=", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamALike(String value) {
            addCriterion("type_param_a like", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamANotLike(String value) {
            addCriterion("type_param_a not like", value, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamAIn(List<String> values) {
            addCriterion("type_param_a in", values, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamANotIn(List<String> values) {
            addCriterion("type_param_a not in", values, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamABetween(String value1, String value2) {
            addCriterion("type_param_a between", value1, value2, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamANotBetween(String value1, String value2) {
            addCriterion("type_param_a not between", value1, value2, "typeParamA");
            return (Criteria) this;
        }

        public Criteria andTypeParamBIsNull() {
            addCriterion("type_param_b is null");
            return (Criteria) this;
        }

        public Criteria andTypeParamBIsNotNull() {
            addCriterion("type_param_b is not null");
            return (Criteria) this;
        }

        public Criteria andTypeParamBEqualTo(String value) {
            addCriterion("type_param_b =", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBNotEqualTo(String value) {
            addCriterion("type_param_b <>", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBGreaterThan(String value) {
            addCriterion("type_param_b >", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBGreaterThanOrEqualTo(String value) {
            addCriterion("type_param_b >=", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBLessThan(String value) {
            addCriterion("type_param_b <", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBLessThanOrEqualTo(String value) {
            addCriterion("type_param_b <=", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBLike(String value) {
            addCriterion("type_param_b like", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBNotLike(String value) {
            addCriterion("type_param_b not like", value, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBIn(List<String> values) {
            addCriterion("type_param_b in", values, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBNotIn(List<String> values) {
            addCriterion("type_param_b not in", values, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBBetween(String value1, String value2) {
            addCriterion("type_param_b between", value1, value2, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamBNotBetween(String value1, String value2) {
            addCriterion("type_param_b not between", value1, value2, "typeParamB");
            return (Criteria) this;
        }

        public Criteria andTypeParamCIsNull() {
            addCriterion("type_param_c is null");
            return (Criteria) this;
        }

        public Criteria andTypeParamCIsNotNull() {
            addCriterion("type_param_c is not null");
            return (Criteria) this;
        }

        public Criteria andTypeParamCEqualTo(String value) {
            addCriterion("type_param_c =", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCNotEqualTo(String value) {
            addCriterion("type_param_c <>", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCGreaterThan(String value) {
            addCriterion("type_param_c >", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCGreaterThanOrEqualTo(String value) {
            addCriterion("type_param_c >=", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCLessThan(String value) {
            addCriterion("type_param_c <", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCLessThanOrEqualTo(String value) {
            addCriterion("type_param_c <=", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCLike(String value) {
            addCriterion("type_param_c like", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCNotLike(String value) {
            addCriterion("type_param_c not like", value, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCIn(List<String> values) {
            addCriterion("type_param_c in", values, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCNotIn(List<String> values) {
            addCriterion("type_param_c not in", values, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCBetween(String value1, String value2) {
            addCriterion("type_param_c between", value1, value2, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeParamCNotBetween(String value1, String value2) {
            addCriterion("type_param_c not between", value1, value2, "typeParamC");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeIsNull() {
            addCriterion("type_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeIsNotNull() {
            addCriterion("type_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeEqualTo(Date value) {
            addCriterion("type_create_time =", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeNotEqualTo(Date value) {
            addCriterion("type_create_time <>", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeGreaterThan(Date value) {
            addCriterion("type_create_time >", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("type_create_time >=", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeLessThan(Date value) {
            addCriterion("type_create_time <", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("type_create_time <=", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeIn(List<Date> values) {
            addCriterion("type_create_time in", values, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeNotIn(List<Date> values) {
            addCriterion("type_create_time not in", values, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("type_create_time between", value1, value2, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("type_create_time not between", value1, value2, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeIsNull() {
            addCriterion("type_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeIsNotNull() {
            addCriterion("type_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeEqualTo(Date value) {
            addCriterion("type_update_time =", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeNotEqualTo(Date value) {
            addCriterion("type_update_time <>", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeGreaterThan(Date value) {
            addCriterion("type_update_time >", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("type_update_time >=", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeLessThan(Date value) {
            addCriterion("type_update_time <", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("type_update_time <=", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeIn(List<Date> values) {
            addCriterion("type_update_time in", values, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeNotIn(List<Date> values) {
            addCriterion("type_update_time not in", values, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("type_update_time between", value1, value2, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("type_update_time not between", value1, value2, "typeUpdateTime");
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