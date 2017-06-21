package com.ocean.java.methods;

import java.util.Scanner;
//Method with return type and with parameters.
public class MethodTypeOne {

    static double CylinderVolume(double r, double h) {
        double v;
        final double PI = 3.14;
        v = PI * r * r * h;
        return v;
    }

    public static void main(String args[]) {
        double r, h, v;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = sc.nextDouble();
        System.out.print("Enter Height : ");
        h = sc.nextDouble();
        v = CylinderVolume(r, h);
        System.out.println("Volume of Cylinder : " + v);
    }
}