package com.ocean.java.string;

public class IndexOfMethod {

    public static void main(String args[]) {
        String s1 = "Ocean Academy Complete Software Training Division, Pondicherry.";
        System.out.println(" Index of " + 't' + " = " + s1.indexOf('t'));
        System.out.println(" Index of " + 'T' + " = " + s1.indexOf('T'));
        System.out.println(" Index of " + "Training" + " = " + s1.indexOf("training"));
        System.out.println(" Index of " + "TRAINING" + " = " + s1.indexOf("TRAINING"));
    }
}