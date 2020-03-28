package com.oop.util;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

;

/**
 *
 * @author 
 */
public class DbConnect {
    private static DbConnect Instance;
	private static Connection connection; 

	// This works according to singleton pattern
	public DbConnect(){
         }
	
	public static DbConnect getInstance(){
	    if(Instance==null){
	    	Instance= new DbConnect();
	    }
		return Instance;
	}
	    
	public static Connection getDBConnection(){ 
		
		//This create new connection objects when connection is closed or it is null
		try{  
			String driver ="com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/oop"; 
			String username = "root"; 
			String password = "";
			  
			if(connection == null || connection.isClosed())
			{
				Class.forName(driver);  //load driver
				connection = DriverManager.getConnection(url,username,password);
                                //creating connection
			}
			
		} catch(ClassNotFoundException | SQLException e){
			System.out.println(e);
		}
		return connection;  
	}  
     
	
}

    
    

