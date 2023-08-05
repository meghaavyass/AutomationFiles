package com.core;

public class MethodOverloading {
	void test()
	{
		System.out.println("test with no argument");
	}
	void test(int a)
	{
		System.out.println("test with 1 agrument");
	}
	void test(int a, int b)
	{
		System.out.println("test with 2 ARGUMENT");
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
				m.test();
				m.test(23,45);
				m.test(33);
	}

}
