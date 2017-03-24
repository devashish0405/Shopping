/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eshop.DAO;
import com.eshop.model.User;
/**
 *
 * @author Devashish Reddy
 */
public interface UserDAO {
    public User createUser(User u);
    public User readUser(User u);
    public void updateUser(User u);
    public void deleteUser(User u);
    
    
}
