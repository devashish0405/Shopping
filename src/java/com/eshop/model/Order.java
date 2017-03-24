/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eshop.model;

import java.util.Currency;
import java.util.Date;

/**
 *
 * @author Devashish Reddy
 */
public class Order {
    private int OrderId;
    private int customerId;
    private int ShippingId;
    private Currency totalCost;
    private Currency ShippingCost;  
    private Currency OrderCost;
    private String status;
    private Date OrderDate;
    private Date ShippedDate;
    private Date DueDate;

    public Order(int OrderId, int customerId, int ShippingId, Currency totalCost, Currency ShippingCost, Currency OrderCost, String status, Date OrderDate, Date ShippedDate, Date DueDate) {
        this.OrderId = OrderId;
        this.customerId = customerId;
        this.ShippingId = ShippingId;
        this.totalCost = totalCost;
        this.ShippingCost = ShippingCost;
        this.OrderCost = OrderCost;
        this.status = status;
        this.OrderDate = OrderDate;
        this.ShippedDate = ShippedDate;
        this.DueDate = DueDate;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getShippingId() {
        return ShippingId;
    }

    public void setShippingId(int ShippingId) {
        this.ShippingId = ShippingId;
    }

    public Currency getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Currency totalCost) {
        this.totalCost = totalCost;
    }

    public Currency getShippingCost() {
        return ShippingCost;
    }

    public void setShippingCost(Currency ShippingCost) {
        this.ShippingCost = ShippingCost;
    }

    public Currency getOrderCost() {
        return OrderCost;
    }

    public void setOrderCost(Currency OrderCost) {
        this.OrderCost = OrderCost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Date getShippedDate() {
        return ShippedDate;
    }

    public void setShippedDate(Date ShippedDate) {
        this.ShippedDate = ShippedDate;
    }
    
      
}
