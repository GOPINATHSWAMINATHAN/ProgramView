package com.ocean.java.looping;

public class ReversingNumber {

    public static void main(String args[]) {
        int r, n, rev;
        n = 254378;
        rev = 0;
        while (n != 0) {
            r = n % 10;
            rev = (rev * 10) + r;
            n = n / 10;
        }
        System.out.println(" Reverse Number : " + rev);
    }
}