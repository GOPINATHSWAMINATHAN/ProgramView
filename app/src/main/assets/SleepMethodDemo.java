package com.ocean.java.multithreading;

class ThreadDemo extends Thread {

    int i = 1;

    public void run() {
        while (i <= 10) {
            System.out.println(" i ::: " + i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            i++;
        }
    }
}

public class SleepMethodDemo {
    public static void main(String args[]) {
        ThreadDemo t = new ThreadDemo();
        t.start();
    }
}