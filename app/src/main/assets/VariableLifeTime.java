package com.gopinath.java.variables;

public class VariableLifeTime {

    public static void increment() {
        int x = 10; //Scope of a local variable is only within the method.
        x++;
        System.out.println(" " + x);
    }

    public void decrement() {
        double d = 22.2;
        System.out.println(d);
    }

    public static void main(String args[]) {
        VariableLifeTime vlt = new VariableLifeTime();
        int i;
        for (i = 1; i <= 3; i++) {
            increment();
            vlt.decrement();
        }
    }
}