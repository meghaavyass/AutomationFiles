/*
 * package com.core;
 * 
 * public class JumpingStatement { public static void main(String[] args) { int
 * i; for(i=0;i<10;i++) { if(i==5 || i==8) { continue; } else {
 * System.out.println("i:"+i); } } }
 * 
 * }
 */
package com.core;

public class JumpingStatement {
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			else
			{
				System.out.println("i:"+i);
			}
		}
	}

}
