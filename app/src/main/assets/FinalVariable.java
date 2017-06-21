package com.ocean.java.inheritance;

public class FinalVariable {

    final static double PI = 3.14159;

    public static void main(String args[]) {
        double r = 10.0, a;
        a = PI * r * r;
        System.out.println("Area of Circle : " + a);
    }
}
