package com.gopinath.java.iostreams;

import com.ocean.java.iostreams.SerializationStudentDemo.Student;
import java.io.*;

public class StudentDeSerialization {
    public static void main(String[] args) throws FileNotFoundException, 
            IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream( "StuFile" );
		ObjectInputStream ois = new ObjectInputStream( fis );
		Student s;
		s = (Student)ois.readObject();
		s.display();
		ois.close();
    }
}