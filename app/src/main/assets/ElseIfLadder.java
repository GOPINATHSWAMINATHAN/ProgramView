package com.ocean.java.conditional;

import java.sql.ResultSet;

public class ElseIfLadder {

    public static void main(String args[]) {
        int a = 3;

        if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else if (a == 3) {
            System.out.println("Three");
        } else {
            System.out.println("invalid Value.");
        }   
    }
}