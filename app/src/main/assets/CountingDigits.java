package com.ocean.java.looping;

public class CountingDigits {

    public static void main(String args[]) {
        int n, c;
        n = 1990;
        c = 0;
        while (n != 0) {
            n = n / 10;
            c++;
        }
        System.out.println(" Number of Digits : " + c);
    }
}