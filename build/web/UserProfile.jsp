<%-- 
    Document   : User-Profile
    Created on : May 11, 2018, 2:14:24 PM
    Author     : Hilton
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.oop.util.DbConnect"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .container {
                overflow: hidden;
                background-color:MediumSeaGreen;
                font-family: Arial;
                padding:0px;
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
                margin-top:5%;
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
            h1{
                font-family:cursive;
                font-style:italic;
                color:#00BF9A;
                font-size: 100px;

            }
            form{
                width: 50%;
                height: 80%;
            }
            a1{
                size: 50%,50%;
            }
        </style>

    </head>
    <body>

        <div class="container">   
            <img src="images/imageedit_2_5408162098.png" width="15%" height="15%"style="  padding:0; margin-bottom:1%; margin-left:1%; margin-top:1%; float:left">





            <a href="home.jsp" style="margin-left:50%; margin-right:4%; margin-top:4%">Home</a>

            <a href="courses.jsp" style="margin-right:3%; margin-top:4%">Courses</a>
            <div class="dropdown">
                <button class="dropbtn" style="margin-left:2%; margin-top:45%">ApplyFor</button>
                <div class="dropdown-content">
                    <a href="schol.jsp">Scholarship</a>
                    <a href="transcript.jsp">Transcript</a>

                </div>

            </div> 


        </div>



        <h1>Student Details</h1>
        <div class="a1">
            <form action="">
                <table style="height:50%; width:50%;">
                    <%
                        try {
                            
	                    String Id = (String) session.getAttribute("Username");
                            DbConnect db=new DbConnect();
                             Connection connection = db.getDBConnection();
                            Statement myStm=connection.createStatement();
                             if (session != null) {
			    if (session.getAttribute("Username") != null) {
                            String query = "SELECT * FROM register where StudentRegNo='"+Id+"'";
                         
                            ResultSet resultSet = myStm.executeQuery(query);

                            while (resultSet.next()) {
                    %>

                    <tr>    
                        <td>  Name:</td>
                        <td> <%=resultSet.getString("name")%> </td>
                    </tr>
                    <tr>
                        <td> Student Registration Number:</td>
                        <td> <%=resultSet.getString("StudentRegNo")%> </td>
                    </tr>
                    <tr>
                        <td>  Email:</td>
                        <td> <%=resultSet.getString("email")%></td>
                    </tr>
                    <tr>
                        <td> NIC Number:</td>
                        <td> <%=resultSet.getString("nic")%></td>
                    </tr>
                    <tr>
                        <td> Student Contact Number::</td>
                        <td><%=resultSet.getString("contactNo")%></td>
                    </tr>
                    <tr>
                        <td>Course:</td>
                        <td><%=resultSet.getString("course")%></td>
                    </tr>
                    <td><a href="UserRegister.jsp?.name=<%=resultSet.getString("name")%>"><button class="update" type="button">Update</button></a></td>
                

                    <%
                            }}}
                             connection.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    %>
                </table>
        </div>
    </form>
</body>
</html>

