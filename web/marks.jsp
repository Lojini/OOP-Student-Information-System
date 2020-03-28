<%-- 
    Document   : marks
    Created on : Apr 27, 2018, 3:19:35 AM
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
        <script>        
function validate() {
  
    var x = document.forms.myForm.StudentId.value;
    var y = document.forms.myForm.SubjectName.value;
    var z = document.forms.myForm.Assignment.value;
    var a = document.forms.myForm.MidMarks.value;
    var b = document.forms.myForm.FinalMarks.value;
    var numbers = /^[0-9]+$/;
    // If x is Not a Number or less than one or greater than 10
    if (x=="" || y==""){
        alert("Must Be Filled Out");
         return false;}
    
    if(z<0 || z>20 ){
        alert("Invalid input for Assignment Marks");
        return false;}
    else if(a<0 || a>30){
        alert("Invalid Input for Mid Marks");
        return false;}
    else if(b<0|| b>50){
         alert("Invalid Input for Final Marks");
         return false;}
    
  
}
</script>


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
    width:70%;
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
    </div>
       <a href="MarksReport.jsp" style="margin-left:30%; margin-right:4%; margin-top:4%">Marks Report</a>
    <div>       
       <form name="myForm" method="POST" action="AddMarksServlet" onsubmit="return validate(this);">
       <table>
             <tr>
	         <td>Student ID</td>
	         <td><input type="text" name="StudentId" /></td>
	     </tr>
             <tr>
		 <td>Subject Name</td>
		 <td><input type="text" name="SubjectName" /></td>
	     </tr>
	     <tr>
		 <td>Assignment Marks</td>
		 <td><input type="text" name="Assignment" /></td>
	     </tr>
	     <tr>
		 <td>Mid Marks</td>
		 <td><input type="text" name="MidMarks" /></td>
	     </tr>
	     <tr>
		 <td>Final Marks</td>
		 <td><input type="text" name="FinalMarks" /></td>
             </tr>
        </table>
    </div>
    <div style="margin-top:-220px;">
        <table>
             <tr>
                 <td><input type="submit" value="Add Marks"   /></td>
                 <td><input type="reset" value="Reset" /></td> 
        </form>
	<form method="POST" action="ListMarksServlet">
                 <td><input type="submit" value="List All"/></td>
        </form>
        <form method="POST" action="marksView.jsp">
                 <td><input type="text" name="id">
                 <button>Search</button></td>
        </form>
        </table>
    
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