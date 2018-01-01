package com.gopinath.java.exceptionhandling;

class Exception02 {

    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String args[]) {
        Exception02.subroutine();
    }
}