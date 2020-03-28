<%-- 
    Document   : transcript
    Created on : Apr 27, 2018, 3:17:34 AM
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
    width:50%;
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
      
       
    

     
  <a href="home.jsp" style="margin-left:700px; margin-top:60px;margin-right:30px;">Home</a>
  
    <a href="courses.jsp" style=" margin-top:60px">Courses</a>
  <div class="dropdown">
    <button class="dropbtn" style="margin-left:10px; margin-top:57px">ApplyFor</button>
    <div class="dropdown-content">
      <a href="schol.jsp">Scholarship</a>
      <a href="transcript.jsp">Transcript</a>
      
    </div>

  </div> 
  

</div>

          



 
    	
<div>
 
  <img src="images/35-books-macbook_th.jpg" style="width:1500px;height:700px; border:0px; padding:2px;"/>
   <div class="centered"><h2> Welcome To AVI Institute</h2>
     <h2 style="margin-left:25px;">Make Your Dreams Happen</h2>
         <%
		if (session != null) {
			if (session.getAttribute("Username") != null) {
				String name = (String) session.getAttribute("Username");
				out.print("Hello, " + name+ "  Welcome to ur Profile");
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
     
</div> 
	 
          



 
    	

                               <div>       <h1 style="text-align:center; color:MediumSeaGreen; margin-top:4%;">Transcript Request Form</h1>
               <form method="POST" action="AddTranscriptServlet">
  <table>
  <tr>
  <td>Name with initials:</td>
  <td><input type="text" name="Name"></td>
  
  </tr>
  <tr>
  <td>Student Registration Number :</td>
  <td><input type="text" name="RegNum" value="IT"></td>
  </tr>
  <tr>
  <td>Your Email:</td>
  <td><input type="mail" name="Email"></td>
  </tr>
   <tr><td>NIC num :</td>
  <td><input type="text" name="NIC"></td>
  </tr>
   <tr><td>Student Contact num:</td>
  <td><input type="text" name="PhoneNum"></td>
  </tr>
   <tr><td>Study Programme:</td>
 
      <td>
<%
  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT * FROM course";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){
%>
      
   <input type="radio" name="StudyProgram" value="<%=resultSet.getString(2)%>"><%=resultSet.getString(2)%> <br>
  
   <%
      }
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   %>
      </td> </tr>
   <tr><td>Present Address:</td>
  <td><textarea name="Address"></textarea></td>
  </tr>
</table>
  <input type="submit" value="Submit" style="float:right; margin-right:20%; margin-top:-10%; width:15%; height:5%;">
</form> 
                           </div> 
 
	 <br/><br/><br/>



<div style="color:white ; background-color:#00BF9A; width:1500px; height:290px;">
		
		<div style="margin-right:3px;float:left">
			<img src="images/imageedit_2_5408162098.png" width="350px" height="250px" style="margin:0px; padding:0; border:0; margin-top:14px;">
			
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
                 
		
	
 </body>
 </html>
