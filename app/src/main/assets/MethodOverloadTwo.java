package com.gopinath.java.methods;

public class MethodOverloadTwo {

    public void display(int i, String s) {
        System.out.println("int : " + i + ", String : " + s);
    }

    public void display(String s, int i) {
        System.out.println("String : " + s + ", int : " + i);
    }

    public static void main(String args[]) {
        MethodOverloadTwo mot = new MethodOverloadTwo();

        mot.display(10, "OCEAN ACADEMY");
        mot.display("JAVA", 20);
    }
}