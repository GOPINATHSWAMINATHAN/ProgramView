package com.ocean.java.arrays;

public class JaggedArray {

    public static void main(String args[]) {
        int ar[][] = new int[4][];
        ar[0] = new int[1];
        ar[1] = new int[2];
        ar[2] = new int[3];
        ar[3] = new int[4];
        int i, j, x = 1;
        for (i = 0; i < ar.length; i++) {
            for (j = 0; j < ar[i].length; j++) {
                ar[i][j] = x;
                x++;
            }
        }
        for (i = 0; i < ar.length; i++) {
            for (j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + "  ");
            }
            System.out.println();
        }
    }
}