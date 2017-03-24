<%-- 
    Document   : welcome
    Created on : Mar 21, 2017, 7:51:47 PM
    Author     : Devashish Reddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    
<style>
            .header{
                width: 100%;
                height: 50px;
                background-color: Orange;
                font-size: 50px;
                text-align: center;
                color: blue;
                padding: 15px 0px 15px 0px;
            }
            .content{
                width:100%;
            }
            .footer{
                 width: 100%;
                height: 30px;
                background-color: Orange;
                position: fixed;
                bottom: 0px;
                text-align: center;
                color: blue;
            }
             nav{
                background-color: brown;
                height: 30px;
                text-align: center;
            }
            nav a{
                font-size: 15px;
                background-color: wheat;
                padding: 5px 45px 5px 45px;
            }
            
        </style>
    </head>
    <body>
        <div class='header'>
            Flipkart
        </div>
            <nav>
                <a href='#'>Home</a>
                <a href='#'>About</a>
                <a href='#'>contact us</a>
                <a href='#'>Feedback</a> 
            </nav>
     
            <div class='footer'>
            &copy Copyright to NIIT. All rights received 2017
        </div>
    </body>
       
</html>
