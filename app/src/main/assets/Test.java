package com.gopinath.java.interfaces;

interface K {

    int SIZE = 4;

    void show();
}


public class Test implements K {

    public void show() {
        System.out.println(SIZE);
        System.out.println("showA() of A interface");
    }
}

class InterfaceTest {

    public static void main(String[] args) {
        K a1 = new Test();
        a1.show();
    }
}