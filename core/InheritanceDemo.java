package com.core;

import java.util.Scanner;


class A
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A:");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter B:");
		b=sc.nextInt();
		
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
	
}
class C extends A
	{
		int c;
		void getC()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter C:");
			c=sc.nextInt();
			
		}
		void putC()
		{
			System.out.println("C : "+c);
		}
	}
public class InheritanceDemo {
	public static void main(String[] args) {
		C c1=new C();
		B b1=new B();
		c1.getA();
		c1.getC();
		b1.getB();
		c1.putA();
		c1.putC();
		b1.putB();
	}
}


