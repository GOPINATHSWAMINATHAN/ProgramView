package com.gopinath.java.classobjects;

public class ConstructorPassing {

    public ConstructorPassing() {
        System.out.println("Default constructor");
    }

    public ConstructorPassing(int a) {
        this();
        System.out.println("Parameter constructor one");
    }

    public ConstructorPassing(int a, int b) {
        this(10);
        System.out.println("Parameter constructor two");
    }

    public static void main(String[] args) {
        ConstructorPassing obj = new ConstructorPassing(10, 35);
    }
}
