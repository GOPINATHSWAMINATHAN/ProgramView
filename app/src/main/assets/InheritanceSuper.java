package com.ocean.java.inheritance;

class Atom {

    Atom(int a) {
        System.out.println("A constructor. : " + a);
    }
}

class Bake extends Atom {

    Bake(int a) {
        super(a);
        System.out.println("B constructor.");
    }
}

class C extends Bake {

    C() {
        super(10);
        System.out.println("C constructor.");
    }
}

public class InheritanceSuper {

    public static void main(String[] args) {
        C x = new C();
    }
}