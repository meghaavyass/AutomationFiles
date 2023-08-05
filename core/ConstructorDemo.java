package com.core;

class Box
{
	double width,height,depth;
	Box()
	{
		System.out.println("default constructor");
		width=4;
		height=5;
		depth=6;
	}
	Box(double w,double h,double d)
	{
		System.out.println("parameterized constructor");
		width=w;
		height=h;
		depth=d;
	}
	Box(Box b)
	{
		System.out.println("copy constructor");
		width=b.width;
		height=b.height;
		depth=b.depth;
	}
	void volume()
	{
		System.out.println("volume : "+(width*height*depth));
	}
}

//box is object nd new is keyword
public class ConstructorDemo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.volume();
		Box b2=new Box(3,4,5);
		b2.volume();
		Box b3=new Box(b1);
		b3.volume();
	}
}
		