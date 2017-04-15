package com.ocean.java.arrays;

public class RepeatedElementRemove {

    public static void main(String[] args) {
        int i;
        int ar[] = {1, 1, 2, 3, 3, 4, 5, 7, 7, 9, 11, 12, 12};
        for (i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                System.out.println(ar[i]);
            }
        }
    }

}
