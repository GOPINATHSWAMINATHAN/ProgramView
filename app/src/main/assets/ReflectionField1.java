//package com.ocean.java.reflections;
//
//import java.lang.reflect.*;
//
//class Rectangle 
//{
//	private double l, b;
//	
//	Rectangle(double x, double y)
//	{
//		l = x;
//		b = y;
//	}
//	
//	void area()
//	{
//		double ar = l * b;
//		System.out.println("Area of Rectangle: " + ar);
//	}
//}
//
//class Triangle 
//{
//	private double b, h;
//	
//	Triangle(double x, double y)
//	{
//		b = x;
//		h = y;
//	}
//		
//	void area()
//	{
//		double ar = (1.0 / 2.0) * b * h;
//		System.out.println("Area of Triangle: " + ar);
//	}
//}
//
//class ReflectionField1
//{
//	public static void main( String args[ ] )
//	{	
//		try
//		{
//			Class c = Class.forName("Rectangle");
//			Field f[ ] = c.getDeclaredFields();
//			System.out.println("Fields of Rectangle: ");
//			for(int i=0 ; i<f.length ; i++)
//			{
//				System.out.println("Field : " + f[ i ].toString());
//			}
//			
//			c = Class.forName("Triangle");
//			f = c.getDeclaredFields();
//			System.out.println("\nFields of Triangle: ");
//			for(int i=0 ; i<f.length ; i++)
//			{
//				System.out.println("Field : " + f[ i ].toString());
//			}
//		}
//		catch( Exception e )
//		{
//			e.printStackTrace();
//		}
//	}
//}
