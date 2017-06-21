package com.ocean.java.exceptionhandling;

public class TryCatchDemo {

    public static void main(String args[]) {
        int d, a;
        try {
            d = 0;
            a = 10 / d;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        System.out.println("Enjoy learning and coding.");
    }
}