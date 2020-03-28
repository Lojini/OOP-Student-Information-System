
package com.oop.model;



public class Transcript{
     
     String TransId;
     String Name;
     String RegNum;
     String Email;
     String NIC;
     String PhoneNum;
     String StudyProgram;
     String Address;
     String RequestStatus;
   
     
      public void setTransId(String Regnum)
     {
         RegNum=Regnum;
         TransId="Trans"+Regnum;
     }
     
        public String getTransId()
    {
        return TransId;
        
    }
    
    public String getName()
    {
        return Name;
        
    }
    
    public void setName(String name)
    {
        Name=name;
    }
    public void setRegNum(String regnum)
    {
        RegNum=regnum;
    }
    public String getRegNum()
    {
        return RegNum;
        
    }
    
    public void setEmail(String email)
    {
        Email=email;
    }
    public String getEmail()
    {
        return Email;
        
    }
        
    public String getNIC()
    {
        return NIC;
        
    }
    
    public void setNIC(String nic)
    {
        NIC=nic;
        
    }
    
       public String getPhoneNum()
    {
        return PhoneNum;
        
    }
    
    public void setPhoneNum(String phonenum)
    {
        PhoneNum=phonenum;
    }
       public String getStudyProgram()
    {
        return StudyProgram;
        
    }
    
    public void setStudyProgram(String studyprogram)
    {
        StudyProgram=studyprogram;
    }
       public String getAddress()
    {
        return Address;
        
    }
    
    public void setAddress(String address)
    {
        Address=address;
    }
        
    public String getRequestStatus()
    {
        return RequestStatus;
        
    }
    
    public void setRequestStatus(String status)
    {
        RequestStatus=status;
    }
    
    
    
    
     @Override
     public String toString() {
        return "TransId"+TransId+"\n"+"Name"+Name+"\n"+"RegNum"+RegNum+"\n"+"Email"+Email+"\n"+"NIC"+NIC+"\n"+"PhoneNum"+PhoneNum+"\n"+"Study Program+Name"+StudyProgram+"\n"+"Address"+Address+"\n"+"RequestStatus"+RequestStatus+"\n";
    } 
    
}

