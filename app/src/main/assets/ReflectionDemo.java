package com.ocean.java.reflections;

class Employee {

    private String name, address;
    private int rollno;

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

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

}

public class ReflectionDemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ocean Academy");
        e.setAddress("Pondicherry");
        e.setRollno(1);

        System.out.println(e.getName() + "  "
                + "" + e.getAddress() + " "
                + " " + e.getRollno());
    }

}
