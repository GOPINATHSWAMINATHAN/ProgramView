package com.ocean.java.reflections;
//load class into Class.forName()
class ExampleOne {
    
    public void show() {
        System.out.println("Welcome to Reflcetion concept");
        System.out.println("Its a super class");
    }
}

class ReflectionDemoFour {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class cl = Class.forName("com.ocean.java.reflections.ExampleOne");
        ExampleOne obj = (ExampleOne) cl.newInstance();
        obj.show();
    }
}
