package com.sdut.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPathExample() {
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

        public Criteria andUserPathIdIsNull() {
            addCriterion("user_path_id is null");
            return (Criteria) this;
        }

        public Criteria andUserPathIdIsNotNull() {
            addCriterion("user_path_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathIdEqualTo(Integer value) {
            addCriterion("user_path_id =", value, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdNotEqualTo(Integer value) {
            addCriterion("user_path_id <>", value, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdGreaterThan(Integer value) {
            addCriterion("user_path_id >", value, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_path_id >=", value, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdLessThan(Integer value) {
            addCriterion("user_path_id <", value, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_path_id <=", value, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdIn(List<Integer> values) {
            addCriterion("user_path_id in", values, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdNotIn(List<Integer> values) {
            addCriterion("user_path_id not in", values, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdBetween(Integer value1, Integer value2) {
            addCriterion("user_path_id between", value1, value2, "userPathId");
            return (Criteria) this;
        }

        public Criteria andUserPathIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_path_id not between", value1, value2, "userPathId");
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

        public Criteria andUserPathProvinceIsNull() {
            addCriterion("user_path_province is null");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceIsNotNull() {
            addCriterion("user_path_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceEqualTo(String value) {
            addCriterion("user_path_province =", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceNotEqualTo(String value) {
            addCriterion("user_path_province <>", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceGreaterThan(String value) {
            addCriterion("user_path_province >", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_path_province >=", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceLessThan(String value) {
            addCriterion("user_path_province <", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_path_province <=", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceLike(String value) {
            addCriterion("user_path_province like", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceNotLike(String value) {
            addCriterion("user_path_province not like", value, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceIn(List<String> values) {
            addCriterion("user_path_province in", values, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceNotIn(List<String> values) {
            addCriterion("user_path_province not in", values, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceBetween(String value1, String value2) {
            addCriterion("user_path_province between", value1, value2, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathProvinceNotBetween(String value1, String value2) {
            addCriterion("user_path_province not between", value1, value2, "userPathProvince");
            return (Criteria) this;
        }

        public Criteria andUserPathCityIsNull() {
            addCriterion("user_path_city is null");
            return (Criteria) this;
        }

        public Criteria andUserPathCityIsNotNull() {
            addCriterion("user_path_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathCityEqualTo(String value) {
            addCriterion("user_path_city =", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityNotEqualTo(String value) {
            addCriterion("user_path_city <>", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityGreaterThan(String value) {
            addCriterion("user_path_city >", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_path_city >=", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityLessThan(String value) {
            addCriterion("user_path_city <", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityLessThanOrEqualTo(String value) {
            addCriterion("user_path_city <=", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityLike(String value) {
            addCriterion("user_path_city like", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityNotLike(String value) {
            addCriterion("user_path_city not like", value, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityIn(List<String> values) {
            addCriterion("user_path_city in", values, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityNotIn(List<String> values) {
            addCriterion("user_path_city not in", values, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityBetween(String value1, String value2) {
            addCriterion("user_path_city between", value1, value2, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathCityNotBetween(String value1, String value2) {
            addCriterion("user_path_city not between", value1, value2, "userPathCity");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictIsNull() {
            addCriterion("user_path_district is null");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictIsNotNull() {
            addCriterion("user_path_district is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictEqualTo(String value) {
            addCriterion("user_path_district =", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictNotEqualTo(String value) {
            addCriterion("user_path_district <>", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictGreaterThan(String value) {
            addCriterion("user_path_district >", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("user_path_district >=", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictLessThan(String value) {
            addCriterion("user_path_district <", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictLessThanOrEqualTo(String value) {
            addCriterion("user_path_district <=", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictLike(String value) {
            addCriterion("user_path_district like", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictNotLike(String value) {
            addCriterion("user_path_district not like", value, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictIn(List<String> values) {
            addCriterion("user_path_district in", values, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictNotIn(List<String> values) {
            addCriterion("user_path_district not in", values, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictBetween(String value1, String value2) {
            addCriterion("user_path_district between", value1, value2, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDistrictNotBetween(String value1, String value2) {
            addCriterion("user_path_district not between", value1, value2, "userPathDistrict");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailIsNull() {
            addCriterion("user_path_detail is null");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailIsNotNull() {
            addCriterion("user_path_detail is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailEqualTo(String value) {
            addCriterion("user_path_detail =", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailNotEqualTo(String value) {
            addCriterion("user_path_detail <>", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailGreaterThan(String value) {
            addCriterion("user_path_detail >", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailGreaterThanOrEqualTo(String value) {
            addCriterion("user_path_detail >=", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailLessThan(String value) {
            addCriterion("user_path_detail <", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailLessThanOrEqualTo(String value) {
            addCriterion("user_path_detail <=", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailLike(String value) {
            addCriterion("user_path_detail like", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailNotLike(String value) {
            addCriterion("user_path_detail not like", value, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailIn(List<String> values) {
            addCriterion("user_path_detail in", values, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailNotIn(List<String> values) {
            addCriterion("user_path_detail not in", values, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailBetween(String value1, String value2) {
            addCriterion("user_path_detail between", value1, value2, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathDetailNotBetween(String value1, String value2) {
            addCriterion("user_path_detail not between", value1, value2, "userPathDetail");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeIsNull() {
            addCriterion("user_path_postcode is null");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeIsNotNull() {
            addCriterion("user_path_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeEqualTo(String value) {
            addCriterion("user_path_postcode =", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeNotEqualTo(String value) {
            addCriterion("user_path_postcode <>", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeGreaterThan(String value) {
            addCriterion("user_path_postcode >", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_path_postcode >=", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeLessThan(String value) {
            addCriterion("user_path_postcode <", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeLessThanOrEqualTo(String value) {
            addCriterion("user_path_postcode <=", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeLike(String value) {
            addCriterion("user_path_postcode like", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeNotLike(String value) {
            addCriterion("user_path_postcode not like", value, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeIn(List<String> values) {
            addCriterion("user_path_postcode in", values, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeNotIn(List<String> values) {
            addCriterion("user_path_postcode not in", values, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeBetween(String value1, String value2) {
            addCriterion("user_path_postcode between", value1, value2, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathPostcodeNotBetween(String value1, String value2) {
            addCriterion("user_path_postcode not between", value1, value2, "userPathPostcode");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeIsNull() {
            addCriterion("user_path_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeIsNotNull() {
            addCriterion("user_path_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeEqualTo(Date value) {
            addCriterion("user_path_create_time =", value, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeNotEqualTo(Date value) {
            addCriterion("user_path_create_time <>", value, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeGreaterThan(Date value) {
            addCriterion("user_path_create_time >", value, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_path_create_time >=", value, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeLessThan(Date value) {
            addCriterion("user_path_create_time <", value, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_path_create_time <=", value, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeIn(List<Date> values) {
            addCriterion("user_path_create_time in", values, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeNotIn(List<Date> values) {
            addCriterion("user_path_create_time not in", values, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_path_create_time between", value1, value2, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_path_create_time not between", value1, value2, "userPathCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeIsNull() {
            addCriterion("user_path_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeIsNotNull() {
            addCriterion("user_path_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeEqualTo(Date value) {
            addCriterion("user_path_update_time =", value, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeNotEqualTo(Date value) {
            addCriterion("user_path_update_time <>", value, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeGreaterThan(Date value) {
            addCriterion("user_path_update_time >", value, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_path_update_time >=", value, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeLessThan(Date value) {
            addCriterion("user_path_update_time <", value, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_path_update_time <=", value, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeIn(List<Date> values) {
            addCriterion("user_path_update_time in", values, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeNotIn(List<Date> values) {
            addCriterion("user_path_update_time not in", values, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("user_path_update_time between", value1, value2, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_path_update_time not between", value1, value2, "userPathUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserPathStateIsNull() {
            addCriterion("user_path_state is null");
            return (Criteria) this;
        }

        public Criteria andUserPathStateIsNotNull() {
            addCriterion("user_path_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathStateEqualTo(Byte value) {
            addCriterion("user_path_state =", value, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateNotEqualTo(Byte value) {
            addCriterion("user_path_state <>", value, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateGreaterThan(Byte value) {
            addCriterion("user_path_state >", value, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_path_state >=", value, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateLessThan(Byte value) {
            addCriterion("user_path_state <", value, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateLessThanOrEqualTo(Byte value) {
            addCriterion("user_path_state <=", value, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateIn(List<Byte> values) {
            addCriterion("user_path_state in", values, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateNotIn(List<Byte> values) {
            addCriterion("user_path_state not in", values, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateBetween(Byte value1, Byte value2) {
            addCriterion("user_path_state between", value1, value2, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathStateNotBetween(Byte value1, Byte value2) {
            addCriterion("user_path_state not between", value1, value2, "userPathState");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelIsNull() {
            addCriterion("user_path_is_del is null");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelIsNotNull() {
            addCriterion("user_path_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelEqualTo(Byte value) {
            addCriterion("user_path_is_del =", value, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelNotEqualTo(Byte value) {
            addCriterion("user_path_is_del <>", value, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelGreaterThan(Byte value) {
            addCriterion("user_path_is_del >", value, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_path_is_del >=", value, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelLessThan(Byte value) {
            addCriterion("user_path_is_del <", value, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("user_path_is_del <=", value, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelIn(List<Byte> values) {
            addCriterion("user_path_is_del in", values, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelNotIn(List<Byte> values) {
            addCriterion("user_path_is_del not in", values, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelBetween(Byte value1, Byte value2) {
            addCriterion("user_path_is_del between", value1, value2, "userPathIsDel");
            return (Criteria) this;
        }

        public Criteria andUserPathIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("user_path_is_del not between", value1, value2, "userPathIsDel");
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