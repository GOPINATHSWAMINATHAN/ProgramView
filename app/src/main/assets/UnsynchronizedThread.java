package com.ocean.java.multithreading;
class Shared {

    void justDoIt(String s) {
        System.out.println(" Starting ::: " + s);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println(" Ending ::: " + s);
    }
}
class MyThread extends Thread {
    Shared sr;
    public MyThread(Shared sr1, String s) {
        super(s);
        sr = sr1;
        start();
    }

    public void run() {
        sr.justDoIt(Thread.currentThread().getName());
    }
}
class UnSynchronizedThread {
    public static void main(String args[]) {
        Shared sr = new Shared();
        MyThread ob1 = new MyThread(sr, "Ocean");
        MyThread ob2 = new MyThread(sr, "Academy");
        MyThread ob3 = new MyThread(sr, "Pondicherry.");

        try {
            ob1.join();
            ob2.join();
            ob3.join();
        } catch (InterruptedException e) {
        }
    }
}