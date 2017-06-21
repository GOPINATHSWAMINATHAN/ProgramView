package com.ocean.java.string;

public class StringBufferConstructor {

    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("OCEAN");
        System.out.println(" sb = " + sb);
        sb = sb.append("SOFTWARE");
        System.out.println(" sb = " + sb);
        sb = sb.append("TECHNOLOGIES");
        System.out.println(" sb = " + sb);
    }
}