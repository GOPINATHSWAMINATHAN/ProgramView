package com.gopinath.java.inheritance;

class Acad {

    final void display() {
        System.out.println(" Acad\'s display().");
    }
}

class Bright extends Acad {

    void show() {
        System.out.println(" Bright\'s display().");
    }
}

class FinalMethod {

    public static void main(String args[]) {
        Bright b = new Bright();
        b.display();
        b.show();
    }
}