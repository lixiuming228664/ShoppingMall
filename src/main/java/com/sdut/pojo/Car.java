package com.sdut.pojo;

public class Car {
    private Integer carId;

    private Integer carUserId;

    private String carName;

    private Double carSumPrice;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarUserId() {
        return carUserId;
    }

    public void setCarUserId(Integer carUserId) {
        this.carUserId = carUserId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public Double getCarSumPrice() {
        return carSumPrice;
    }

    public void setCarSumPrice(Double carSumPrice) {
        this.carSumPrice = carSumPrice;
    }
}