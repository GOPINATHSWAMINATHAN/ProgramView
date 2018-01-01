package com.gopinath.java.string;

public class EqualsIgnoreCaseExample {

    public static void main(String args[]) {
        String s1 = "javaÏ";
        String s2 = "JAVA";
        String s3 = "java";
        System.out.println(s1 + " equals " + s2 + " = " + s1.equals(s2));
        System.out.println(s1 + "equalsIgnoreCase " + s3 + " = " + s1.equalsIgnoreCase(s3));
    }
}