package com.gopinath.java.fundamentals;

public class Swap {

    public static void main(String args[]) {
        int a, b, t;
        a = 10;
        b = 20;
        System.out.print("Before Swapping :");
        System.out.print(a + "   " + b);
        t = a;
        a = b;
        b = t;
        System.out.print("\nAfter Swapping  : ");
        System.out.println(a + "   " + b);
    }
}