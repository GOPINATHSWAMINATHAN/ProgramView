package com.gopinath.java.arrays;

public class ArrayExample {

    public static void main(String args[]) {
        int i, x = 1;
        int a[] = new int[5];
        for (i = 0; i < 5; i++) {
            a[i] = x;
            x++;
        }
        System.out.print("\n Array elements are : ");
        for (i = 0; i < 5; i++) {
            System.out.println(" " + a[i]);
        }
    }
}