package com.gopinath.java.packages;

public class ImportPackage1 {

    public void view() {
    }

    public static void main(String args[]) {
        System.out.println("This is Test Package.");
    }

    public class Import {

        public void main(String args[]) {
            ImportPackage1 f = new ImportPackage1();
            f.view();
        }

    }
}
