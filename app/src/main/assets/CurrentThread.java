package com.ocean.java.multithreading;

public class CurrentThread {

    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is = " + t);
        t.setName("Ocean Academy");
        System.out.println("After Changing Name is = " + t);
    }
}