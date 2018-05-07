package com.sdut.pojo;

import java.util.Date;

public class ProductImages {
    private Integer productImagesId;

    private Integer productId;

    private String productImagePath;

    private Byte productImageIsDel;

    private Date productImageCreateTime;

    private Date productImageUpdateTime;

    public Integer getProductImagesId() {
        return productImagesId;
    }

    public void setProductImagesId(Integer productImagesId) {
        this.productImagesId = productImagesId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath == null ? null : productImagePath.trim();
    }

    public Byte getProductImageIsDel() {
        return productImageIsDel;
    }

    public void setProductImageIsDel(Byte productImageIsDel) {
        this.productImageIsDel = productImageIsDel;
    }

    public Date getProductImageCreateTime() {
        return productImageCreateTime;
    }

    public void setProductImageCreateTime(Date productImageCreateTime) {
        this.productImageCreateTime = productImageCreateTime;
    }

    public Date getProductImageUpdateTime() {
        return productImageUpdateTime;
    }

    public void setProductImageUpdateTime(Date productImageUpdateTime) {
        this.productImageUpdateTime = productImageUpdateTime;
    }
}