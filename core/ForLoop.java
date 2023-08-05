/*
 * package com.core;
 * 
 * public class ForLoop { public static void main(String[] args) { int i; for
 * (i=20;i>=0;i--) { System.out.println(i); } }
 * 
 * }
 */
/*
 * package com.core;
 * 
 * import java.util.Scanner;
 * 
 * public class ForLoop { public static void main(String[] args) { int
 * i,n,sum=0; Scanner sc=new Scanner(System.in); System.out.println("enter n:");
 * n=sc.nextInt();
 * 
 * for (i=1;i<=n;i++) { sum=sum+i; } System.out.println("sum:"+sum); } }
 * 
 */
package com.core;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		n=sc.nextInt();
		
		for (i=n;i>=1;i--)
		{
			sum=sum+i;
		}
			System.out.println("sum:"+sum);
		}
	}

