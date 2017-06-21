package com.ocean.java.iostreams;

import com.ocean.java.iostreams.BoxSerialization.Box;
import java.io.*;
public class BoxDeSerialization {

    public static void main(String[] args) throws FileNotFoundException,
            IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("ObjFile");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Box b1;
        b1 = (Box) ois.readObject();
        b1.display();
        ois.close();
    }
}