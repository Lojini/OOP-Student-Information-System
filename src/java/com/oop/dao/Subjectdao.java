package com.oop.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.oop.model.Subject;
import com.oop.util.DbConnect;


public class Subjectdao {
    
    
	Connection connection;
	Statement statement;
        
        
        
	public String addSubject(Subject subject) throws SQLException {

	    
                  connection = DbConnect.getDBConnection();
                   
                  statement = connection.createStatement();
                  
                  String sql="insert into subject(SubjectId,SubjectName,CourseId,CourseName,Credits) values('"+subject.getSubjectId()+"','"+subject.getSubjectName()+"','"+subject.getCourseId()+"','"+subject.getCourseName()+"','"+subject.getCredits()+"')";
			
                  int i = statement.executeUpdate(sql);
        
                  if(i!=0)
                     return "SUCCESS";
                  else
                      return "OOPS SOMETHING WENT WRONG";
        }
        
         public String DeleteSubject(String SubjectId) throws SQLException
        {
            connection=DbConnect.getDBConnection();
            statement=connection.createStatement();
            
            String sql="delete from subject where SubjectId='"+SubjectId+"'";
            
            int i=statement.executeUpdate(sql);
            
            if(i!=0)
                return "SUCCESS";
            else
                return "OOPS SOMETHING WENT WRONG";
        }
        
          
          public String UpdateSubject(Subject subject) throws SQLException
           {
            connection=DbConnect.getDBConnection();
            statement=connection.createStatement();
            
            String sql="UPDATE subject SET SubjectName='"+subject.getSubjectName()+"',CourseId='"+subject.getCourseId()+"',CourseName='"+subject.getCourseName()+"',Credits='"+subject.getCredits()+"' WHERE SubjectId='"+subject.getSubjectId()+"'";
            
            int i=statement.executeUpdate(sql);
            
            if(i!=0)
                return "SUCCESS";
            else
                return "OOPS SOMETHING WENT WRONG";
        }
        
}
        