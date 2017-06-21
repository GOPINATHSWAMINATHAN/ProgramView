package com.ocean.java.generics;

class NonGen {

    int num;

    NonGen(int i) {
        num = i;
    }

    int getNumber() {
        return num;
    }
}

class Gen<T> extends NonGen {

    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getObject() {
        return ob;
    }
}

public class GenericTest15 {

    public static void main(String args[]) {
        Gen<String> w = new Gen<String>("BIIT", 100);

        System.out.print(w.getObject() + " ");
        System.out.println(w.getNumber());
    }
}
