package com.ocean.java.string;

public class SplitMethodExample {

    public static void main(String args[]) {
        String s1 = new String("Ocean Academy");
        String s2[] = s1.split(",");
        System.out.println(" String = " + s2[0]);
    }
}