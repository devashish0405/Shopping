/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eshop.model;

import java.awt.Image;
import java.util.Currency;

/**
 *
 * @author Devashish Reddy
 */
public class Product {
    private int productId;
    private String productName;
    private String description;
    private Currency price;
    private Image productImg;
    private int CategoryId;
    private String manufactureName;

    public Product(int productId, String productName, String description, Currency price, Image productImg, int CategoryId, String manufactureName) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.productImg = productImg;
        this.CategoryId = CategoryId;
        this.manufactureName = manufactureName;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public Image getProductImg() {
        return productImg;
    }

    public void setProductImg(Image productImg) {
        this.productImg = productImg;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }
    
    
}
