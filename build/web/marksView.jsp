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
            <tr>
                  <th>Student Id</th>
                  <th>Subject Name</th>
                  <th>Assignment Marks</th>
                  <th>Mid Marks</th>
                  <th>Final Marks</th>
                  <th></th>
            </tr>
            <tr>
<%
        String id=request.getParameter("id");
        try {
             DbConnect db=new DbConnect();
             Connection connection = db.getDBConnection();
             Statement myStm=connection.createStatement();
             String query = "select * from marks where StudentId='"+id+"'";
             ResultSet resultSet = myStm.executeQuery(query);
                while(resultSet.next()){
%>
                  <td><%=resultSet.getString(2)%> </td>
                  <td><%=resultSet.getString(3)%> </td>
                  <td><%=resultSet.getString(4)%> </td>
                  <td><%=resultSet.getString(5)%> </td>
                  <td><%=resultSet.getString(6)%> </td>
                  <td><form method="POST" action="UpdateMarks.jsp?id1=<%=resultSet.getString(3)%>&id2=<%=resultSet.getString(2)%>"><button>Edit</button></form></td>
            </tr><%}%>
            <tr>
                <td><form method="POST" action="DeleteMarksServlet?Id=<%=id%>"><button>Delete</button></form></td> 
            </tr>
                   
<%
                
              connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
%>
                    
        </table>
    </body>
</html>
