

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
    <th>Subject Name</th>
    <th>number of students passed</th>
    <th>number of students failed</th>
    
  </tr>
  <tr>
      <%
  try{
      
      Connection connection = DbConnect.getDBConnection();
      Statement myStm=connection.createStatement();
      Statement myStm1=connection.createStatement();
      String query ="SELECT SubjectName,count(StudentId)  from marks where (Assignment+MidMarks+FinalMarks)>45 group by SubjectName ";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){
%>
<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>

<%        String SubjectName=resultSet.getString(1);
         String query1 ="SELECT count(StudentId)  from marks where (Assignment+MidMarks+FinalMarks)<45 group by SubjectName='"+SubjectName+"' ";
         ResultSet resultSet1 = myStm1.executeQuery(query1);
           while(!resultSet1.next()){%>
           <td><%="Null"%></td>
    <%  break;}
            while(resultSet1.next()){
                %>
                <td><%=resultSet1.getString(1)%></td>
  <%
          }%> </tr><% }
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }%>
  </table>
</body>
</html>


                 
