package com.ocean.java.iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException,
            IOException {    
        FileInputStream fis = new FileInputStream("file.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println(" File contents are : ");
        int ch;
        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();
    }
}