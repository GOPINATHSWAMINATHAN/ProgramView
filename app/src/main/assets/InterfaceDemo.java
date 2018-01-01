package com.gopinath.java.interfaces;

interface C {

    void showA();

    void showB();
}

abstract class Bell implements C {

    public void showA() {
        System.out.println("showA() of A interface.");
    }
}

class Tell extends Bell {

    public void showB() {
        System.out.println("showB() of A interface.");
    }
}

class InterfaceDemo {

    public static void main(String args[]) {
        C c = new Tell();
        c.showA();
        c.showB();
    }
}
