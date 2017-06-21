package com.ocean.java.arrays;

public class BubbleSort {

    public static void main(String args[]) {
        int i, j, t;
        int a[] = {40, 20, 50, 10, 30};

        System.out.print("\n Unsorted Numbers  are = ");
        for (i = 0; i < 5; i++) {
            System.out.print(a[i] + "  ");
        }
        for (i = 0; i < 5 - 1; i++) {
            for (j = 0; j < (5 - 1 - i); j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }}}
        System.out.print("\n Sorted Numbers  are  = ");
        for (i = 0; i < 5; i++) {
            System.out.print(a[i] + "  ");
        }}}