package com.gopinath.java.interfaces;
interface D {

    void display();

}
interface E {

    void show();

}

public class MultipleInterfaceDemo implements E, D {

    @Override
    public void show() {
        System.out.println("Show from E interface!");
    }

    @Override
    public void display() {
        System.out.println("Display from D interface!");
    }

    public static void main(String[] args) {
        MultipleInterfaceDemo mid = new MultipleInterfaceDemo();
        mid.display();
        mid.show();
    }
}