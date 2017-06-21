package com.ocean.java.string;

public class RegionMatchesMethod {

    public static void main(String args[]) {
        boolean b;
        String s1 = new String("Ocean Academy.");
        String s2 = new String("Pondicherry");
        b = s1.regionMatches(12, s2, 0, 4);
        //  For ignore case.
        //  b = s1.regionMatches(true, 12, s2, 0, 4);
        System.out.println(" Result of Region Match : " + b);
    }
}