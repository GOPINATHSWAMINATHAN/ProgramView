package com.ocean.java.methods;

import java.util.Scanner;
//Method without return type and without parameters
public class MethodTypeFour {

    public static void main(String args[]) {
        cylinderVolume();
    }

    static void cylinderVolume() {
        double r, h, v;
        final double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        r = sc.nextDouble();
        System.out.print("Enter Height : ");
        h = sc.nextDouble();
        v = PI * r * r * h;
        System.out.println("Volume of Cylinder : " + v);
    }
}