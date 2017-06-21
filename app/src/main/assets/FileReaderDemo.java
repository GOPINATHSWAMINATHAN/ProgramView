package com.ocean.java.iostreams;

import java.io.*;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("file.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println(" File Not found.");
            return;
        }

        int ch;
        System.out.println(" File Contents are : ");
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();
    }
}