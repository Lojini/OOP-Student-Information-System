
package com.oop.model;

public class Course{
     
     String CourseId;
     String CourseName;
     String CourseDetails;
     String Fees;
     
     
     
    
    public String getCourseId()
    {
        return CourseId;
        
    }
    
    public void setCourseId(String courseid)
    {
        CourseId=courseid;
    }
    public void setCourseName(String coursename)
    {
        CourseName=coursename;
    }
    public String getCourseName()
    {
        return CourseName;
        
    }
    
    public void setCourseDetails(String coursedetails)
    {
        CourseDetails=coursedetails;
    }
    public String getCourseDetails()
    {
        return CourseDetails;
        
    }
     public String getFees()
    {
        return Fees;
        
    }
    
    public void setFees(String fees)
    {
        Fees=fees;
    }
    
    
    @Override
     public String toString() {
        return "CourseId"+CourseId+"\n"+"Course Name"+CourseName+"\n"+"Course Details"+CourseDetails+"\n"+Fees+"\n";
    } 
    
}
