package com.core;

class Rectangle
{
	double width,height;
	Rectangle()
	{
		System.out.println("default constructor");
		width=4;
		height=5;
		
	}
	Rectangle(double w,double h)
	{
		System.out.println("parameterized constructor");
		width=w;
		height=h;
		
	}
	Rectangle(Rectangle r)
	{
		System.out.println("copy constructor");
		width=r.width;
		height=r.height;
		
	}
	void volume()
	{
		System.out.println("volume : "+(width*height));
	}
}

public class Task {
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.volume();
		Rectangle r2=new Rectangle(4,5);
		r2.volume();
		Rectangle r3=new Rectangle(r1);
		r3.volume();
		
	}
}
		