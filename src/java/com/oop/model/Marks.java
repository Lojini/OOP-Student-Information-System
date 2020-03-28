
package com.oop.model;
/**
 * This is the Marks model class
 * 
 * @author Pavidha Lojini
 *
 */
public class Marks {
     
    private String MarksId;
    private String StudentId;
    private String SubjectName;
    private int Assignment;
    private int MidMarks;
    private int FinalMarks;
     
    /**
     * @return the MarksId
     */ 
    public String getMarksId(){
        return MarksId;
    }
    
    /**
     * @param subname
     * @param Studentid
     */
    public void setMarksId(String subname,String Studentid) {
        SubjectName=subname;
        StudentId=Studentid;
        MarksId=subname+Studentid;
    }
    
    /**
     * @return the StudentId
     */
    public String getStudentId(){
        return StudentId;
    }
    
    /**
     * @param Studentid
     */
    public void setStudentId(String Studentid){
        StudentId=Studentid;
    }
    
    /**
     * @return the SubjectName
     */
    public String getSubjectName(){
        return SubjectName;
    }
    
    /**
     * @param Subname
     */
    public void setSubjectName(String Subname){
        SubjectName=Subname;
    }
    
    /**
     * @return the AssignmentMarks
     */
    public int getAssignmentMarks(){
        return Assignment;
    }
    
    /**
     * @param assignment
     */
    public void setAssignmentMarks(int assignment){
        Assignment=assignment;
    }
    
    /**
     * @return the MidMarks
     */
    public int getMidMarks(){
        return MidMarks;
    }
    
    /**
     * @param Midmarks
     */
    public void setMidMarks(int Midmarks){
        MidMarks=Midmarks;
    }
    
    /**
     * @return the FinalMarks
     */
    public int getFinalMarks(){
        return FinalMarks;
    }
    
    /**
     * @param Finalmarks
     */
    public void setFinalMarks(int Finalmarks){
        FinalMarks=Finalmarks;
    }
    
    @Override
    public String toString() {
        return "MarksId"+MarksId+"\n"+"StudentId"+StudentId+"\n"+"Subject Name"+SubjectName+"\n"+"Assignment Marks"+Assignment+"\n"+"Mid Marks"+MidMarks+"\n"+"Final Marks"+FinalMarks+"\n";
    } 
    
}
