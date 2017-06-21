package com.ocean.java.nestedclass;

class OuterTwenty {

    int outer_x = 100;

    void test() {
        for (int i = 0; i < 5; i++) {
            class Inner {

                void display() {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner inr = new Inner();
            inr.display();
        }
    }
}

class NestedCls20 {

    public static void main(String args[]) {
        OuterTwenty otr = new OuterTwenty();
        otr.test();
    }
}