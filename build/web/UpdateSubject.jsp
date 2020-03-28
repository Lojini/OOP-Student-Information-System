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
                    <form method="POST" action="UpdateSubjectServlet">
                        
                        <tr>
                                <td>Subject Id</td>
                                <%
                                   String id=request.getParameter("id");
 
                                  try {
                                     DbConnect db=new DbConnect();
                                     Connection connection = db.getDBConnection();
                                     Statement myStm=connection.createStatement();
                                     String query = "select * from subject where SubjectId='"+id+"'";
                                    
                                    ResultSet resultSet = myStm.executeQuery(query);
                                   while(resultSet.next()){
                                      %>
                                      
                                      <td><input type="hidden" name="id" value="<%=resultSet.getString(1) %>">
                                          <input type="text" name="id" value="<%=resultSet.getString(1) %>"></td>
                                    
                                
                      </tr>
 
                       
                        <tr>
                                <td>Subject Name</td>
                                <td><input type="text" name="SubjectName" value="<%=resultSet.getString(2) %>" /></td>
                        </tr>
                        
                           <tr>
                                <td>Course Id</td>
                                <td><input type="text" name="CourseId" value="<%=resultSet.getString(3) %>"/></td>
                        </tr>
                         
                         <tr>
                                <td>Course Name</td>
                                <td><input type="text" name="CourseName" value="<%=resultSet.getString(4) %>"/></td>
                        </tr>
                         <tr>
                                <td>Credits</td>
                                <td><input type="text" name="Credits" value="<%=resultSet.getString(5) %>"/></td>
                        </tr>
                                                <%
      }
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
                           </tr></form>
                          
                   
                </table>
        </div>
    </body>
</html>
