package com.ocean.java.string;

public class EqualsIgnoreCaseExample {

    public static void main(String args[]) {
        String s1 = "oceanÏ";
        String s2 = "OCEAN";
        String s3 = "ocean";
        System.out.println(s1 + " equals " + s2 + " = " + s1.equals(s2));
        System.out.println(s1 + "equalsIgnoreCase " + s3 + " = " + s1.equalsIgnoreCase(s3));
    }
}