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
      <%         Statement myStm=connection.createStatement();
                 String query ="SELECT * from marks m,subject s where s.SubjectName=m.SubjectName and StudentId='"+Id+"'";
                 ResultSet resultSet = myStm.executeQuery(query);
                 ArrayList<Double>al=new ArrayList<>();
                 double credit,totalcredit=0;
                 int totalcr=0;
                       while(resultSet.next()){%>
               <tr>  
                   <td> <%=resultSet.getString(3) %></td>
                   <td><%int total=Integer.parseInt(resultSet.getString("MidMarks"))+Integer.parseInt(resultSet.getString("Assignment"))+Integer.parseInt(resultSet.getString("FinalMarks"));
                              if(total>=75){   
                                   out.println("A");
                                   credit=4.0*Integer.parseInt(resultSet.getString("Credits"));
                                   al.add(credit);
                              }
                                else if(total<75 && total>=65){    
                                     out.println("B");
                                     credit=3.5*Integer.parseInt(resultSet.getString("Credits"));
                                     al.add(credit);
                                }
                                  else if(total<65 && total>=55){   
                                       out.println("C");
                                       credit=2.7*Integer.parseInt(resultSet.getString("Credits"));
                                       al.add(credit);
                                  }
                                    else if(total <55 && total>=45){   
                                        out.println("S");
                                        credit=1.5*Integer.parseInt(resultSet.getString("Credits"));
                                        al.add(credit);
                                    }
                                      else if(total<45){    
                                         out.println("W");
                                         credit=-0.5*Integer.parseInt(resultSet.getString("Credits"));
                                         al.add(credit);
                                       }
                        %>
                    </td>
               </tr>
       <%        totalcr=totalcr+Integer.parseInt(resultSet.getString("Credits"));}
                          for(Double obj:al){
                               totalcredit= totalcredit+obj;
                           }
       %>
                <tr>
                    <td>GPA:</td>
                    <td><%=(totalcredit)/totalcr%></td>
       <%         Statement myStm2=connection.createStatement();
                  String query2 ="update register set gpa='"+(totalcredit/totalcr)+"' where StudentRegNo='"+Id+"'";
                  myStm2.executeQuery(query2);
       %>
                </tr>
       <%     }}
               connection.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
       %>
        </table>  
        </div>
    </body>
</html>
