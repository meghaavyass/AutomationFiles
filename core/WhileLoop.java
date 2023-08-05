/*
 * package com.core;
 * 
 * import java.util.Scanner;
 * 
 * public class WhileLoop { public static void main(String[] args) { int n;
 * Scanner sc=new Scanner(System.in); System.out.print("enter n:");
 * n=sc.nextInt(); while(n>0) { System.out.println("megha"); n--; } }
 * 
 * }
 */
package com.core;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n:");
		n=sc.nextInt();
		while(n>0)
		{
			sum=sum+n;
			n--;
		}
			System.out.println("sum:"+sum);
		
		}
	}


