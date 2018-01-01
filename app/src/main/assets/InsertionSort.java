package com.gopinath.java.arrays;

public class InsertionSort {

    public static void main(String args[]) {
        int a[] = {0, 20, 40, 10, 50, 30};
        int i, n = 5;
        System.out.print(" The Unsorted Array is = ");
        for (i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        int tmp, j;
        a[0] = -2147483648;
        for (i = 1; i <= n; i++) {
            tmp = a[i];
            j = i - 1;
            while (tmp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tmp;
        }
        System.out.print("\n The Sorted Array is   = ");
        for (i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
