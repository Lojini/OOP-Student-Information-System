package com.oop.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.oop.model.Course;
import com.oop.util.DbConnect;


public class Coursedao {
    
    
	Connection connection;
	Statement statement;
        
        
        
	public String addCourse(Course course) throws SQLException {

	    
                  connection = DbConnect.getDBConnection();
                   
                  statement = connection.createStatement();
                  
                  String sql="insert into course(CourseId,CourseName,CourseDetails,Fees) values('"+course.getCourseId()+"','"+course.getCourseName()+"','"+course.getCourseDetails()+"','"+course.getFees()+"')";
			
                  int i = statement.executeUpdate(sql);
        
                  if(i!=0)
                     return "SUCCESS";
                  else
                      return "OOPS SOMETHING WENT WRONG";
        }
        
        
        public String DeleteCourse(String CourseId) throws SQLException
        {
            connection=DbConnect.getDBConnection();
            statement=connection.createStatement();
            
            String sql="delete from course where CourseId='"+CourseId+"'";
            
            int i=statement.executeUpdate(sql);
            
            if(i!=0)
                return "SUCCESS";
            else
                return "OOPS SOMETHING WENT WRONG";
        }
        
          
          public String UpdateCourse(Course course) throws SQLException
           {
            connection=DbConnect.getDBConnection();
            statement=connection.createStatement();
            
            String sql="UPDATE course SET CourseName='"+course.getCourseName()+"',CourseDetails='"+course.getCourseDetails()+"',Fees='"+course.getFees()+"' WHERE CourseId='"+course.getCourseId()+"'";
            
            int i=statement.executeUpdate(sql);
            
            if(i!=0)
                return "SUCCESS";
            else
                return "OOPS SOMETHING WENT WRONG";
        }
        
            
            
        }

        