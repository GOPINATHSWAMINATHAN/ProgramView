package com.gopinath.java.reflections;
//to call private method from super class

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleTwo {

    private void show() {
        System.out.println("Welcome to Reflcetion concept");
        System.out.println("Its a super class");
    }
}

class ReflectionDemoOne {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        Class cl = Class.forName("com.ocean.java.reflections.ExampleTwo");
        ExampleTwo obj = (ExampleTwo) cl.newInstance();
        Method me = cl.getDeclaredMethod("show", null);
        me.setAccessible(true);
        me.invoke(obj, null);
    }
}
