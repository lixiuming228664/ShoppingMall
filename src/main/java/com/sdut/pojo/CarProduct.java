package com.sdut.pojo;

public class CarProduct {
    private Integer carProductId;

    private Integer productId;

    private Integer productCount;

    private Double productPrice;

    private Byte carProductIsDel;

    public Integer getCarProductId() {
        return carProductId;
    }

    public void setCarProductId(Integer carProductId) {
        this.carProductId = carProductId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Byte getCarProductIsDel() {
        return carProductIsDel;
    }

    public void setCarProductIsDel(Byte carProductIsDel) {
        this.carProductIsDel = carProductIsDel;
    }
}