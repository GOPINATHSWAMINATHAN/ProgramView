package com.ocean.java.nestedclass;

class OuterFour {
    private int a;
    OuterFour() {
        a = 10;
    }

    public static class Inner {
        private int b;
        Inner() {
            b = 20;
        }

        void showInner() {
            System.out.println(" b = " + b);
        }
    }

    void showOuter() {
        System.out.println(" a = " + a);
    }
}

class NestedClassFour {

    public static void main(String args[]) {
        Outer otr = new Outer();
        OuterFour.Inner inr = new OuterFour.Inner();
        otr.showOuter();
        inr.showInner();
    }
}