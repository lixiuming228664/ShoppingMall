package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUserInfoIdIsNull() {
            addCriterion("user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNotNull() {
            addCriterion("user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdEqualTo(Integer value) {
            addCriterion("user_info_id =", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotEqualTo(Integer value) {
            addCriterion("user_info_id <>", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThan(Integer value) {
            addCriterion("user_info_id >", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_info_id >=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThan(Integer value) {
            addCriterion("user_info_id <", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_info_id <=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIn(List<Integer> values) {
            addCriterion("user_info_id in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotIn(List<Integer> values) {
            addCriterion("user_info_id not in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("user_info_id between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_info_id not between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoIsNull() {
            addCriterion("user_idcardno is null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoIsNotNull() {
            addCriterion("user_idcardno is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoEqualTo(String value) {
            addCriterion("user_idcardno =", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoNotEqualTo(String value) {
            addCriterion("user_idcardno <>", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoGreaterThan(String value) {
            addCriterion("user_idcardno >", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("user_idcardno >=", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoLessThan(String value) {
            addCriterion("user_idcardno <", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("user_idcardno <=", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoLike(String value) {
            addCriterion("user_idcardno like", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoNotLike(String value) {
            addCriterion("user_idcardno not like", value, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoIn(List<String> values) {
            addCriterion("user_idcardno in", values, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoNotIn(List<String> values) {
            addCriterion("user_idcardno not in", values, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoBetween(String value1, String value2) {
            addCriterion("user_idcardno between", value1, value2, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserIdcardnoNotBetween(String value1, String value2) {
            addCriterion("user_idcardno not between", value1, value2, "userIdcardno");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardIsNull() {
            addCriterion("user_credit_card is null");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardIsNotNull() {
            addCriterion("user_credit_card is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardEqualTo(String value) {
            addCriterion("user_credit_card =", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardNotEqualTo(String value) {
            addCriterion("user_credit_card <>", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardGreaterThan(String value) {
            addCriterion("user_credit_card >", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardGreaterThanOrEqualTo(String value) {
            addCriterion("user_credit_card >=", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardLessThan(String value) {
            addCriterion("user_credit_card <", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardLessThanOrEqualTo(String value) {
            addCriterion("user_credit_card <=", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardLike(String value) {
            addCriterion("user_credit_card like", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardNotLike(String value) {
            addCriterion("user_credit_card not like", value, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardIn(List<String> values) {
            addCriterion("user_credit_card in", values, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardNotIn(List<String> values) {
            addCriterion("user_credit_card not in", values, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardBetween(String value1, String value2) {
            addCriterion("user_credit_card between", value1, value2, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserCreditCardNotBetween(String value1, String value2) {
            addCriterion("user_credit_card not between", value1, value2, "userCreditCard");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Byte value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Byte value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Byte value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Byte value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Byte value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Byte> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Byte> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Byte value1, Byte value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Byte value1, Byte value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeIsNull() {
            addCriterion("user_info_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeIsNotNull() {
            addCriterion("user_info_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeEqualTo(Date value) {
            addCriterion("user_info_create_time =", value, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeNotEqualTo(Date value) {
            addCriterion("user_info_create_time <>", value, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeGreaterThan(Date value) {
            addCriterion("user_info_create_time >", value, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_info_create_time >=", value, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeLessThan(Date value) {
            addCriterion("user_info_create_time <", value, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_info_create_time <=", value, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeIn(List<Date> values) {
            addCriterion("user_info_create_time in", values, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeNotIn(List<Date> values) {
            addCriterion("user_info_create_time not in", values, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_info_create_time between", value1, value2, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_info_create_time not between", value1, value2, "userInfoCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeIsNull() {
            addCriterion("user_info_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeIsNotNull() {
            addCriterion("user_info_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeEqualTo(Date value) {
            addCriterion("user_info_update_time =", value, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeNotEqualTo(Date value) {
            addCriterion("user_info_update_time <>", value, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeGreaterThan(Date value) {
            addCriterion("user_info_update_time >", value, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_info_update_time >=", value, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeLessThan(Date value) {
            addCriterion("user_info_update_time <", value, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_info_update_time <=", value, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeIn(List<Date> values) {
            addCriterion("user_info_update_time in", values, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeNotIn(List<Date> values) {
            addCriterion("user_info_update_time not in", values, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("user_info_update_time between", value1, value2, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_info_update_time not between", value1, value2, "userInfoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelIsNull() {
            addCriterion("user_info_is_del is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelIsNotNull() {
            addCriterion("user_info_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelEqualTo(Byte value) {
            addCriterion("user_info_is_del =", value, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelNotEqualTo(Byte value) {
            addCriterion("user_info_is_del <>", value, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelGreaterThan(Byte value) {
            addCriterion("user_info_is_del >", value, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_info_is_del >=", value, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelLessThan(Byte value) {
            addCriterion("user_info_is_del <", value, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("user_info_is_del <=", value, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelIn(List<Byte> values) {
            addCriterion("user_info_is_del in", values, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelNotIn(List<Byte> values) {
            addCriterion("user_info_is_del not in", values, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelBetween(Byte value1, Byte value2) {
            addCriterion("user_info_is_del between", value1, value2, "userInfoIsDel");
            return (Criteria) this;
        }

        public Criteria andUserInfoIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("user_info_is_del not between", value1, value2, "userInfoIsDel");
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