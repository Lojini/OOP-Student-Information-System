/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.oop.util.DbConnect;
import com.oop.model.Login;
import com.oop.model.Register;
import java.sql.SQLException;

 public class Userdao{

public boolean checkLogin(Login log) {
		try {
			Connection connection = DbConnect.getDBConnection();	
			Statement st = connection.createStatement();
			ResultSet result = st.executeQuery("SELECT StudentRegNo,password FROM register WHERE StudentRegNo='"+log.getUsername()+"' AND password='"+log.getPassword()+"'");

			if(result.next()) {
	 			return true;
	 		}else {
	 			return false;
	 		}
			
		}
		catch(Exception e){
			System.out.println(e);
		} 

		return false;
	}
  public boolean insertRegister(Register reg) {
		
		
		try {
			Connection connection =  DbConnect.getDBConnection();
			Statement st = connection.createStatement();
			int i = st.executeUpdate("INSERT INTO register(name,StudentRegNo,email,nic, contactNo,password,course) VALUES('"+reg.getName()+"','"+reg.getStudentRegistrationNo()+"','"+reg.getEmail()+"','"+reg.getNIC()+"','"+reg.getContactNo()+"', '"+reg.getPassword()+"','"+reg.getCourse()+"')");

			if(i!=0) {
				return true;
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		} 

		return false;
	}
        public boolean updateRegister(Register reg) {

			try {
						Connection connection = DbConnect.getDBConnection();
						Statement st = connection.createStatement();

				String query = "UPDATE register SET name='"+reg.getName()+"',StudentRegNo='"+reg.getStudentRegistrationNo()+"',email='"+reg.getEmail()+"',nic='"+reg.getNIC()+"',contactNo='"+reg.getContactNo()+"' WHERE StudentRegNo='"+reg.getStudentRegistrationNo()+"'";
					     int i=st.executeUpdate(query);
                                                  if(i!=0)
					        return true;

		
				} 

						catch(Exception e){
							System.out.println(e);
						} 
                     return false;
						
	}
   

}
 