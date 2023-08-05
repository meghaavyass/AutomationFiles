package com.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println("start code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter a : ");
			a=sc.nextInt();
			System.out.println("enter b : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("divisio : "+c);
			int arr[]= {1,2,3,4,5};
			System.out.println("enter index number :");
			int index=sc.nextInt();
			System.out.println("data fetched : "+arr[index]);
		}catch (ArithmeticException e) {
			System.out.println("exception caught : "+e);
		}catch(InputMismatchException e) {
			System.out.println("exception caught : "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught : "+e);
			
		}
		System.out.println("end code");
			

			
	}

}
