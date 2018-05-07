package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNull() {
            addCriterion("user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIsNotNull() {
            addCriterion("user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeEqualTo(Date value) {
            addCriterion("user_create_time =", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotEqualTo(Date value) {
            addCriterion("user_create_time <>", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThan(Date value) {
            addCriterion("user_create_time >", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create_time >=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThan(Date value) {
            addCriterion("user_create_time <", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_create_time <=", value, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeIn(List<Date> values) {
            addCriterion("user_create_time in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotIn(List<Date> values) {
            addCriterion("user_create_time not in", values, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_create_time between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_create_time not between", value1, value2, "userCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNull() {
            addCriterion("user_salt is null");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNotNull() {
            addCriterion("user_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUserSaltEqualTo(String value) {
            addCriterion("user_salt =", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotEqualTo(String value) {
            addCriterion("user_salt <>", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThan(String value) {
            addCriterion("user_salt >", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThanOrEqualTo(String value) {
            addCriterion("user_salt >=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThan(String value) {
            addCriterion("user_salt <", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThanOrEqualTo(String value) {
            addCriterion("user_salt <=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLike(String value) {
            addCriterion("user_salt like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotLike(String value) {
            addCriterion("user_salt not like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltIn(List<String> values) {
            addCriterion("user_salt in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotIn(List<String> values) {
            addCriterion("user_salt not in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltBetween(String value1, String value2) {
            addCriterion("user_salt between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotBetween(String value1, String value2) {
            addCriterion("user_salt not between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNull() {
            addCriterion("user_mobile is null");
            return (Criteria) this;
        }

        public Criteria andUserMobileIsNotNull() {
            addCriterion("user_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andUserMobileEqualTo(String value) {
            addCriterion("user_mobile =", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotEqualTo(String value) {
            addCriterion("user_mobile <>", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThan(String value) {
            addCriterion("user_mobile >", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileGreaterThanOrEqualTo(String value) {
            addCriterion("user_mobile >=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThan(String value) {
            addCriterion("user_mobile <", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLessThanOrEqualTo(String value) {
            addCriterion("user_mobile <=", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileLike(String value) {
            addCriterion("user_mobile like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotLike(String value) {
            addCriterion("user_mobile not like", value, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileIn(List<String> values) {
            addCriterion("user_mobile in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotIn(List<String> values) {
            addCriterion("user_mobile not in", values, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileBetween(String value1, String value2) {
            addCriterion("user_mobile between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMobileNotBetween(String value1, String value2) {
            addCriterion("user_mobile not between", value1, value2, "userMobile");
            return (Criteria) this;
        }

        public Criteria andUserMailboxIsNull() {
            addCriterion("user_mailbox is null");
            return (Criteria) this;
        }

        public Criteria andUserMailboxIsNotNull() {
            addCriterion("user_mailbox is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailboxEqualTo(String value) {
            addCriterion("user_mailbox =", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxNotEqualTo(String value) {
            addCriterion("user_mailbox <>", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxGreaterThan(String value) {
            addCriterion("user_mailbox >", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("user_mailbox >=", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxLessThan(String value) {
            addCriterion("user_mailbox <", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxLessThanOrEqualTo(String value) {
            addCriterion("user_mailbox <=", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxLike(String value) {
            addCriterion("user_mailbox like", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxNotLike(String value) {
            addCriterion("user_mailbox not like", value, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxIn(List<String> values) {
            addCriterion("user_mailbox in", values, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxNotIn(List<String> values) {
            addCriterion("user_mailbox not in", values, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxBetween(String value1, String value2) {
            addCriterion("user_mailbox between", value1, value2, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserMailboxNotBetween(String value1, String value2) {
            addCriterion("user_mailbox not between", value1, value2, "userMailbox");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNull() {
            addCriterion("user_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIsNotNull() {
            addCriterion("user_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeEqualTo(Date value) {
            addCriterion("user_update_time =", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotEqualTo(Date value) {
            addCriterion("user_update_time <>", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThan(Date value) {
            addCriterion("user_update_time >", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_update_time >=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThan(Date value) {
            addCriterion("user_update_time <", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_update_time <=", value, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeIn(List<Date> values) {
            addCriterion("user_update_time in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotIn(List<Date> values) {
            addCriterion("user_update_time not in", values, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("user_update_time between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_update_time not between", value1, value2, "userUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdIsNull() {
            addCriterion("user_handle_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdIsNotNull() {
            addCriterion("user_handle_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdEqualTo(Integer value) {
            addCriterion("user_handle_admin_id =", value, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdNotEqualTo(Integer value) {
            addCriterion("user_handle_admin_id <>", value, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdGreaterThan(Integer value) {
            addCriterion("user_handle_admin_id >", value, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_handle_admin_id >=", value, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdLessThan(Integer value) {
            addCriterion("user_handle_admin_id <", value, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_handle_admin_id <=", value, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdIn(List<Integer> values) {
            addCriterion("user_handle_admin_id in", values, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdNotIn(List<Integer> values) {
            addCriterion("user_handle_admin_id not in", values, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("user_handle_admin_id between", value1, value2, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_handle_admin_id not between", value1, value2, "userHandleAdminId");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeIsNull() {
            addCriterion("user_handle_admin_time is null");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeIsNotNull() {
            addCriterion("user_handle_admin_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeEqualTo(Date value) {
            addCriterion("user_handle_admin_time =", value, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeNotEqualTo(Date value) {
            addCriterion("user_handle_admin_time <>", value, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeGreaterThan(Date value) {
            addCriterion("user_handle_admin_time >", value, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_handle_admin_time >=", value, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeLessThan(Date value) {
            addCriterion("user_handle_admin_time <", value, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_handle_admin_time <=", value, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeIn(List<Date> values) {
            addCriterion("user_handle_admin_time in", values, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeNotIn(List<Date> values) {
            addCriterion("user_handle_admin_time not in", values, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeBetween(Date value1, Date value2) {
            addCriterion("user_handle_admin_time between", value1, value2, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserHandleAdminTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_handle_admin_time not between", value1, value2, "userHandleAdminTime");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNull() {
            addCriterion("user_state is null");
            return (Criteria) this;
        }

        public Criteria andUserStateIsNotNull() {
            addCriterion("user_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserStateEqualTo(Byte value) {
            addCriterion("user_state =", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotEqualTo(Byte value) {
            addCriterion("user_state <>", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThan(Byte value) {
            addCriterion("user_state >", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_state >=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThan(Byte value) {
            addCriterion("user_state <", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateLessThanOrEqualTo(Byte value) {
            addCriterion("user_state <=", value, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateIn(List<Byte> values) {
            addCriterion("user_state in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotIn(List<Byte> values) {
            addCriterion("user_state not in", values, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateBetween(Byte value1, Byte value2) {
            addCriterion("user_state between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserStateNotBetween(Byte value1, Byte value2) {
            addCriterion("user_state not between", value1, value2, "userState");
            return (Criteria) this;
        }

        public Criteria andUserIsDelIsNull() {
            addCriterion("user_is_del is null");
            return (Criteria) this;
        }

        public Criteria andUserIsDelIsNotNull() {
            addCriterion("user_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsDelEqualTo(Byte value) {
            addCriterion("user_is_del =", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelNotEqualTo(Byte value) {
            addCriterion("user_is_del <>", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelGreaterThan(Byte value) {
            addCriterion("user_is_del >", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_is_del >=", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelLessThan(Byte value) {
            addCriterion("user_is_del <", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("user_is_del <=", value, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelIn(List<Byte> values) {
            addCriterion("user_is_del in", values, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelNotIn(List<Byte> values) {
            addCriterion("user_is_del not in", values, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelBetween(Byte value1, Byte value2) {
            addCriterion("user_is_del between", value1, value2, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("user_is_del not between", value1, value2, "userIsDel");
            return (Criteria) this;
        }

        public Criteria andUserExpIsNull() {
            addCriterion("user_exp is null");
            return (Criteria) this;
        }

        public Criteria andUserExpIsNotNull() {
            addCriterion("user_exp is not null");
            return (Criteria) this;
        }

        public Criteria andUserExpEqualTo(Double value) {
            addCriterion("user_exp =", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpNotEqualTo(Double value) {
            addCriterion("user_exp <>", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpGreaterThan(Double value) {
            addCriterion("user_exp >", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpGreaterThanOrEqualTo(Double value) {
            addCriterion("user_exp >=", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpLessThan(Double value) {
            addCriterion("user_exp <", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpLessThanOrEqualTo(Double value) {
            addCriterion("user_exp <=", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpIn(List<Double> values) {
            addCriterion("user_exp in", values, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpNotIn(List<Double> values) {
            addCriterion("user_exp not in", values, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpBetween(Double value1, Double value2) {
            addCriterion("user_exp between", value1, value2, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpNotBetween(Double value1, Double value2) {
            addCriterion("user_exp not between", value1, value2, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Byte value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Byte value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Byte value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Byte value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Byte value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Byte> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Byte> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Byte value1, Byte value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
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