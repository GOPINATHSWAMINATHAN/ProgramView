package com.gopinath.java.string;

public class CapacityMethod {

    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Coding Java Programs");
        System.out.println(" Capacity = " + sb1.capacity());
        System.out.println(" Capacity = " + sb2.capacity());
    }
}