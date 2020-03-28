

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
    <th>Student ID</th>
    <th>Course Name</th>
    <th>Number of completely updated Subjects</th>
    <th>Number of Subjects</th>
  </tr>
  <tr>
<%
  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query =" SELECT StudentId,count(SubjectName) FROM marks   where (MidMarks<>'' or MidMarks is not null) and (Assignment<>''or Assignment is not null) and (FinalMarks<>''or FinalMarks is not null)  group by StudentId";
      String Query="Select "
      ResultSet resultSet = myStm.executeQuery(query);
        while(resultSet.next()){
%>
    <td><%=resultSet.getString(1) %></td>
    <td><%=resultSet.getString(2) %></td>
  </tr>
<%
        }
      connection.close();
   } catch (Exception e) {
         e.printStackTrace();
   }
%>
   </table>
</body>
</html>