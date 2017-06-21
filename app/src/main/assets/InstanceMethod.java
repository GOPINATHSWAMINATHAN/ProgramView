package com.ocean.java.methods;

public class InstanceMethod {

    public void firstMethod() {
        System.out.println("First Instance method");
    }

    public static void main(String[] args) {
        InstanceMethod im = new InstanceMethod();
        im.firstMethod();
    }
}