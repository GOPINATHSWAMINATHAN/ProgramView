package com.ocean.java.arrays;

public class EndingZeroFive {

    public static void main(String[] args) {
        int ar[] = {78, 15, 13, 45, 18, 19, 20, 5};
        System.out.println("Ending with 0 or 5");
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 5 == 0) {
                System.out.print(ar[i] + " ");
            }
        }
    }

}
