package com.spring.app.vo;

import java.util.Date;

public class OrderVO {
    private String orderId;
    private String orderBy;
    private Date lastUpdate;
    private Date orderDate;
    private Date oderDeliver;
    private String orderName;
    private Integer applicationType;
    private Date orderRisk;
    private String userId;

    public OrderVO(String orderId, String orderBy, Date lastUpdate, Date orderDate, Date oderDeliver, String orderName, Integer applicationType, Date orderRisk, String userId) {
        this.orderId = orderId;
        this.orderBy = orderBy;
        this.lastUpdate = lastUpdate;
        this.orderDate = orderDate;
        this.oderDeliver = oderDeliver;
        this.orderName = orderName;
        this.applicationType = applicationType;
        this.orderRisk = orderRisk;
        this.userId = userId;
    }

    public OrderVO() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOderDeliver() {
        return oderDeliver;
    }

    public void setOderDeliver(Date oderDeliver) {
        this.oderDeliver = oderDeliver;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(Integer applicationType) {
        this.applicationType = applicationType;
    }

    public Date getOrderRisk() {
        return orderRisk;
    }

    public void setOrderRisk(Date orderRisk) {
        this.orderRisk = orderRisk;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
