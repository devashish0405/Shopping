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
public class ShippingAddress {
    private String Location;
    private String State;
    private String phoneNumber;
    private int UserId;
    private int Pincode;
    private int Id;

    public ShippingAddress(String Location, String State, String phoneNumber, int UserId, int Pincode, int Id) {
        this.Location = Location;
        this.State = State;
        this.phoneNumber = phoneNumber;
        this.UserId = UserId;
        this.Pincode = Pincode;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getPincode() {
        return Pincode;
    }

    public void setPincode(int Pincode) {
        this.Pincode = Pincode;
    }
    
    
    
}
