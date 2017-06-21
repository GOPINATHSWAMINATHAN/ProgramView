package com.ocean.java.collections;

import java.util.Stack;

public class StackTest {

    public static void main(String args[]) {
        Stack<String> s = new Stack<String>();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println("Next: " + s.peek());
        s.push("D");
        System.out.println(s.pop());
        s.push("E");
        s.push("F");
        int pos = s.search("E");
        if (pos >= 1) {
            System.out.println("Element found at position: " + pos);
        } else {
            System.out.println("Element not found.");
        }
        System.out.println(s);
    }
}