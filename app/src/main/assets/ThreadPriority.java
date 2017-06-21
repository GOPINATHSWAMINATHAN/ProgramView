package com.ocean.java.multithreading;

class Age extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" THREAD A = " + i);
        }
        System.out.println(" END OF THREAD A.");
    }
}

class Bat extends Thread {

    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println(" THREAD B = " + j);
        }
        System.out.println(" END OF THREAD B.");
    }
}

class ThreadPriority {

    public static void main(String args[]) {
        Age a = new Age();
        Bat b = new Bat();
        a.setPriority(Thread.MAX_PRIORITY - 2);
        b.setPriority(Thread.MIN_PRIORITY + 2);
        a.start();
        b.start();
        System.out.println(" END OF MAIN THREAD.");
    }
}