<%-- 
    Document   : UpdateCourse
    Created on : May 18, 2018, 11:58:15 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%@page import="com.oop.util.DbConnect" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 70%;
   margin-left:15%;
  margin-bottom:15%;
 margin-top:5%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: center;
    padding: 15px;
    width:50%;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
    </head>
    <body>
       
           
		<table>
                    <form method="POST" action="UpdateUserServlet">
                        
                        
                               
                                <%
                                    
                                    String Id = (String) session.getAttribute("Username");
                                   try {
                                       
                                     DbConnect db=new DbConnect();
                                     Connection connection = db.getDBConnection();
                                     Statement myStm=connection.createStatement();
                                      if (session != null) {
			                    if (session.getAttribute("Username") != null) {
                                     String query = "select * from register where StudentRegNo='"+Id+"'";
                                    
                                     ResultSet resultSet = myStm.executeQuery(query);
                                     while(resultSet.next()){
                                      %>
                                  <tr>     <td>Student Name:</td>
                                      <td>
                                          <input type="text" name="name" value="<%=resultSet.getString(1) %>"></td></tr>
                                <tr>
                                <td>Student Registration Number:</td>
                                <td>
                                    <input type="text" name="regNo" value="<%=resultSet.getString(2) %>"</td>
                                </tr>
                                
                       <tr>
                                <td>Email:</td>
                                <td><input type="text" name="email" value="<%=resultSet.getString(3) %>" /></td>
                        </tr>
                         <tr>
                                <td>NIC</td>
                                <td><input type="text" name="nic" value="<%=resultSet.getString(4) %>"/></td>
                        </tr>
                         <tr>
                                <td>Contact No:</td>
                                <td><input type="text" name="contactNo" value="<%=resultSet.getString(5) %>" /></td>
                        </tr>
                       
                     
                               
                            
                                              <%
      }}}
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   %>
                        
                </table>
                        </div>        
        <div style="margin-top:-210px;">
                          <table>
                           <tr>
                               <td><input type="submit" value="Update"  /></td>
                               <td><input type="reset" value="Reset" /></td> 
                               
                          </form>
                          <td><a href="ResetPassword.jsp"><button>Rest Password</button></a>
                    </tr>
                </table>
        </div>
    </body>
</html>
