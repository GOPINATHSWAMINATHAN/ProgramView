package com.gopinath.java.arrays;

import java.util.Scanner;



public class ArrayExampleTwo {
    int a;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i;
        int a[] = new int[5];
        for (i = 0; i < 5; i++) {
            System.out.print("Enter Value : ");
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are : ");
        for (i = 0; i < 5; i++) {
            System.out.println(" " + a[i]);
        }
    }
}