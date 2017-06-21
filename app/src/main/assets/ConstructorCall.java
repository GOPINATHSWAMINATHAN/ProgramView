package com.ocean.java.inheritance;

class Area {

    Area() {
        System.out.println("Inside Area's constructor.");
    }
}

class Bold extends Area {

    Bold() {
        System.out.println("Inside Bold's constructor.");
    }
}

class Cold extends Bold {

    Cold() {
        System.out.println("Inside Cold's constructor.");
    }
}

class ConstructorCall {

    public static void main(String args[]) {
        Cold c = new Cold();
    }
}