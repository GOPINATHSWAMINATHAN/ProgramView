package com.ocean.java.classobjects;

public class DemoTwo {

    String studName;
    int studNos;

    public DemoTwo(String studName, int studNos) {
        this.studName = studName;
        this.studNos = studNos;
    }
    public void display(){
        System.out.println("Student name : "+studName);
        System.out.println("Student roll number : "+studNos);
    }

    public static void main(String[] args) {
        DemoTwo obj = new DemoTwo("Raj", 07);
        DemoTwo obj1 = new DemoTwo("Anand", 21);
        obj.display();
        obj1.display();

    }
}
