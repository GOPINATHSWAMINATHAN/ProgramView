package com.ocean.java.multithreading;
class Academy extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ocean");
        }
    }
}
class B extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Academy");
        }
    }
}
class C extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Pondicherry");
        }
    }
}

class Thread04 {

    public static void main(String args[]) {
        System.out.println(" Hello  !!! ");
        Academy a = new Academy();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
        System.out.println(" Bye-Bye !!! ");
    }
}