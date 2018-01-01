package com.gopinath.java.string;

public class CompareToMethodDemo {

    public static void main(String args[]) {
        String s1 = "JAVA";
        String s2 = "JAVA";
        String s3 = "java";
        System.out.println(s1 + " compared to " + s2 + " = " + s1.compareTo(s2));
        System.out.println(s1 + " compared to " + s3 + " = " + s1.compareTo(s3));
    }
}