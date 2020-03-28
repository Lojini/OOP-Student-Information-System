
package com.oop.model;

public class Subject{
     
     String SubjectId;
     String SubjectName;
     String CourseId;
     String CourseName;
     String Credits;
     
     
      public String getSubjectId()
    {
        return SubjectId;
        
    }
    
    public void setSubjectId(String subjectid)
    {
        SubjectId=subjectid;
    }
    
        public String getSubjectName()
    {
        return SubjectName;
        
    }
    
    public void setSubjectName(String subjectname)
    {
        SubjectName=subjectname;
    }
    
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
       public String getCredits()
    {
        return Credits;
        
    }
    
    public void setCredits(String credits)
    {
        Credits=credits;
    }
    
 
    
    
    @Override
     public String toString() {
        return "SubjectId"+SubjectId+"\n"+"Subject Name"+SubjectName+"\n"+"CourseId"+CourseId+"\n"+"Course Name"+CourseName+"\n"+Credits+"\n";
    } 
    
}

