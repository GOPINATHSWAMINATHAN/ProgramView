package com.gopinath.java.methods;

import java.util.Scanner;

//Method without return type and with parameters

public class MethodTypeThree {

    public static void main(String args[]) {
        double r, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        r = sc.nextDouble();
        System.out.print("Enter Height : ");
        h = sc.nextDouble();
        cylinderVolume(r, h);
    }

    static void cylinderVolume(double r, double h) {
        double v;
        final double PI = 3.14;
        v = PI * r * r * h;
        System.out.println("Volume of Cylinder : " + v);
    }
}