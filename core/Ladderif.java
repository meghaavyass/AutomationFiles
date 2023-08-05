package com.core;

import java.util.Scanner;

public class Ladderif {
	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter student name");
		sname=sc.next();
		System.out.print("enter roll no");
		rno=sc.nextInt();
		System.out.print("enter mark of student 1 : ");
		s1=sc.nextInt();
		System.out.print("enter mark of student 2 : ");
		s2=sc.nextInt();
		System.out.print("enter mark of student 3 : ");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("student name:"+sname);
		System.out.println("roll no:"+rno);
		System.out.println("total:"+total);
		System.out.println("percentage:"+per);
		
		if(per>=70)
		{
			System.out.println("distiction");
		}
		else if(per>=60)
		{
			System.out.println("first class");
		}
		else if(per>=50)
		{
			System.out.println("second class");
		}
		else if(per>=40)
		{
			System.out.println("pass class");
		}
		else
		{
			System.out.println("fail");
		}
	}
}