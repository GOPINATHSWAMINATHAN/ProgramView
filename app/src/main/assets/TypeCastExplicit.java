package com.gopinath.java.operators;

public class TypeCastExplicit {

    public static void main(String args[]) {
        int a;
        float b = 123.333f;
        System.out.println(" Before Casting ::: " + b);
        a = (int) b;
        System.out.println(" After Casting  ::: " + a);
    }
}