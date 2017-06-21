package com.ocean.java.string;

public class CompareToMethodDemo {

    public static void main(String args[]) {
        String s1 = "OCEAN";
        String s2 = "OCEAN";
        String s3 = "ocean";
        System.out.println(s1 + " compared to " + s2 + " = " + s1.compareTo(s2));
        System.out.println(s1 + " compared to " + s3 + " = " + s1.compareTo(s3));
    }
}