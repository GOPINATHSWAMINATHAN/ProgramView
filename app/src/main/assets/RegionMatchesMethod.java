package com.gopinath.java.string;

public class RegionMatchesMethod {

    public static void main(String args[]) {
        boolean b;
        String s1 = new String("Practice.");
        String s2 = new String("Well");
        b = s1.regionMatches(4, s2, 0, 2);
        //  For ignore case.
        //  b = s1.regionMatches(true, 12, s2, 0, 4);
        System.out.println(" Result of Region Match : " + b);
    }
}