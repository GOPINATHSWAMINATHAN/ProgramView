package com.ocean.java.iostreams;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        DataInputStream dis = new DataInputStream(System.in);

        FileOutputStream fos = new FileOutputStream("file.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
        System.out.println("Enter string ( $ to end ) : ");
        char ch;
        while ((ch = (char) dis.read()) != '$') {
            bos.write(ch);
        }
        bos.close();
    }
}