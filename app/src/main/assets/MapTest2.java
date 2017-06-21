package com.ocean.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

    public static void main(String[] argv) {
        Map<Number, String> map = new HashMap<Number, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        for (Object o : map.keySet()) {
            System.out.println(o + " - " + map.get(o));
        }
    }
}