//package com.ocean.java.reflections;
//
//import java.lang.reflect.*;
//
//class Rectangle 
//{
//	public double l, b;
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
//class ReflectionField3
//{
//	public static void main( String args[ ] )
//	{	
//		try
//		{
//			Class c = Class.forName("Rectangle");
//			Field[ ] f = c.getFields();
//			System.out.println("Field's of Rectangle: ");
//			for(int i=0 ; i<f.length ; i++) 
//			{
//				System.out.println("Field type: " + f[ i ].getType().getName());
//			}
//		}
//		catch( Exception e )
//		{
//			e.printStackTrace();
//		}
//	}
//}
