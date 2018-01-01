package com.gopinath.java.multithreading;

class Counter implements Runnable {
    Thread t;
    int cnt = 0;
    volatile boolean flag;

    public Counter(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void begin() {
        flag = true;
        t.start();
    }

    public void run() {
        while (flag) {
            cnt++;
        }
    }

    public void end() {
        flag = false;
    }
}
class SetPriority {

    public static void main(String args[]) {
        Counter c1 = new Counter(Thread.NORM_PRIORITY);
        Counter c2 = new Counter(Thread.MAX_PRIORITY - 2);
        Counter c3 = new Counter(Thread.MIN_PRIORITY + 2);

        c1.begin();
        c2.begin();
        c3.begin();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        c1.end();
        c2.end();
        c3.end();

        System.out.println(" Thread-1 Counter ::: " + c1.cnt);
        System.out.println(" Thread-2 Counter ::: " + c2.cnt);
        System.out.println(" Thread-3 Counter ::: " + c3.cnt);
    }
}