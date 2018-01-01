package com.gopinath.java.inheritance;

final class Demo {

    void display() {
        System.out.println(" A\'s display().");
    }
}

// final class can't be inherited.
// class B extends A			// Error
class Sample extends Demo {

    void display() {
        System.out.println(" B\'s display().");
    }
}

class FinalClassTest {

    public static void main(String args[]) {
        Demo a = new Demo();
        Sample b = new Sample();
        a.display();
        b.display();
    }
}