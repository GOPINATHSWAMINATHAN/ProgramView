package com.gopinath.java.interfaces;

interface Academy {

    void showA();
}

class Boy implements Academy {

    public void showA() {
        System.out.println("showA() of A interface  in B.");
    }
}

class Cat implements Academy {

    public void showA() {
        System.out.println("showA() of A interface  in C.");
    }
}

class InterfaceTest7 {

    public static void main(String args[]) {
        Academy a1;

        a1 = new Boy();
        a1.showA();

        a1 = new Cat();
        a1.showA();
    }
} 