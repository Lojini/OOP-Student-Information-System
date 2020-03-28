/**
 * @author Pavidha Lojini
 */
package com.oop.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.oop.model.Marks;
import com.oop.util.DbConnect;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Marksdao implements IMarksdao {
    
    
	Connection connection;
	Statement statement;
        
        /**
         * @param marks
         */
        @Override
        public void addMarks(Marks marks){

            try {
                connection = DbConnect.getDBConnection();
                statement = connection.createStatement();
                String sql="insert into marks(MarksId,StudentId,SubjectName,Assignment,MidMarks,FinalMarks) values('"+marks.getMarksId()+"','"+marks.getStudentId()+"','"+marks.getSubjectName()+"','"+marks.getAssignmentMarks()+"','"+marks.getMidMarks()+"','"+marks.getFinalMarks()+"')";
                statement.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Marksdao.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
        
         /**
          * @param marks
         */
        @Override
        public void UpdateMarks(Marks marks){
            
            try {
                connection=DbConnect.getDBConnection();
                statement=connection.createStatement();
                String sql="UPDATE marks SET Assignment='"+marks.getAssignmentMarks()+"',MidMarks='"+marks.getMidMarks()+"',FinalMarks='"+marks.getFinalMarks()+"' where StudentId='"+marks.getStudentId()+"'";
                statement.executeUpdate(sql);
               
            } catch (SQLException ex) {
                Logger.getLogger(Marksdao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        @Override
        public ArrayList<Marks> ListMarks(){
             
                ArrayList<Marks>marksList = new ArrayList<>();
            try {
                connection=DbConnect.getDBConnection();
                statement=connection.createStatement();
                String sql="select * from marks order by StudentId,SubjectName";
                ResultSet resultSet = statement.executeQuery(sql);
                
                while (resultSet.next()) {
                    Marks marks = new Marks();
                    marks.setStudentId(resultSet.getString(2));
                    marks.setSubjectName(resultSet.getString(3));
                    marks.setAssignmentMarks(Integer.parseInt(resultSet.getString(4)));
                    marks.setMidMarks(Integer.parseInt(resultSet.getString(5)));
                    marks.setFinalMarks(Integer.parseInt(resultSet.getString(6)));
                    marksList.add(marks);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Marksdao.class.getName()).log(Level.SEVERE, null, ex);
            }
            return marksList;
        }
        @Override
        public void DeleteMarks(String StudentId){
            try {
                connection=DbConnect.getDBConnection();
                statement=connection.createStatement();
                String sql="Delete from marks where StudentId='"+StudentId+"'";
                statement.executeUpdate(sql);
               
            } catch (SQLException ex) {
                Logger.getLogger(Marksdao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
}