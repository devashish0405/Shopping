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
public class Role {
    private int UserId;
    private String Role;
    private int RoleId;

    public Role(int UserId, String Role, int RoleId) {
        this.UserId = UserId;
        this.Role = Role;
        this.RoleId = RoleId;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
}
