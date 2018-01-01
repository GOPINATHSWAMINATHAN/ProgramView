package com.gopinath.java.operators;

public class IncrementOperator {

    public static void main(String args[]) {
        int a = 10, b = 20, c;
        c = (++a) + (++b);
        //c = ( a++ ) + ( b++ );
        System.out.println(" value of a = " + a);
        System.out.println(" value of b = " + b);
        System.out.println(" Value of c = " + c);
    }
}