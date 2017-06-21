package com.ocean.java.iostreams;

import java.io.*;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        FileWriter fw = new FileWriter("file.txt");
        char ch;
        System.out.println(" Enter string ( $ to end ) : ");
        while ((ch = (char) dis.read()) != '$') {
            fw.write(ch);
        }

        fw.close();
    }
}