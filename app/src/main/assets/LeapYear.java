package com.ocean.java.conditional;

public class LeapYear {

    public static void main(String args[]) {
        int y;
        y = 2014;
        if (y % 100 == 0) {
            if (y % 4 == 0) {
                System.out.println("It is a LEAP Year.");
            } else {
                System.out.println("It is not a LEAP Year.");
            }
        } else if (y % 4 == 0) {
            System.out.println("It is a LEAP Year.");
        } else {
            System.out.println("It is not a LEAP Year.");
        }
    }
}