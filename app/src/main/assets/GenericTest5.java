package com.gopinath.java.generics;

class GenDemo {

    private double val;

    //  Generic constructor.
    <T extends Number> GenDemo(T arg) {
        val = arg.doubleValue();
    }

    void showValue() {
        System.out.println("val: " + val);
    }
}

public class GenericTest5 {

    public static void main(String args[]) {
        GenDemo t1 = new GenDemo(100);
        GenDemo t2 = new GenDemo(123.5F);

        t1.showValue();
        t2.showValue();
    }
}
