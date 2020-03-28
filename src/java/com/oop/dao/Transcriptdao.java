package com.oop.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.oop.model.Transcript;
import com.oop.util.DbConnect;


public class Transcriptdao {
    
    
	Connection connection;
	Statement statement;
        
        
        
	public String addTranscript(Transcript trans) throws SQLException {

	    
                  connection = DbConnect.getDBConnection();
                   
                  statement = connection.createStatement();
                  
                  String sql="insert into transcript(TransId,Name,RegNum,Email,NIC,PhoneNum,StudyProgram,Address) values('"+trans.getTransId()+"','"+trans.getName()+"','"+trans.getRegNum()+"','"+trans.getEmail()+"','"+trans.getNIC()+"','"+trans.getPhoneNum()+"','"+trans.getStudyProgram()+"','"+trans.getAddress()+"')";
			
                  int i = statement.executeUpdate(sql);
        
                  if(i!=0)
                     return "SUCCESS";
                  else
                      return "OOPS SOMETHING WENT WRONG";
        }
        
             public String DeleteTrans(String TransId) throws SQLException
        {
            connection=DbConnect.getDBConnection();
            statement=connection.createStatement();
            
            String sql="delete from transcript where TransId='"+TransId+"'";
       
            int i=statement.executeUpdate(sql);
            
            if(i!=0)
                return "SUCCESS";
            else
                return "OOPS SOMETHING WENT WRONG";
        }
             
                 public String AcceptTrans(String TransId,String RequestStatus) throws SQLException {

	    
                  connection = DbConnect.getDBConnection();
                   
                  statement = connection.createStatement();
                  
                  String sql="Update transcript set RequestStatus='"+RequestStatus+"' where TransId='"+TransId+"'";
			
                  int i = statement.executeUpdate(sql);
        
                  if(i!=0)
                     return "SUCCESS";
                  else
                      return "OOPS SOMETHING WENT WRONG";
        }
}
   
