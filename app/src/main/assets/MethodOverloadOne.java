package com.gopinath.java.methods;

public class MethodOverloadOne {

    public void display(int i) {
        System.out.println("int : " + i);
    }

    public void display(long l) {
        System.out.printf("long : " + l);
    }

    public void display(float f) {
        System.out.printf("float : " + f);
    }

    public void display(double d) {
        System.out.printf("double : " + d);
    }

    public static void main(String args[]) {
        MethodOverloadOne moo = new MethodOverloadOne();

        moo.display(10);
        moo.display(20L);
        moo.display(12.3f);
        moo.display(23.4);
    }
}