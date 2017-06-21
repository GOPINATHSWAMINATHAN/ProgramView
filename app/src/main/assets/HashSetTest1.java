package com.ocean.java.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class HashSetTest1 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        Enumeration e = Collections.enumeration(hashSet);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement() + "  ");
        }
    }
}