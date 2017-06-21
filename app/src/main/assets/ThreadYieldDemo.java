package com.ocean.java.multithreading;

class Alien extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                yield();
            }
            System.out.println(" THREAD A : i = " + i);
        }
        System.out.println(" EXIT FROM A.");
    }
}

class Bakery extends Thread {

    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println(" THREAD B : J = " + j);
            if (j == 3) {
                stop();
            }
        }
        System.out.println(" EXIT FROM B.");
    }
}

class Cake extends Thread {

    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println(" THREAD C : K = " + k);
            if (k == 1) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                }
            }
        }
        System.out.println(" EXIT FROM C.");
    }
}

class ThreadYield01 {

    public static void main(String args[]) {
        new Alien().start();
        new Bakery().start();
        new Cake().start();
    }
}