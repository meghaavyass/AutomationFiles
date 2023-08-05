package com.core;

import java.util.Scanner;

public class Throw {
	public static void demo()
	{
		int x;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter x : ");
			x=sc.nextInt();
			if(x>0)
		{
			System.out.println("square of"+x+" is "+(x*x));
			
		}
		else
		{
			throw new ArithmeticException("please enter positive value only");
		}
	}catch (ArithmeticException e) {
		System.out.println(e);
		demo();
		// TODO: handle exception
	}
	}
	public static void main(String[] args) {
		demo();
	}
		
}

	


