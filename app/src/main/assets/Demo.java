package com.ocean.java.interfaces;

interface A {

    int SIZE = 4;

    void show();
}

public class Demo implements A {

    @Override
    public void show() {
        System.out.println("Implemented show() from A interface.");
    }
}