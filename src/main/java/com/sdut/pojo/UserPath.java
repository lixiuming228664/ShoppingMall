package com.sdut.pojo;

import java.util.Date;

public class UserPath {
    private Integer userPathId;

    private Integer userId;

    private String userPathProvince;

    private String userPathCity;

    private String userPathDistrict;

    private String userPathDetail;

    private String userPathPostcode;

    private Date userPathCreateTime;

    private Date userPathUpdateTime;

    private Byte userPathState;

    private Byte userPathIsDel;

    public Integer getUserPathId() {
        return userPathId;
    }

    public void setUserPathId(Integer userPathId) {
        this.userPathId = userPathId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPathProvince() {
        return userPathProvince;
    }

    public void setUserPathProvince(String userPathProvince) {
        this.userPathProvince = userPathProvince == null ? null : userPathProvince.trim();
    }

    public String getUserPathCity() {
        return userPathCity;
    }

    public void setUserPathCity(String userPathCity) {
        this.userPathCity = userPathCity == null ? null : userPathCity.trim();
    }

    public String getUserPathDistrict() {
        return userPathDistrict;
    }

    public void setUserPathDistrict(String userPathDistrict) {
        this.userPathDistrict = userPathDistrict == null ? null : userPathDistrict.trim();
    }

    public String getUserPathDetail() {
        return userPathDetail;
    }

    public void setUserPathDetail(String userPathDetail) {
        this.userPathDetail = userPathDetail == null ? null : userPathDetail.trim();
    }

    public String getUserPathPostcode() {
        return userPathPostcode;
    }

    public void setUserPathPostcode(String userPathPostcode) {
        this.userPathPostcode = userPathPostcode == null ? null : userPathPostcode.trim();
    }

    public Date getUserPathCreateTime() {
        return userPathCreateTime;
    }

    public void setUserPathCreateTime(Date userPathCreateTime) {
        this.userPathCreateTime = userPathCreateTime;
    }

    public Date getUserPathUpdateTime() {
        return userPathUpdateTime;
    }

    public void setUserPathUpdateTime(Date userPathUpdateTime) {
        this.userPathUpdateTime = userPathUpdateTime;
    }

    public Byte getUserPathState() {
        return userPathState;
    }

    public void setUserPathState(Byte userPathState) {
        this.userPathState = userPathState;
    }

    public Byte getUserPathIsDel() {
        return userPathIsDel;
    }

    public void setUserPathIsDel(Byte userPathIsDel) {
        this.userPathIsDel = userPathIsDel;
    }
}