package com.ocean.java.nestedclass;

class OuterThree {

    private int a;

    OuterThree() {
        a = 10;
    }

    public class Inner {

        private int b;

        Inner() {
            b = 20;
        }

        void showInner() {
            System.out.println(" b = " + b);
        }
    }

    void showOuter() {
        Inner inr = new Inner();
        System.out.println(" a = " + a);
        inr.showInner();
    }
}

public class NestedClassThree {

    public static void main(String args[]) {
        OuterThree otr = new OuterThree();

        otr.showOuter();
    }
}