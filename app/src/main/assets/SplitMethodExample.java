package com.gopinath.java.string;

public class SplitMethodExample {

    public static void main(String args[]) {
        String s1 = new String("Java Coding!");
        String s2[] = s1.split(",");
        System.out.println(" String = " + s2[0]);
    }
}