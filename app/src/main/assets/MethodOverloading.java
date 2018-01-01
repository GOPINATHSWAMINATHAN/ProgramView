package com.gopinath.java.methods;

public class MethodOverloading {

    public void displayMsg() {
        System.out.println("Let's learn JAVA !!!");
    }

    public void displayMsg(String msg) {
        System.out.println("Welcome to : " + msg);
    }

    public static void main(String args[]) {
        MethodOverloading mo = new MethodOverloading();
        String s = "Ocean Academy";
        mo.displayMsg(s);
        mo.displayMsg();
    }
}