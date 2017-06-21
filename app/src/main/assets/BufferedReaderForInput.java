package com.ocean.java.iostreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderForInput {

    public static void main(String[] args) {
        int a = 0, b = 0, t;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.print(" Enter first Number : ");
            a = Integer.parseInt(br.readLine());
            System.out.print("Enter second Number : ");
            b = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Exception occured.");
        }
        System.out.print("\n Before Swapping : ");
        System.out.print(a + "   " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("\n After Swapping  : ");
        System.out.print(a + "   " + b);
    }
}