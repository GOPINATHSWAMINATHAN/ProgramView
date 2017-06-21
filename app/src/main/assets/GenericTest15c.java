package com.ocean.java.generics;

class Gent<T> {

    T ob;

    Gent(T o) {
        ob = o;
    }

    T getObject() {
        System.out.println("Gen's getObject(): ");
        return ob;
    }
}

class Gen20<T> extends Gent<T> {

    Gen20(T o) {
        super(o);
    }

    T getObject() {
        System.out.println("Gen2's getObject(): ");
        return ob;
    }
}

public class GenericTest15c {

    public static void main(String[] args) {
        Gent<Integer> intObject = new Gent<Integer>(88);
        Gen20<Long> longObject = new Gen20<Long>(99L);

        intObject.getObject();
        longObject.getObject();
    }
}
