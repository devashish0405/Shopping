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
public class User{
    private int Id;
    private String firstName;
    //private String middleName;
    private String lastName;
    private String mailId;
    private String password;
    private char gender;
    private Date dob;
   // private String phoneNumber;
    
    public String error;

    public User(String firstName,String lastName, String mailId, String password) {
        this.firstName = firstName;
     //   this.middleName = middleName;
        this.lastName = lastName;
        this.mailId = mailId;
        this.password = password;
       // this.phoneNumber =phoneNumber ;
    }
    

    public User(String mailId, String password) {
        this.mailId = mailId;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

  /*  public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }*/

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
  
}
