package com.ocean.java.reflections;

import java.lang.reflect.*;

class Shape
{
	void draw()
	{
		System.out.println("Drawing Shape.");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle.");
	}
}

class ReflectionTest5  
{
	public static void main( String args[ ] )
	{	
		try
		{
			Class c = Class.forName("Rectangle");
			Class sc = c.getSuperclass();
			System.out.println("The Name of the Super class: " + sc.getName());
			Method sm[ ] = sc.getDeclaredMethods();
			System.out.println("\nThe Super class has:");
			for (int i=0 ; i<sm.length ; i++)
			{
				System.out.println("Method's Signature: " + sm[ i ].toString());
				System.out.println(" & Return type: " + sm[ i ].getReturnType().getName());
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
