package com.ocean.java.classobjects;

public class ConstructorDemo {

    public double radius;

    ConstructorDemo() {
        radius = 10.0;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String args[]) {
        ConstructorDemo c1 = new ConstructorDemo();

        System.out.println(" Area of Circle : " + c1.area());
    }
}