package com.gopinath.java.variables;

public class VariableDemo {

    int data = 50;  //instance variable  
    static int m = 100; //static variable  

    void methodOne() {
        int n = 90; //local variable
        System.out.println(data);
        System.out.println(m);
        System.out.println(n);
    }

    public static void main(String argsp[]) {

        new VariableDemo().methodOne();
    }
}

