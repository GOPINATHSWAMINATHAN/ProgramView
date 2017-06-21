package com.ocean.java.classobjects;

public class ThisKeywordDemo {

    private double radius;

    ThisKeywordDemo() {
        radius = 0.0;
    }

    ThisKeywordDemo(double radius) {
        this.radius = radius;
    }

    ThisKeywordDemo(ThisKeywordDemo ob) {
        radius = ob.radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String args[]) {
        ThisKeywordDemo c1 = new ThisKeywordDemo(10);
        ThisKeywordDemo c2 = new ThisKeywordDemo(c1);
        System.out.println(" Area of Circle : " + c2.area());
    }
}