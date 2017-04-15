package com.ocean.java.interfaces;

public interface Calculation {

    public void addition();
    public void subtraction();
}

class Calc implements Calculation {

    int a = 12, b = 8, c;
    @Override
    public void addition() {
        c = a + b;
        System.out.println("Addition answer = " + c);
    }
    @Override
    public void subtraction() {
        c = a - b;
        System.out.println("Subtraction answer = " + c);
    }

    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.addition();
        obj.subtraction();

    }

}
