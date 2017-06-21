package com.ocean.java.fundamentals;

public class CompoundInterest {

    public void calculate(int p, int t, int r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double interest = amount - p;
        System.out.println("Compond Interest is " + interest);
        System.out.println("Amount is " + amount);
    }

    public static void main(String args[]) {
        CompoundInterest ci = new CompoundInterest();
        ci.calculate(3400, 3, 4, 2);
    }
}