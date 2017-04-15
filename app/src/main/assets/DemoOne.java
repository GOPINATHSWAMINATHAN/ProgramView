package com.ocean.java.classobjects;

public class DemoOne {

    int a, b;

    public DemoOne(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("value of a = " + a);
        System.out.println("value of b = " + b);
    }

    public static void main(String[] args) {
        DemoOne obj = new DemoOne(10, 33);
        obj.display();
    }

}
