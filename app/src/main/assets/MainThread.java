package com.ocean.java.multithreading;

public class MainThread {

    public static void main(String[] args) {
        System.out.println(" Thread Name = " + Thread.currentThread().getName());
        System.out.println(" Priority    = " + Thread.currentThread().getPriority());
    }
}