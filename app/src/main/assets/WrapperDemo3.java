package com.gopinath.java.wrappers;

public class WrapperDemo3 {

    static int func(Integer v) {
        return v;
    }

    public static void main(String args[]) {
        Integer iOb = func(100);
        System.out.println(iOb);
    }
}