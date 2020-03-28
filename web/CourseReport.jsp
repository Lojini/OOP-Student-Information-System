

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.oop.util.DbConnect" %>

<!DOCTYPE html>
<html>
<head>
<style>
.creport {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 1000px;
    margin-top: 50px;
    
    
}

.creport td, #creport th {
    border: 1px solid black;
    padding: 8px;
}

.creport tr:nth-child(even){background-color: #f2f2f2;}

.creport tr:hover {background-color: #ddd;}

.creport th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #00BF9A;
    color: white;
}
</style>
</head>
<body>

<table class="creport" align="center" >
  <tr>
    <th>Course ID</th>
    <th>Course Name</th>
    <th>Number of student enrolled</th>
    <th></th>
    <th></th>
  </tr>
  <tr>
      <%
  try{
      
      Connection connection = DbConnect.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT StudentRegNo,CourseId,CourseName,COUNT(StudentRegNo) FROM course c,register r where c.CourseName=r.course group by c.CourseId";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){
%>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>

      						       
       						   

  </tr>
    <%
      }
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }%>
   </table>
</body>
</html>


                 