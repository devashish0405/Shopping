/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eshop.model;

/**
 *
 * @author Devashish Reddy
 */
public class OrderDetails {
    private int ID;
    private int OrderID;
    private int productId;
    private int quantity;
    private Number TrackingNumber;
    private int SpecialOfferId;

    public OrderDetails(int ID, int OrderID, int productId, int quantity, Number TrackingNumber, int SpecialOfferId) {
        this.ID = ID;
        this.OrderID = OrderID;
        this.productId = productId;
        this.quantity = quantity;
        this.TrackingNumber = TrackingNumber;
        this.SpecialOfferId = SpecialOfferId;
    }

    public int getSpecialOfferId() {
        return SpecialOfferId;
    }

    public void setSpecialOfferId(int SpecialOfferId) {
        this.SpecialOfferId = SpecialOfferId;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Number getTrackingNumber() {
        return TrackingNumber;
    }

    public void setTrackingNumber(Number TrackingNumber) {
        this.TrackingNumber = TrackingNumber;
    }
    
    
    
    
}
