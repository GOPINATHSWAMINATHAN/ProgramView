package com.ocean.java.classobjects;

public class ConstructorOverloading {
    private double width;
    private double height;
    private double depth;

    ConstructorOverloading() {
        width = 1;
        height = 1;
        depth = 1;
    }
    ConstructorOverloading(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    ConstructorOverloading(double len) {
        width = height = depth = len;
    }
    ConstructorOverloading(ConstructorOverloading b) {
        width = b.width;
        height = b.height;
        depth = b.depth;
    }
    double volume() {
        return width * height * depth;
    }
    public static void main(String args[]) {
        ConstructorOverloading b1 = new ConstructorOverloading();
        ConstructorOverloading b2 = new ConstructorOverloading(10, 15, 20);
        ConstructorOverloading b3 = new ConstructorOverloading(10);
        ConstructorOverloading b4 = new ConstructorOverloading(b2);
        System.out.println("Volume is " + b1.volume());
        System.out.println("Volume is " + b2.volume());
        System.out.println("Volume is " + b3.volume());
        System.out.println("Volume is " + b4.volume());
    }
}