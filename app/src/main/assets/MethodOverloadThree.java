package com.ocean.java.methods;

public class MethodOverloadThree {

    public void display(int[] i) {
        System.out.print(" int Array : ");
        for (int a : i) {
            System.out.println(" " + a);
        }
    }

    public void display(double[] d) {
        System.out.print(" double Array : ");
        for (double a : d) {
            System.out.println(" " + a);
        }
    }

    public void display(String[] s) {
        System.out.print(" String Array : ");
        for (String a : s) {
            System.out.println(" " + a);
        }
    }

    public static void main(String args[]) {
        MethodOverloadThree ob = new MethodOverloadThree();
        int a[] = {10, 20, 30, 40, 50};
        double b[] = {12.3, 23.4, 34.5, 45.6, 56.7};
        String c[] = {"Ocean Academy", "Muthialpet", "Near Ginger Hotel", "Puducherry"};
        ob.display(a);
        ob.display(b);
        ob.display(c);
    }
}
