/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eshop.model;

import java.util.Date;

/**
 *
 * @author Devashish Reddy
 */
public class Transaction {
    private int Id;
    private String payType;
    private Date Date;
    private int OrderId;
    private int paymentTransactionId;

    public Transaction(int Id, String payType, Date Date, int OrderId, int paymentTransactionId) {
        this.Id = Id;
        this.payType = payType;
        this.Date = Date;
        this.OrderId = OrderId;
        this.paymentTransactionId = paymentTransactionId;
    }

    public int getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(int paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }
    
}
