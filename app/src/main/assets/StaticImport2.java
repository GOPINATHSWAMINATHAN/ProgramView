package com.ocean.java.Package;

import static java.lang.Math.PI;
import java.util.Scanner;

public class StaticImport2 {

    public static void main(String args[]) {
        double r, a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = sc.nextDouble();

        a = PI * r * r;

        System.out.println("Area of Circle : " + a);
    }

}
