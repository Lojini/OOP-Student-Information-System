package com.oop.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.oop.model.Scholarship;
import com.oop.util.DbConnect;


public class Scholarshipdao {
    
    
	Connection connection;
	Statement statement;
        
        public String addSchol(Scholarship schol) throws SQLException {

	    
            connection = DbConnect.getDBConnection();
            statement = connection.createStatement();
            String sql="insert into scholarship(ScholId,Name,RegNum,Email,StudyProgram,gpa,NIC) values('"+schol.getScholId()+"','"+schol.getName()+"','"+schol.getRegNum()+"','"+schol.getEmail()+"','"+schol.getStudyProgram()+"','"+schol.getgpa()+"','"+schol.getNIC()+"')";
	    int i = statement.executeUpdate(sql);
            if(i!=0)
                return "SUCCESS";
              else
                 return "OOPS SOMETHING WENT WRONG";
        }
        
        public String Deleteschol(String ScholId) throws SQLException{
            
            connection=DbConnect.getDBConnection();
            statement=connection.createStatement();
            String sql="delete from scholarship where ScholId='"+ScholId+"'";
            int i=statement.executeUpdate(sql);
            if(i!=0)
               return "SUCCESS";
              else
                return "OOPS SOMETHING WENT WRONG";
        }
         
        public String AcceptSchol(String ScholId,String RequestStatus) throws SQLException {

	        connection = DbConnect.getDBConnection();
                statement = connection.createStatement();
                String sql="Update scholarship set RequestStatus='"+RequestStatus+"' where ScholId='"+ScholId+"'";
		int i = statement.executeUpdate(sql);
                if(i!=0)
                   return "SUCCESS";
                  else
                     return "OOPS SOMETHING WENT WRONG";
        }
}
   