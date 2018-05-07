package com.sdut.pojo;

import java.util.Date;

public class Type {
    private Integer typeId;

    private String typeName;

    private Byte typeIsDel;

    private Byte typeLevel;

    private Integer typePid;

    private String typeParamA;

    private String typeParamB;

    private String typeParamC;

    private Date typeCreateTime;

    private Date typeUpdateTime;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Byte getTypeIsDel() {
        return typeIsDel;
    }

    public void setTypeIsDel(Byte typeIsDel) {
        this.typeIsDel = typeIsDel;
    }

    public Byte getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(Byte typeLevel) {
        this.typeLevel = typeLevel;
    }

    public Integer getTypePid() {
        return typePid;
    }

    public void setTypePid(Integer typePid) {
        this.typePid = typePid;
    }

    public String getTypeParamA() {
        return typeParamA;
    }

    public void setTypeParamA(String typeParamA) {
        this.typeParamA = typeParamA == null ? null : typeParamA.trim();
    }

    public String getTypeParamB() {
        return typeParamB;
    }

    public void setTypeParamB(String typeParamB) {
        this.typeParamB = typeParamB == null ? null : typeParamB.trim();
    }

    public String getTypeParamC() {
        return typeParamC;
    }

    public void setTypeParamC(String typeParamC) {
        this.typeParamC = typeParamC == null ? null : typeParamC.trim();
    }

    public Date getTypeCreateTime() {
        return typeCreateTime;
    }

    public void setTypeCreateTime(Date typeCreateTime) {
        this.typeCreateTime = typeCreateTime;
    }

    public Date getTypeUpdateTime() {
        return typeUpdateTime;
    }

    public void setTypeUpdateTime(Date typeUpdateTime) {
        this.typeUpdateTime = typeUpdateTime;
    }
}