package com.gopinath.java.inheritance;

class Academy {
    int i, j;
    Academy(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class Business extends Academy {
    int k;
    Business(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        System.out.println("k: " + k);
    }
}

class MethodOverriding {
    public static void main(String args[]) {
        Business subOb = new Business(1, 2, 3);
        subOb.show(); 	
    }
}