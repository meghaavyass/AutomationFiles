package com.core;

class student
{
	int rno;
	String sname;
	public student() {
		System.out.println("student default constructor");
		
	}
	public student(int rno,String sname)
	{
		this();
		this.rno=rno;
		this.sname=sname;
		}
	void show()
	{
		System.out.println("roll no : "+rno);
		System.out.println("student name : "+sname);
	}
}


public class ThisDemo {
	public static void main(String[] args) {
		student s1=new student(1, "megha");
		s1.show();
	}
	

}
