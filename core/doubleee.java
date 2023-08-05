package com.core;

import java.util.Scanner;

public class doubleee {
	public static void main(String[] args) {
		
	
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of a : ");
		a=sc.nextDouble();
		System.out.println("enter value of b : ");
		b=sc.nextDouble();
		c=a+b;
		System.out.println("addition : "+c);
		c=a-b;
		System.out.println("subtraction :"+c);
		c=a*b;
		System.out.println("multiplication :"+c);
		c=a/b;
		System.out.println("division :"+c);
		}

}



