package com.gopinath.java.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        System.out.println(" File contents are : ");
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();
    }
}         