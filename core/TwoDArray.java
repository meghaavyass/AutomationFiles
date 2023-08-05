package com.core;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 D Array");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print("enter "+i+" row & "+j+" column :");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("2 D Array Is");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.println("a["+i+"]["+j+"]="+a[i][j]);
			}
		}
	}

}
