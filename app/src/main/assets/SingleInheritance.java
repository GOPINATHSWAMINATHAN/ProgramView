package com.ocean.java.inheritance;

class A {

    int i, j;
    void displayij() {
        System.out.println("i and j: " + i + " " + j);
    }
}
class B extends A {

    int k;
    void displayk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}
class SingleInheritance {
    public static void main(String args[]) {
        A sup = new A();
        B sub = new B();
        sup.i = 10;
        sup.j = 20;
        sup.displayij();
        sub.i = 7;
        sub.j = 8;
        sub.k = 9;
        sub.displayij();
        sub.displayk();
        sub.sum();
    }
}