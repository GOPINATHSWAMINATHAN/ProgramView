package com.gopinath.java.packages;

 class AccountBalance {
    String name;
    double bal;

    AccountBalance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.print("--> ");
        }
        System.out.println(name + ": Rs. " + bal);
    } }

public class AccountBalance1 {

    public static void main(String args[]) {
        AccountBalance current[] = new AccountBalance[3];

        current[0] = new AccountBalance("Java", 123.45);
        current[1] = new AccountBalance("Programs", 345.12);
        current[2] = new AccountBalance("Learning,", -12.34);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}