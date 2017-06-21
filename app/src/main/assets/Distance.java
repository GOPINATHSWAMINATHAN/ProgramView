package com.ocean.java.classobjects;

public class Distance {

    int feet;
    double inches;

    public static void main(String args[]) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();

        d1.feet = 11;
        d1.inches = 9.0;
        d2.feet = 13;
        d2.inches = 7.5;

        System.out.println("Dist-1 : " + d1.feet + "\'-" + d1.inches + "\"");
        System.out.println("Dist-2 : " + d2.feet + "\'-" + d2.inches + "\"");
    }
}