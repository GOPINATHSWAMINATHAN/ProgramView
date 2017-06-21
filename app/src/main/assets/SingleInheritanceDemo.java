package com.ocean.java.inheritance;

public class SingleInheritanceDemo {

    double width;
    double height;
    double depth;

    SingleInheritanceDemo(SingleInheritanceDemo ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    SingleInheritanceDemo(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

    SingleInheritanceDemo() {
        width = 1;
        height = 1;
        depth = 1;
    }

    SingleInheritanceDemo(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class ContainerWeight extends SingleInheritanceDemo {

    double weight;

    ContainerWeight(double w, double h, double d, double m) {
        super(w, h, d);
        width = w;
        height = h;
        depth = d;
        weight = m;
        System.out.println(w);
        System.out.println(h);
        System.out.println(d);
    }

    public static void main(String[] args) {
        ContainerWeight cw = new ContainerWeight(2.3, 3.3, 4.4, 8.3);

    }
}

