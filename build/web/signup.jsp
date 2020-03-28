<%-- 
    Document   : register
    Created on : May 3, 2018, 8:38:49 PM
    Author     : Hilton
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
            function validate(){
	var name = document.forms["RegistrationForm"][ "name"].value;
	var mail = document.forms["RegistrationForm"][ "email"].value;
	var pswr = document.forms["RegistrationForm"][ "password"].value;

	
	
	
	
	 if(isAlphebatic(name))
 	         if(mailValid(mail))
	           if(passwrd(pswr,6))
	                 return true;
				    else
						return false;
	               else
						return false;
				    else
					      	
					
						return false;
		
	
}
	
	
	function isEmpty(elemValue,field){
		 if(elemValue==""  || elemValue == null){
			 alert("You cannot have " + field + " field empty");
			 return true;
		 }
		 else
			 return false;
	}
	
	function isAlphebatic(elemValue){
		var exp = /^[a-zA-Z]+$/;
		if(!isEmpty(elemValue, "Name"))
		{
			if(elemValue.match(exp))
			{
				return true;
			}
			else
			{
               alert("Enter only text for you  Name");
               return false;			   
		  }
		}
		else
			return false;
	}

	
	function mailValid(elemValue)
{
    if(!isEmpty(elemValue,"Email"))
    {
        var atops = elemValue.indexOf("@");
        var dotops = elemValue.indexOf(".");
        
        if(atops <1 || dotops+2 >=elemValue.length || atops+2>dotops)
        {
            alert("Enter a valid Email Address");
            return false;
        }
        else
        {
            return true;
        }
    }
    else
    {
        return false;
    }
} 
	

	function passwrd(elemValue,min)
{
    var exp2=/^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]+$/;

    if(!isEmpty(elemValue,"Password"))
    {
        if(elemValue.length>=min)
        {
            if(elemValue.match(exp2))
            {
                return true;
            }
            else
            {
                alert("Password should consist at least a upper case, lower case letter,special Character and number");
                return false;
            }
        }
        else
        {
            alert("Password should at least 6 characters long");
            return false;
        }
    }
    else
    {
        return false;
    }
}
</script>
	
	
	
	<style type="text/css">  
 *, *:before, *:after {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

body {
  font-family: 'Nunito', sans-serif;
  color: #384047;
}

form {
  max-width: 300px;
  margin: 10px auto;
  padding: 10px 20px;
  background: #f4f7f8;
  border-radius: 8px;
}

h1 {
  margin: 0 0 30px 0;
  text-align: center;
}

input[type="text"],
input[type="password"],
input[type="date"],
input[type="datetime"],
input[type="email"],
input[type="number"],
input[type="search"],
input[type="tel"],
input[type="time"],
input[type="url"],
textarea,
select {
  background: rgba(255,255,255,0.1);
  border: none;
  font-size: 16px;
  height: auto;
  margin: 0;
  outline: 0;
  padding: 15px;
  width: 100%;
  background-color: #e8eeef;
  color: #8a97a0;
  box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
  margin-bottom: 30px;
}




select {
  padding: 6px;
  height: 32px;
  border-radius: 2px;
}

button {
  padding: 19px 39px 18px 39px;
  color: #FFF;
  background-color: MediumSeaGreen;
  font-size: 18px;
  text-align: center;
  font-style: normal;
  border-radius: 5px;
  width: 100%;
  border: 1px solid #3ac162;
  border-width: 1px 1px 3px;
  box-shadow: 0 -1px 0 rgba(255,255,255,0.1) inset;
  margin-bottom: 10px;
}


label {
  display: block;
  margin-bottom: 8px;
}

label.light {
  font-weight: 300;
  display: inline;
}

  form {
    max-width: 520px;
  }
</style>
    </head>
    <body>
        <form action="RegisterServlet" method="post" name="RegistrationForm" onsubmit="return validate()">
      
        <h1>Sign Up</h1>
        
      
          <label for="name">Name:</label>
          <input type="text"  name="name">

          <label for="name">Student Registration Number:</label>
          <input type="text"  name="regNo">
          
               
          <label for="mail">Email:</label>
          <input type="email"  name="email">

          <label for="name">NIC Number:</label>
          <input type="text"  name="nic">
      
          <label for="name">Student Contact Number:</label>
          <input type="text"  name="contactNo">

          <label for="password">Password:</label>
          <input type="password"  name="password">
          <label for="course">Course</label>
          <%
  try{
      DbConnect db=new DbConnect();
      Connection connection = db.getDBConnection();
      Statement myStm=connection.createStatement();
      String query ="SELECT * FROM course";
     ResultSet resultSet = myStm.executeQuery(query);
     while(resultSet.next()){
%>
         
          <input type="radio" name="course" value="<%=resultSet.getString(2)%>"><%=resultSet.getString(2)%> <br>
        <%
      }
   connection.close();
    } 
   catch (Exception e) {
    e.printStackTrace();
   }
   %>
       <button type="submit" name="save">Register</button>
         <h2>Already have an account? &nbsp<a href="login.jsp" style="color:MediumSeaGreen;" > Login</a></h2>
      </form>
      
    </body>
</html>
