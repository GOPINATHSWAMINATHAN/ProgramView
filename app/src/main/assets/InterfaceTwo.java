package com.ocean.java.interfaces;

interface InterfaceOne {
    public void multiplication();
}

interface InterfaceTwo extends InterfaceOne {
    public void divide();
}

class Formula implements InterfaceTwo {
    
    int a = 24, b = 4, c;
    @Override
    public void divide() {
        c = a / b;
        System.out.println("Divide answer = " + c);
    }
    @Override
    public void multiplication() {
        c = a * b;
        System.out.println("Multiplication answer = " + c);
    }

    public static void main(String[] args) {
        Formula obj = new Formula();
        obj.multiplication();
        obj.divide();
    }
}
