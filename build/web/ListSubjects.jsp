

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="com.oop.util.DbConnect" %>

<!DOCTYPE html>
<html>
<head>
<style>
.subject {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 1000px;
    margin-top: 50px;
    
    
}

.subject td, .subject th {
    border: 1px solid black;
    padding: 8px;
}

.subject tr:nth-child(even){background-color: #f2f2f2;}

.subject tr:hover {background-color: #ddd;}

.subject th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #00BF9A;
    color: white;
}
</style>
</head>
<body>

<table class="subject" align="center" >
  <tr>
    <th>Subject ID</th>
    <th>Subject Name</th>
    <th>Course ID</th>
    <th>Course Name</th>
     <th>Credits</th>
    <th></th>
    <th></th>
  </tr>
  <tr>
      <%
  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT * FROM subject";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){
%>
<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>
<td><%=resultSet.getString(5) %></td>
<td><form method="POST" action="UpdateSubject.jsp?id=<%=resultSet.getString(1)%>"><button>Edit</button></form></td>  
<td><form method="POST" action="DeleteSubjectServlet?id=<%=resultSet.getString(1)%>"><button>Delete</button></form></td>
      						       
       						   

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