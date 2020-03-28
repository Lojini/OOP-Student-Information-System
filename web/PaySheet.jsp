<%-- 
    Document   : ResultSheet
    Created on : May 19, 2018, 11:10:33 PM
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
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
    
    padding: 20px;
    width:50%;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
    </style>
    </head>
    <body>
        
        <div>
            
            <table> 
            <tr colspan="2">
               <%
  try{
      
	String Id = (String) session.getAttribute("Username");
       DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm1=connection.createStatement();
      if (session != null) {
			if (session.getAttribute("Username") != null) {
            String qry="select * from register where StudentRegNo='"+Id+"'";
            ResultSet result=myStm1.executeQuery(qry);
         while(result.next()){
%>
                <td align="left"><h4>Student Name: <%=result.getString(1) %> <br><br><br> Student Id: <%=result.getString(2) %></h4></td>
                <td><h4>Course Name: <%=result.getString(7) %></h4></td> <%}%>
            </tr> 
          
            </table> 
        </div>
            <div style="margin-top:-210px;">
            <table>
                        <tr> 
                   <%  Statement myStm=connection.createStatement();
                       String query ="SELECT gpa,Fees FROM scholarship s,course c where s.StudyProgram=c.CourseName and s.RegNum='"+Id+"'";
                       ResultSet resultSet = myStm.executeQuery(query);
                    
                      
                      double finalfee=0;
                         while(resultSet.next()){%>
                         <td>Course Fee:</td>   
                         <td> <%=resultSet.getString("Fees") %></td></tr>
                        <tr>
                            <td>Scholarship Type</td>
                            <td><%  double gpa=Double.parseDouble(resultSet.getString("gpa"));
                                    double Fees=Double.parseDouble(resultSet.getString("Fees"));
                                    
                                    if(gpa==4.0){
                                      out.println("Full");
                                      finalfee=00.00; }
                                  else if(gpa>=3.7 && gpa<4.0){
                                      out.println("Half");
                                      finalfee=Fees*0.5;}
                                 %></tr>
                        <tr>
                            <td>Final fees Amount:</td>
                            <td><%= finalfee %></td>
                                  
                        </tr></table></div>
                   <%  }}}
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   %>
          
    </body>
</html>
