/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.eshop.controller;
import com.eshop.DAO.UserDAO;
import com.eshop.db.DataSource;
import com.eshop.model.User;
import com.eshop.service.UserDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author iamsu
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String req=request.getHeader("referer");
        out.print(req);
        String mailId=request.getParameter("mailId");
        String password=request.getParameter("password");
        UserDAO ud=new UserDAOImpl();
        User user;
        RequestDispatcher rd=getServletContext().getRequestDispatcher("/index.html");
        if(req.contains("login")){
                
            
            user=new User(mailId,password);
            user=ud.readUser(user);
            out.print(user.getId());
            if(user.getId()!=0){
                rd=getServletContext().getRequestDispatcher("/Welcome.jsp");
            }
        }else if(req.contains("index")){
            try{
   //             out.println("Hrello");
            
            String firstName=request.getParameter("firstName");
           // String middleName=request.getParameter("middleName");
            String lastName=request.getParameter("lastName");
            //String phoneNumber=request.getParameter("phoneNumber");
            
            user=new User(firstName,lastName,mailId,password);
            user=ud.createUser(user);
            
                rd=getServletContext().getRequestDispatcher("/Welcome.jsp");
                
            if(user.error!=null){
                out.print(user.error);
                rd.include(request, response);
            }
            }
            catch(Exception e){out.println(e);}
        
        }
        rd.forward(request, response);
        
        
}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //To change body of generated methods, choose Tools | Templates.
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //To change body of generated methods, choose Tools | Templates.
        processRequest(req, resp);
    }

 /*  public static void main(String[] args) {
        DataSource d = new DataSource();
        User u;
        u = new User("g","r","dev@gm","123");
        try{
        d.setCon();
        d.getCon();
        System.out.println(d.getCon());
        d.setPs("insert into users(firstName,lastName,mailId,password) values (?,?,?,?)");
        d.getPs().setString(1,u.getFirstName());
      //  d.getPs().setString(6,u.getPhoneNumber());
        // d.getPs().setString(2,u.getMiddleName());
          d.getPs().setString(2,u.getLastName());
        
        d.getPs().setString(3,u.getMailId());
        d.getPs().setString(4,u.getPassword());
        
        d.getPs().executeUpdate();
        
        d.getCon().close();
    }
        
        catch(SQLException e){
            System.out.println(e);
   }
    }*/
}