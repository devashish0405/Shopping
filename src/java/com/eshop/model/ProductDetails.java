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
public class ProductDetails {
    private int productSerialNum;
    private int productId;
    private Date expieryDate;
    private int size;
    private String Color;
    private int SellerId;
    private Date manufactureDate;

    public ProductDetails(int productSerialNum, int productId, Date expieryDate, int size, String Color, int SellerId, Date manufactureDate) {
        this.productSerialNum = productSerialNum;
        this.productId = productId;
        this.expieryDate = expieryDate;
        this.size = size;
        this.Color = Color;
        this.SellerId = SellerId;
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getProductSerialNum() {
        return productSerialNum;
    }

    public void setProductSerialNum(int productSerialNum) {
        this.productSerialNum = productSerialNum;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getExpieryDate() {
        return expieryDate;
    }

    public void setExpieryDate(Date expieryDate) {
        this.expieryDate = expieryDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getSellerId() {
        return SellerId;
    }

    public void setSellerId(int SellerId) {
        this.SellerId = SellerId;
    }
    
    
}
