package com.sdut.pojo;

import java.util.Date;

public class ProductParam {
    private Integer productParamId;

    private Integer productId;

    private String productParamKey;

    private String productParamValue;

    private Date productParamCreateTime;

    private Date productParamUpdateTime;

    private Byte productParamIsDel;

    public Integer getProductParamId() {
        return productParamId;
    }

    public void setProductParamId(Integer productParamId) {
        this.productParamId = productParamId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductParamKey() {
        return productParamKey;
    }

    public void setProductParamKey(String productParamKey) {
        this.productParamKey = productParamKey == null ? null : productParamKey.trim();
    }

    public String getProductParamValue() {
        return productParamValue;
    }

    public void setProductParamValue(String productParamValue) {
        this.productParamValue = productParamValue == null ? null : productParamValue.trim();
    }

    public Date getProductParamCreateTime() {
        return productParamCreateTime;
    }

    public void setProductParamCreateTime(Date productParamCreateTime) {
        this.productParamCreateTime = productParamCreateTime;
    }

    public Date getProductParamUpdateTime() {
        return productParamUpdateTime;
    }

    public void setProductParamUpdateTime(Date productParamUpdateTime) {
        this.productParamUpdateTime = productParamUpdateTime;
    }

    public Byte getProductParamIsDel() {
        return productParamIsDel;
    }

    public void setProductParamIsDel(Byte productParamIsDel) {
        this.productParamIsDel = productParamIsDel;
    }
}