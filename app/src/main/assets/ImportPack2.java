package com.ocean.java.packages;

public class ImportPack2 {

    void view() {
    }

    public static void main(String args[]) {

        {
            System.out.println("This is Test Package.");
        }
    }

    public class pack1 {

        public void main(String args[]) {
            ImportPack2 f = new ImportPack2();
            f.view();
        }
    }
}
