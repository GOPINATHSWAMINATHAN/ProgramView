package com.gopinath.java.conditional;

public class NestedIf {

    public static void main(String args[]) {

        int test1 = 4;
        int test2 = 3;
        if (test1 == 5) {
            if (test2 == 3) {
                System.out.println("Hi, test1 is 5 and test2 is 3");
            } else {
                System.out.println("Hi, test1 is 5 and test2 is some value other than 3");
            }
        } else if (test1 == 4) {
            System.out.println("Hi, test1 is 4");
        } else {
            System.out.println("Hi, test1 is some value other than 5,4,3");
        }
    }
}