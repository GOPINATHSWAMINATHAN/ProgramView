package com.ocean.java.packages;

 class BalanceImport {

    String name;
    double bal;

    public BalanceImport(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0) {
            System.out.print("--> ");
        }
        System.out.println(name + ": Rs. " + bal);
    }
}

public class BalanceImport1 {

    public static void main(String args[]) {
        BalanceImport ob = new BalanceImport("Khushal", 234.56);
        ob.show();
    }

}
