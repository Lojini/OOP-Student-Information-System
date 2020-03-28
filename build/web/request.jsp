<%-- 
    Document   : request
    Created on : Apr 27, 2018, 3:20:15 AM
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
    <style type="text/css">
  .container {
    overflow: hidden;
    background-color:#00BF9A;
    font-family: Arial;
    padding:0px;
    height:200px;
}

.container a {
    float: left;
    font-size: 20px;
    color: white;
    text-align: center;
    padding: 10px 12px;
    text-decoration: none;
    
}

.dropdown {
    float: left;
    overflow: hidden;
      
     
}

.dropdown .dropbtn {
    font-size: 20px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color:inherit;

}

.container a:hover, .dropdown:hover .dropbtn {
    background-color:#ABEBC6  ;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color:#7DCEA0;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}
.centered {
    position: absolute;
    top: 559px;
    left:1000px;
    transform: translate(-50%, -50%);
    color:white;
    font-size:30px;
}

 .button  {
  padding: 19px 39px 18px 39px;
  color: #FFF;
  background-color: #00BF9A;
  font-size: 18px;
  text-align: center;
  font-style: normal;
 width: 500px;

  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
  margin-bottom: 10px;
}
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
}

tr:nth-child(even) {
    background-color: #dddddd;
}
 
.footer {
           position:absolute;
           background-color:black;
           width:100%;
           
        }   

   </style>
</head>

<body>
    
       
  <div class="container">   
      <img src="images/imageedit_2_5408162098.png" width="250px" height="150px"style="  padding:0; margin-bottom:5px; margin-left:5px; margin-top:10px; float:left">
      
       
    

     
  <a href="student.jsp" style="margin-left:30%; margin-right:4%; margin-top:4%">Students</a>
  
      <a href="course-admin.jsp" style="margin-right:3%; margin-top:4%">Courses</a>
   <a href="sub-admin.jsp" style="margin-right:3%; margin-top:4%">Subjects</a>
    <a href="marks.jsp" style="margin-right:3%; margin-top:4%">Marks</a>
    <a href="request.jsp" style="margin-right:3%; margin-top:4%">Requests</a>
      
    </div>

  
  



          



 
    	
<div>
 
  <img src="images/35-books-macbook_th.jpg" style="width:1500px;height:700px; border:0px; padding:2px;"/>
   <div class="centered"><h2> Welcome To AVI Institute</h2>
     <h2 style="margin-left:25px;">Make Your Dreams Happen</h2>
        <%
		if (session != null) {
			if (session.getAttribute("Username") != null) {
				String name = (String) session.getAttribute("Username");
				out.print("Welcome, " + name);
			} else {
				response.sendRedirect("login.jsp");
			}
		}
	%>
</br>
	</br>
	<form action="Logout" method="post">
		<input type="submit" value="Logout">
        </form>
</div>
     
                               <div>       
                                   <h1 style="text-align:center; color:MediumSeaGreen; margin-top:4%;">Scholarship Request</h1>
                                        <table>
                                        

  <tr>
    <th>Name with initials</th>
   <th>Student Registration Number</th>
   <th>Email</th>
   <th>NIC Num</th>
   <th>Study Programme</th>
    <th>Scholarship Type</th>
    <th></th>
    <th></th>
   
  </tr>
  
       <%
  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT * FROM scholarship";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){
%>
  <tr>  <td><%=resultSet.getString(2) %></td>
    <td><%=resultSet.getString(3) %></td>
    <td><%=resultSet.getString(4) %></td>
    <td><%=resultSet.getString(5) %></td>
     <td><%=resultSet.getString(6) %></td>
     <td><%=resultSet.getString(7) %></td>
     <td><form method="POST" action="AcceptScholarshipServlet?id=<%=resultSet.getString(1)%>"><button>Accept</button></form></td>
     <td><form method="POST" action="DeleteScholarshipServlet?id=<%=resultSet.getString(1)%>"><button>Reject</button></form></td>
  </tr>
  <% } %>
</table>
                          



      <h1 style="text-align:center; color:MediumSeaGreen; margin-top:4%;">Transcript Request</h1>
<table>
    <tr>
    <th>Name with initials</th>
   <th>Student Registration Number</th>
   <th>Email</th>
   <th>NIC Num</th>
   <th>Student Contact No</th>
   <th>Study Programme</th>
    <th>Present Address</th>
    <th></th>
    <th></th>
   
  </tr>
  
           <% 
    
      Statement myStm1=connection.createStatement();
      String query1 ="SELECT * FROM transcript";
     ResultSet resultSet1 = myStm1.executeQuery(query1);
     while(resultSet1.next()){
%>
 <tr>   <td><%=resultSet1.getString(2) %></td>
    <td><%=resultSet1.getString(3) %></td>
    <td><%=resultSet1.getString(4) %></td>
    <td><%=resultSet1.getString(5) %></td>
    <td><%=resultSet1.getString(6) %></td>
    <td><%=resultSet1.getString(7) %></td>
    <td><%=resultSet1.getString(8) %></td>
     <td><form method="POST" action="AcceptTranscriptServlet?id=<%=resultSet1.getString(1)%>"> <button>Accept</button></form></td>
     <td><form method="POST" action="DeleteTranscriptServlet?id=<%=resultSet1.getString(1)%>"><button>Reject</button></form></td>
    </tr>
        <% }%>
  
</table>
                               </div>      
         <%  
       connection.close();
      } 
   catch (Exception e) {
    e.printStackTrace();
   }%>

 
	 








<br/><br/><br/>



<div style="color:white ; background-color:#00BF9A; width:1500px; height:290px;">
		
		<div style="margin-right:3px;float:left">
			<img src="images/imageedit_2_5408162098.png" width="350px" height="250px" style="margin:0px; padding:0; border:0; margin-top:14px;"/>
			
		</div>

		<div>
			
			<pre style="color:white;float:right; margin-right:10px;  font-size:20px; line-height:1.8;"> 
                            Our Location
                            36 De Kretser Pl, 
                            Colombo 00400.
                            <B>Email:aviinfo@avicampus.edu.lk</B>
                            <B>Call:94112375689</B>
                       </pre>
		</div>
                 
</div>		
	
 </body>
 </html>
