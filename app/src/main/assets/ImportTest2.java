package com.ocean.java.Package;

import java.util.Scanner;

public class ImportTest2 {

    public static void main(String args[]) {
        double r, a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = sc.nextDouble();

        a = 3.14 * r * r;

        System.out.println("Area of Circle : " + a);
    }

}
