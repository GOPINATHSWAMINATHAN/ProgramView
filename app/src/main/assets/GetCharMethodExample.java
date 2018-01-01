package com.gopinath.java.string;

public class GetCharMethodExample {

    public static void main(String args[]) {
        char ch[] = new char[4];
        String s1 = "Always Coding!";
        s1.getChars(0, 4, ch, 0);
        String s2 = new String(ch);
        System.out.println(" Source : " + s1);
        System.out.print(" Target : ");
        System.out.println(ch);
        System.out.println(" Source : " + s1);
        System.out.print(" Target : " + s2);
    }
}