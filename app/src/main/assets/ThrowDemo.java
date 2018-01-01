package com.gopinath.java.exceptionhandling;

public class ThrowDemo {

    static void demoProc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; 		// rethrow the exception
        }
    }

    public static void main(String args[]) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}