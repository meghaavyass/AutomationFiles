package com.core;

import java.util.Scanner;

public class FinallyDemo {
	public static void demo1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x :");
		x = sc.nextInt();
		if (x > 0) {
			System.out.println("square of" + x + " is " + (x * x));

		} else {
			throw new ArithmeticException("please enter positive value only");
		}
	}

	public static void main(String[] args) {
		try {
			demo1();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("final called");
		}
	}

}
