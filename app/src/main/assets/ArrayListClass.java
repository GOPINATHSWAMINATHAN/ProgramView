package com.gopinath.java.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");
        ListIterator<String> listItr = aList.listIterator();
        System.out.print("Elements are : ");
        while (listItr.hasNext()) {
            System.out.println(listItr.next() + " ");
        }
    }
}