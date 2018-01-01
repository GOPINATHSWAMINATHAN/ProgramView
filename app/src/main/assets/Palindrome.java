package com.gopinath.java.looping;

public class Palindrome {

    public static void main(String[] args) {
        int n = 141, sum = 0, r, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(sum + " is Palindrome number");
        } else {
            System.out.println("Not palindrome number");
        }
    }
}