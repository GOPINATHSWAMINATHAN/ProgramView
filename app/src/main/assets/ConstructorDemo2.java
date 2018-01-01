package com.gopinath.java.classobjects;

public class ConstructorDemo2 {

    public double radius;

    ConstructorDemo2() {
        radius = 0.0;
    }

    ConstructorDemo2(double rad) {
        radius = rad;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String args[]) {
        ConstructorDemo2 c1 = new ConstructorDemo2(10);
        System.out.println(" Area of Circle : " + c1.area());
    }
}