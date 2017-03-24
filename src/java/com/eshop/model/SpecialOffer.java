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
public class SpecialOffer {
    private int OfferId;
    private String Discount;
    private Date startDt;
    private Date EndDt;
    private int MinQ;
    private int MaxQ;

    public SpecialOffer(int OfferId, String Discount, Date startDt, Date EndDt, int MinQ, int MaxQ) {
        this.OfferId = OfferId;
        this.Discount = Discount;
        this.startDt = startDt;
        this.EndDt = EndDt;
        this.MinQ = MinQ;
        this.MaxQ = MaxQ;
    }

    public int getMaxQ() {
        return MaxQ;
    }

    public void setMaxQ(int MaxQ) {
        this.MaxQ = MaxQ;
    }

    public int getOfferId() {
        return OfferId;
    }

    public void setOfferId(int OfferId) {
        this.OfferId = OfferId;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    public Date getEndDt() {
        return EndDt;
    }

    public void setEndDt(Date EndDt) {
        this.EndDt = EndDt;
    }

    public int getMinQ() {
        return MinQ;
    }

    public void setMinQ(int MinQ) {
        this.MinQ = MinQ;
    }
    
    
}
