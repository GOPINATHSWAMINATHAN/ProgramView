package com.ocean.java.generics;

class NonGene {

    int num;

    NonGene(int i) {
        num = i;
    }

    int getNumber() {
        return num;
    }
}

class Gener<T> extends NonGene {

    T ob;

    Gener(T o, int i) {
        super(i);
        ob = o;
    }

    T getObject() {
        return ob;
    }
}

public class GenericTest15f {

    public static void main(String args[]) {
        Gener<String> w = new Gener<String>("BIIT", 1234);

        System.out.print(w.getObject() + " ");
        System.out.println(w.getNumber());
    }
}
