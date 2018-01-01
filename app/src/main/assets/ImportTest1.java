package com.gopinath.java.Package;

public class ImportTest1 {

    public static void main(String args[]) {
        double r, a;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = sc.nextDouble();

        a = 3.14 * r * r;

        System.out.println("Area of Circle : " + a);
    }
}
