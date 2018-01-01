package com.gopinath.java.methods;

import java.util.Scanner;
//Method with returntype and without parameters

public class MethodTypeTwo {

    static double CylinderVolume() {
        double r, h, v;
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        r = sc.nextDouble();
        System.out.print("Enter Height : ");
        h = sc.nextDouble();
        v = PI * r * r * h;
        return v;
    }

    public static void main(String args[]) {
        double v;
        v = CylinderVolume();
        System.out.println("Volume of Cylinder : " + v);
    }
}