/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eshop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Devashish Reddy
 */
public class DataSource {
    private Connection con;
    private PreparedStatement ps;
    String url="jdbc:odbc:ydsn";

    public Connection getCon() {
        return con;
    }

    public void setCon()throws SQLException {
        con=DriverManager.getConnection(url);
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public void setPs(String query)throws SQLException {
        ps=con.prepareCall(query);
    }
    
    
}
