package com.gopinath.java.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorText {

    public static void main(String args[]) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        Iterator i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
    }
}
