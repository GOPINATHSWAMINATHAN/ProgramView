package com.ocean.java.classobjects;

public class PassingObject {

    public double radius;

    PassingObject() {
        radius = 0.0;
    }

    PassingObject(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String args[]) {
        PassingObject po = new PassingObject(20);

        calcArea(po);
    }

    public static void calcArea(PassingObject c) {
        System.out.println(" Area of Circle : " + c.area());
    }
}