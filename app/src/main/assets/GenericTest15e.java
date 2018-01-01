package com.gopinath.java.generics;

class Gene<T> {

    T ob;

    Gene(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}

class Gen2<T, V> extends Gene<T> {

    V ob2;

    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getob2() {
        return ob2;
    }
}

public class GenericTest15e {

    public static void main(String args[]) {
        Gen2<String, Integer> x = new Gen2<String, Integer>("Value is: ", 100);
        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}
