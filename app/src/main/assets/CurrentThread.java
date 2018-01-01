package com.gopinath.java.multithreading;

public class CurrentThread {

    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread is = " + t);
        t.setName("Java Programs");
        System.out.println("After Changing Name is = " + t);
    }
}