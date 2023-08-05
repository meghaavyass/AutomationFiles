package com.core;

import java.util.Scanner;

public class ifstatement {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A:");
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("a is possitive number");
		}
		else
		{
			System.out.println("a is negative number");
			
		}
		
	}
}


