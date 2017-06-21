package com.ocean.java.wrappers;

public class WrapperDemo {

    public static void main(String args[]) {
        // Boxing
        Integer iOb = new Integer(100);

        // Unboxing
        int i = iOb.intValue();

        System.out.println(i + " : " + iOb);
    }
}