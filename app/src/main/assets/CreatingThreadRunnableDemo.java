package com.ocean.java.multithreading;

class RunnableDemo implements Runnable {
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    Thread.currentThread().getName());
        }
    }
}

class CreatingThreadRunnableDemo {

    public static void main(String args[]) {
        RunnableDemo a = new RunnableDemo();
        Thread t1 = new Thread(a, "Ocean");
        Thread t2 = new Thread(a, "Academy");
        t1.start();
        t2.start();
        System.out.println(" Hello !!! ");
    }
}