package com.gopinath.java.reflections;

import java.lang.reflect.*;

class Shape
{
	void  draw()
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

class ReflectionTest1
{
	public static void main( String args[ ] )
	{
		try
		{
			Class c = Class.forName("Rectangle");
			Method m[ ] = c.getDeclaredMethods();
			System.out.println("Methods of Rectangle: ");
			for(int i=0 ; i<m.length ; i++)
			{
				System.out.println("Method's Signature: " + m[ i ].toString());
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
