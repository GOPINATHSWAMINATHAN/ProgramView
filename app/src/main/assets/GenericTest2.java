package com.ocean.java.generics;

class TwoGen<T, V> {

    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

public class GenericTest2 {

    public static void main(String args[]) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(100, "BIIT");
        tgObj.showTypes();

        int v = tgObj.getob1();
        System.out.println("Value: " + v);

        String str = tgObj.getob2();
        System.out.println("Value: " + str);

        TwoGen<String, Double> tgObj1 = new TwoGen<String, Double>("Bhilai", 123.45);
        tgObj1.showTypes();

        String s1 = tgObj1.getob1();
        System.out.println("Value: " + s1);

        double d = tgObj1.getob2();
        System.out.println("Value: " + d);
    }
}
