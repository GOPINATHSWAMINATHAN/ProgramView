package com.gopinath.java.nestedclass;

class Outer
{
	private int a;

	Outer()
	{
		a = 10;
	}

	public class Inner
	{
		private int b;

		Inner()
		{
			b = 20;
		}

		void showInner()
		{
			System.out.println(" a = " + a);
			System.out.println(" b = " + b);
		}
	}

	void showOuter()
	{
		System.out.println(" a = " + a);
		//  System.out.println(" b = " + b);	// Error
	}
}

public class NestedClassTwo
{
	public static void main( String args[ ] )
	{
		Outer otr = new Outer();
		Outer.Inner inr = otr.new Inner();

		otr.showOuter();
		inr.showInner();
	}
}

