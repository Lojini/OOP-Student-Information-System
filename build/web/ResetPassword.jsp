<%-- 
    Document   : ResetPassword
    Created on : Jun 11, 2018, 8:42:01 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*"%>
<%@page import="com.oop.util.DbConnect" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
.ps {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 1000px;
    margin-top: 50px;
    
    
}

.ps td, #course th {
    border: 1px solid black;
    padding: 8px;
}

.ps tr:nth-child(even){background-color: #f2f2f2;}

.ps tr:hover {background-color: #ddd;}

.ps th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #00BF9A;
    color: white;
}
</style>
    </head>
    <body>
      
<form method="post">
<table class="ps" align="center" >
      
<tr><td>Current Password</td><td><input type="password" name="current" ></td></tr>
<tr><td>New Password</td><td><input type="password" name="new"></td></tr>
<tr><td>Confirm Password</td><td><input type="password" name="confirm"></td></tr>
<tr><td><input type="submit" value="Change Password"></td></tr>
 <%
                                    
                                    String Id = (String) session.getAttribute("Username");
                                    String currentPassword=request.getParameter("current");
                                    String Newpass=request.getParameter("new");
                                    String conpass=request.getParameter("confirm");
                                    String pass="";
                                    try {
                                       
                                     DbConnect db=new DbConnect();
                                     Connection connection = db.getDBConnection();
                                     Statement myStm=connection.createStatement();
                                      if (session != null) {
			                    if (session.getAttribute("Username") != null) {
                                     String query = "select * from register where StudentRegNo='"+Id+"'";
                                    
                                     ResultSet resultSet = myStm.executeQuery(query);
                                     while(resultSet.next()){
                                
                                          pass=resultSet.getString("password");
                                          if(currentPassword.equals(pass)){
                                              if(Newpass.equals(conpass)){
                                       Statement st1=connection.createStatement();
                                     st1.executeUpdate("update register set password='"+Newpass+"' where StudentRegNo='"+Id+"'");
                                        response.sendRedirect("login.jsp");}
                                              else
                                                 out.println("Password does not match");}
                                          else
                                               out.println("Entered Current Password is wrong!");
                                      %>
</table>
                                            <%
      }}}
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   %>
</form>

</html>
