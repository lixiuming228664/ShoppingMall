package com.sdut.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userNickname;

    private Date userCreateTime;

    private String userAccount;

    private String userSalt;

    private String userPassword;

    private String userMobile;

    private String userMailbox;

    private Date userUpdateTime;

    private Integer userHandleAdminId;

    private Date userHandleAdminTime;

    private Byte userState;

    private Byte userIsDel;

    private Double userExp;

    private Byte userLevel;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserMailbox() {
        return userMailbox;
    }

    public void setUserMailbox(String userMailbox) {
        this.userMailbox = userMailbox == null ? null : userMailbox.trim();
    }

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public Integer getUserHandleAdminId() {
        return userHandleAdminId;
    }

    public void setUserHandleAdminId(Integer userHandleAdminId) {
        this.userHandleAdminId = userHandleAdminId;
    }

    public Date getUserHandleAdminTime() {
        return userHandleAdminTime;
    }

    public void setUserHandleAdminTime(Date userHandleAdminTime) {
        this.userHandleAdminTime = userHandleAdminTime;
    }

    public Byte getUserState() {
        return userState;
    }

    public void setUserState(Byte userState) {
        this.userState = userState;
    }

    public Byte getUserIsDel() {
        return userIsDel;
    }

    public void setUserIsDel(Byte userIsDel) {
        this.userIsDel = userIsDel;
    }

    public Double getUserExp() {
        return userExp;
    }

    public void setUserExp(Double userExp) {
        this.userExp = userExp;
    }

    public Byte getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
    }
}