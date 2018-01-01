package com.gopinath.java.looping;

public class PrimeNumber {

    public static void main(String args[]) {
        int i, n;
        boolean flag = true;
        n = 2345;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.print("Number " + n + " is a PRIME Number.");
        } else {
            System.out.print("Number " + n + " is NOT a PRIME Number.");
        }
    }
}