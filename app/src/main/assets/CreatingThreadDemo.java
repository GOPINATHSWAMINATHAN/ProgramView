package com.gopinath.java.multithreading;

class A extends Thread {

    public A(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName());
        }
    }
}

class CreatingThreadDemo {

    public static void main(String args[]) {
        A a1 = new A("Java");
        A a2 = new A("Programs");
        a1.start();
        a2.start();
        System.out.println(" Hai !!! ");
    }
}