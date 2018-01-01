package com.gopinath.java.looping;

public class ForEachExample {

    public static void main(String args[]) {
        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : ar) {
            System.out.print(x + " ");
            x = x * 10; 
           System.out.println(x+ " ");
        }
    }
}