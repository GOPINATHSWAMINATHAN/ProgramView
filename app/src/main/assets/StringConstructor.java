package com.ocean.java.string;

public class StringConstructor {

    public static void main(String args[]) {
        char ch[] = {'O', 'C', 'E', 'O', 'N'};
        String s = new String(ch, 2, 2);
        System.out.println(" String = " + s);
        String s1 = "" + 2013;
        System.out.println(" String = " + s1);
    }
}