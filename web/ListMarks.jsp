

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.oop.model.Marks" %>
<%@page import="com.oop.dao.Marksdao" %>
<%@page import="com.oop.dao.IMarksdao" %>
<%@page import="java.util.ArrayList" %>
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
    <th>Subject Name</th>
    <th>Assignment Marks</th>
    <th>Mid Marks</th>
    <th>Final Marks</th>
  </tr>
  <tr>
 <%
        IMarksdao imarks = new Marksdao();
	ArrayList<Marks> arrayList = imarks.ListMarks();
	  for(Marks marks : arrayList){
 %>


    <td> <%=marks.getStudentId() %> </td>
    <td> <%=marks.getSubjectName() %> </td>
    <td> <%=marks.getAssignmentMarks() %> </td>
    <td> <%=marks.getMidMarks() %> </td>
    <td> <%=marks.getFinalMarks() %> </td>

  </tr>
<%  }%>
</table>
</body>
</html>