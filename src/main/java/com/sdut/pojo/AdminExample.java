package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccountEqualTo(String value) {
            addCriterion("admin_account =", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThan(String value) {
            addCriterion("admin_account >", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThan(String value) {
            addCriterion("admin_account <", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountLike(String value) {
            addCriterion("admin_account like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotLike(String value) {
            addCriterion("admin_account not like", value, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountIn(List<String> values) {
            addCriterion("admin_account in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminAccountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "adminAccount");
            return (Criteria) this;
        }

        public Criteria andAdminSaltIsNull() {
            addCriterion("admin_salt is null");
            return (Criteria) this;
        }

        public Criteria andAdminSaltIsNotNull() {
            addCriterion("admin_salt is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSaltEqualTo(String value) {
            addCriterion("admin_salt =", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotEqualTo(String value) {
            addCriterion("admin_salt <>", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltGreaterThan(String value) {
            addCriterion("admin_salt >", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltGreaterThanOrEqualTo(String value) {
            addCriterion("admin_salt >=", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltLessThan(String value) {
            addCriterion("admin_salt <", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltLessThanOrEqualTo(String value) {
            addCriterion("admin_salt <=", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltLike(String value) {
            addCriterion("admin_salt like", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotLike(String value) {
            addCriterion("admin_salt not like", value, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltIn(List<String> values) {
            addCriterion("admin_salt in", values, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotIn(List<String> values) {
            addCriterion("admin_salt not in", values, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltBetween(String value1, String value2) {
            addCriterion("admin_salt between", value1, value2, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminSaltNotBetween(String value1, String value2) {
            addCriterion("admin_salt not between", value1, value2, "adminSalt");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminImageIsNull() {
            addCriterion("admin_image is null");
            return (Criteria) this;
        }

        public Criteria andAdminImageIsNotNull() {
            addCriterion("admin_image is not null");
            return (Criteria) this;
        }

        public Criteria andAdminImageEqualTo(String value) {
            addCriterion("admin_image =", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotEqualTo(String value) {
            addCriterion("admin_image <>", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageGreaterThan(String value) {
            addCriterion("admin_image >", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageGreaterThanOrEqualTo(String value) {
            addCriterion("admin_image >=", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageLessThan(String value) {
            addCriterion("admin_image <", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageLessThanOrEqualTo(String value) {
            addCriterion("admin_image <=", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageLike(String value) {
            addCriterion("admin_image like", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotLike(String value) {
            addCriterion("admin_image not like", value, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageIn(List<String> values) {
            addCriterion("admin_image in", values, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotIn(List<String> values) {
            addCriterion("admin_image not in", values, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageBetween(String value1, String value2) {
            addCriterion("admin_image between", value1, value2, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminImageNotBetween(String value1, String value2) {
            addCriterion("admin_image not between", value1, value2, "adminImage");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameIsNull() {
            addCriterion("admin_nickname is null");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameIsNotNull() {
            addCriterion("admin_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameEqualTo(String value) {
            addCriterion("admin_nickname =", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotEqualTo(String value) {
            addCriterion("admin_nickname <>", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameGreaterThan(String value) {
            addCriterion("admin_nickname >", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_nickname >=", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameLessThan(String value) {
            addCriterion("admin_nickname <", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameLessThanOrEqualTo(String value) {
            addCriterion("admin_nickname <=", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameLike(String value) {
            addCriterion("admin_nickname like", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotLike(String value) {
            addCriterion("admin_nickname not like", value, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameIn(List<String> values) {
            addCriterion("admin_nickname in", values, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotIn(List<String> values) {
            addCriterion("admin_nickname not in", values, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameBetween(String value1, String value2) {
            addCriterion("admin_nickname between", value1, value2, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminNicknameNotBetween(String value1, String value2) {
            addCriterion("admin_nickname not between", value1, value2, "adminNickname");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelIsNull() {
            addCriterion("admin_is_del is null");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelIsNotNull() {
            addCriterion("admin_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelEqualTo(Byte value) {
            addCriterion("admin_is_del =", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelNotEqualTo(Byte value) {
            addCriterion("admin_is_del <>", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelGreaterThan(Byte value) {
            addCriterion("admin_is_del >", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("admin_is_del >=", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelLessThan(Byte value) {
            addCriterion("admin_is_del <", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("admin_is_del <=", value, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelIn(List<Byte> values) {
            addCriterion("admin_is_del in", values, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelNotIn(List<Byte> values) {
            addCriterion("admin_is_del not in", values, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelBetween(Byte value1, Byte value2) {
            addCriterion("admin_is_del between", value1, value2, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("admin_is_del not between", value1, value2, "adminIsDel");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNull() {
            addCriterion("admin_create_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIsNotNull() {
            addCriterion("admin_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeEqualTo(Date value) {
            addCriterion("admin_create_time =", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotEqualTo(Date value) {
            addCriterion("admin_create_time <>", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThan(Date value) {
            addCriterion("admin_create_time >", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_create_time >=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThan(Date value) {
            addCriterion("admin_create_time <", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_create_time <=", value, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeIn(List<Date> values) {
            addCriterion("admin_create_time in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotIn(List<Date> values) {
            addCriterion("admin_create_time not in", values, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeBetween(Date value1, Date value2) {
            addCriterion("admin_create_time between", value1, value2, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_create_time not between", value1, value2, "adminCreateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeIsNull() {
            addCriterion("admin_update_time is null");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeIsNotNull() {
            addCriterion("admin_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeEqualTo(Date value) {
            addCriterion("admin_update_time =", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeNotEqualTo(Date value) {
            addCriterion("admin_update_time <>", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeGreaterThan(Date value) {
            addCriterion("admin_update_time >", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_update_time >=", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeLessThan(Date value) {
            addCriterion("admin_update_time <", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("admin_update_time <=", value, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeIn(List<Date> values) {
            addCriterion("admin_update_time in", values, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeNotIn(List<Date> values) {
            addCriterion("admin_update_time not in", values, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("admin_update_time between", value1, value2, "adminUpdateTime");
            return (Criteria) this;
        }

        public Criteria andAdminUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("admin_update_time not between", value1, value2, "adminUpdateTime");
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