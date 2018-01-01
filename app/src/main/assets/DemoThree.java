package com.gopinath.java.classobjects;

public class DemoThree {
    int studNos;
    String studName,studDept;    
    double studFees;
    
    public DemoThree(int studNos,String studName,String studDept,double studFees) {
        this.studNos = studNos;
        this.studName = studName;
        this.studDept = studDept;
        this.studFees = studFees;
        
    }
    public void display(){
        System.out.println("Student roll number : "+studNos);
        System.out.println("Studnet Name : "+studName);
        System.out.println("Student Dept : "+studDept);
        System.out.println("Student Fees : "+studFees);
    }
    
    public static void main(String[] args) {
        DemoThree obj = new DemoThree(12, "Ram", "Computer Science", 65872.00);
        obj.display();
    }
}
