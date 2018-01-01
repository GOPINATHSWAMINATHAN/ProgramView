package com.gopinath.java.generics;

public class GenericTest7 {
    // generic method printArray

    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray) {
            System.out.printf("%s  ", element);
        }

        System.out.println();
    }

    public static void main(String args[]) {
        // create arrays of Integer, Double and Character
        Integer[] i = {1, 2, 3, 4, 5, 6};
        Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] c = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array i contains:");
        printArray(i);

        System.out.println("\nArray d contains:");
        printArray(d);

        System.out.println("\nArray c contains:");
        printArray(c);
    }
}
