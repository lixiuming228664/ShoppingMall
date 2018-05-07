package com.sdut.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer orderUserId;

    private Integer orderUserPathId;

    private String orderNumber;

    private Byte orderState;

    private Double orderSumPrice;

    private Date orderCreateTime;

    private Date orderUpdateTime;

    private Byte orderIsDel;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public Integer getOrderUserPathId() {
        return orderUserPathId;
    }

    public void setOrderUserPathId(Integer orderUserPathId) {
        this.orderUserPathId = orderUserPathId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    public Byte getOrderState() {
        return orderState;
    }

    public void setOrderState(Byte orderState) {
        this.orderState = orderState;
    }

    public Double getOrderSumPrice() {
        return orderSumPrice;
    }

    public void setOrderSumPrice(Double orderSumPrice) {
        this.orderSumPrice = orderSumPrice;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Date getOrderUpdateTime() {
        return orderUpdateTime;
    }

    public void setOrderUpdateTime(Date orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
    }

    public Byte getOrderIsDel() {
        return orderIsDel;
    }

    public void setOrderIsDel(Byte orderIsDel) {
        this.orderIsDel = orderIsDel;
    }
}