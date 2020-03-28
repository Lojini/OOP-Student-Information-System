
package com.oop.model;


public class Scholarship{
     
    String ScholId;
    String Name;
    String RegNum;
    String Email;
    String StudyProgram;
    double gpa;
    String NIC;
    String RequestStatus;
     
     
    public void setScholId(String Regnum) {
         RegNum=Regnum;
         ScholId="Schol"+Regnum;
    }
     
    public String getScholId(){
        return ScholId;
    }
     
    public String getName(){
        return Name;
    }
    
    public void setName(String name){
        Name=name;
    }
    
    public void setRegNum(String regnum){
        RegNum=regnum;
    }
    
    public String getRegNum(){
        return RegNum;
    }
    
    public void setEmail(String email){
        Email=email;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public String getStudyProgram(){
        return StudyProgram;
    }
    
    public void setStudyProgram(String studyprogram){
        StudyProgram=studyprogram;
    }
    
    public void setgpa(double gp){
        gpa=gp;
    }
    
    public double getgpa(){
        return gpa;
    }
   
    public String getNIC(){
        return NIC;
    }
    
    public void setNIC(String nic){
        NIC=nic;
    }
    
    public String getRequestStatus(){
        return RequestStatus;
        
    }
    
    public void setRequestStatus(String status){
        RequestStatus=status;
    }
    
    
    @Override
     public String toString() {
        return "ScholId"+ScholId+"\n"+"Name"+Name+"\n"+"RegNum"+RegNum+"\n"+"Email"+Email+"\n"+"Study Program+Name"+StudyProgram+"\n"+"gpa"+gpa+"\n"+"NIC"+NIC+"\n"+"RequestStatus"+RequestStatus+"\n";
    } 
    
}
