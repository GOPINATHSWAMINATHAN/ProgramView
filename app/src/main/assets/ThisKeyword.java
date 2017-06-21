package com.ocean.java.classobjects;

public class ThisKeyword {

    private double width;
    private double height;
    private double depth;

    ThisKeyword(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        ThisKeyword b1 = new ThisKeyword(10, 15, 20);
        ThisKeyword b2 = new ThisKeyword(5, 6, 7);

        System.out.println("Volume is " + b1.volume());
        System.out.println("Volume is " + b2.volume());
    }
}