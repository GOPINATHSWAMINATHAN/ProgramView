package com.ocean.java.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest3 {

    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("2");
        lList.add("3");
        lList.add("4");
        lList.add("5");
        ListIterator itr = lList.listIterator();
        System.out.println();
        System.out.print("Forward direction: ");
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
        System.out.println();
        System.out.print("Reverse direction: ");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous() + " ");
        }
    }
}