package com.ocean.java.inheritance;

public class SingleDemo {

    public static void main(String args[]) {
        ContainerWeight b1 = new ContainerWeight(10, 20, 15, 34.3);
        ContainerWeight b2 = new ContainerWeight(2, 3, 4, 0.076);
        double vol;
        vol = b1.volume();
        System.out.println("Volume of b1 is " + vol);
        System.out.println("Weight of b1 is " + b1.weight);
        System.out.println();
        vol = b2.volume();
        System.out.println("Volume of b2 is " + vol);
        System.out.println("Weight of b2 is " + b2.weight);
    }  
}