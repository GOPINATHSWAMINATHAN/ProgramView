package com.ocean.java.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetText1 {

    public static void main(String[] argv) {
        Set<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object item = it.next();
            System.out.println(item + "  ");
        }
    }
}