package com.ocean.java.fundamentals;

public class PerfectNumber {

    public static void main(String[] args) {
        int number = 6;
        int sum = 0;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                sum = sum + i;
                System.out.println("divisible by : " + i);

            }
        }
        if (sum == number) {
            System.out.println("Its a perfect number = " + sum);
        } else {
            System.out.println("Not perfect number");
        }

    }
}
