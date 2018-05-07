package com.sdut.pojo;

import java.util.Date;

public class UserInfo {
    private Integer userInfoId;

    private Integer userId;

    private String userIdcardno;

    private String userName;

    private String userCreditCard;

    private Byte userSex;

    private Date userInfoCreateTime;

    private Date userInfoUpdateTime;

    private Byte userInfoIsDel;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIdcardno() {
        return userIdcardno;
    }

    public void setUserIdcardno(String userIdcardno) {
        this.userIdcardno = userIdcardno == null ? null : userIdcardno.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCreditCard() {
        return userCreditCard;
    }

    public void setUserCreditCard(String userCreditCard) {
        this.userCreditCard = userCreditCard == null ? null : userCreditCard.trim();
    }

    public Byte getUserSex() {
        return userSex;
    }

    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    public Date getUserInfoCreateTime() {
        return userInfoCreateTime;
    }

    public void setUserInfoCreateTime(Date userInfoCreateTime) {
        this.userInfoCreateTime = userInfoCreateTime;
    }

    public Date getUserInfoUpdateTime() {
        return userInfoUpdateTime;
    }

    public void setUserInfoUpdateTime(Date userInfoUpdateTime) {
        this.userInfoUpdateTime = userInfoUpdateTime;
    }

    public Byte getUserInfoIsDel() {
        return userInfoIsDel;
    }

    public void setUserInfoIsDel(Byte userInfoIsDel) {
        this.userInfoIsDel = userInfoIsDel;
    }
}