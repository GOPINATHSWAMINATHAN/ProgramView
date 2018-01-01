package com.gopinath.java.reflections;
//getSuperclass() method 
//isInterface() method
public class ExampleThree {

    public void show() {
        System.out.println("Welcome to Reflcetion concept");
        System.out.println("Its a super class");
    }
}

class ReflectionDemoTwo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class cl = Class.forName("com.ocean.java.reflections.ExampleThree");
        ExampleThree obj = (ExampleThree) cl.newInstance();
        System.out.println(cl.getSuperclass());
        System.out.println(cl.isInterface());
    }
}
