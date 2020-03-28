

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.oop.util.DbConnect" %>

<!DOCTYPE html>
<html>
<head>
<style>
.course {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 1000px;
    margin-top: 50px;
    
    
}

.course td, #course th {
    border: 1px solid black;
    padding: 8px;
}

.course tr:nth-child(even){background-color: #f2f2f2;}

.course tr:hover {background-color: #ddd;}

.course th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #00BF9A;
    color: white;
}
</style>
</head>
<body>

<table class="course" align="center" >
  <tr>
    <th>Course ID</th>
    <th>Course Name</th>
    <th>Course Details</th>
    <th>Fees</th>
    <th></th>
    <th></th>
  </tr>
  <tr>
      <%
  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT * FROM course";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){
%>
<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>
<td><form method="POST" action="UpdateCourse.jsp?id=<%=resultSet.getString(1)%>"><button>Edit</button></form></td>  
<td><form method="POST" action="DeleteCourseServlet?id=<%=resultSet.getString(1)%>"><button>Delete</button></form></td>
      						       
       						   

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