package com.core;

class A11
{
	A11()
	{
		System.out.println("A1's Constructor");
	}
	void show()
	{
		
		System.out.println("show from a1");
	}

}
class B11 extends A11
{
	B11()
	{
		System.out.println("B1's Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("show from b1");
	}
}
class C11 extends B11
{
	C11()
	{
		System.out.println("C1's Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("show from c1");
	}

}
public class Polymorephysin {
	public static void main(String[] args) {
		C11 c=new C11();
		c.show();
	}

}
