package com.sdut.pojo;

import java.util.Date;

public class Product {
    private Integer productId;

    private String productName;

    private Double productPrice;

    private Integer productCount;

    private Byte productState;

    private Byte productIsDel;

    private Byte productTypeId;

    private Date productCreateTime;

    private Date productUpdateTime;

    private String productImages;

    private String productWarehouse;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Byte getProductState() {
        return productState;
    }

    public void setProductState(Byte productState) {
        this.productState = productState;
    }

    public Byte getProductIsDel() {
        return productIsDel;
    }

    public void setProductIsDel(Byte productIsDel) {
        this.productIsDel = productIsDel;
    }

    public Byte getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Byte productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Date getProductCreateTime() {
        return productCreateTime;
    }

    public void setProductCreateTime(Date productCreateTime) {
        this.productCreateTime = productCreateTime;
    }

    public Date getProductUpdateTime() {
        return productUpdateTime;
    }

    public void setProductUpdateTime(Date productUpdateTime) {
        this.productUpdateTime = productUpdateTime;
    }

    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages == null ? null : productImages.trim();
    }

    public String getProductWarehouse() {
        return productWarehouse;
    }

    public void setProductWarehouse(String productWarehouse) {
        this.productWarehouse = productWarehouse == null ? null : productWarehouse.trim();
    }
}