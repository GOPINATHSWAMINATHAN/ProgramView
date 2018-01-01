package com.gopinath.java.reflections;

class Student {

    private String name, address, grade;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}

public class GetReflection {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Java");
        s.setAddress("Coding");
        s.setMarks(98);
        s.setGrade("S");
        System.out.println(s.getName() + " "
                + "" + s.getAddress() + " "
                + "" + s.getMarks() + ""
                + " " + s.getGrade());
    }
}
