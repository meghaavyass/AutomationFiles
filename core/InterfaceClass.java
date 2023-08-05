package com.core;

interface ifs1
{
	
	void meth1();
	void meth2();
}
interface ifs2 extends ifs1
{
	void meth3();
	void meth4();
}
class imlinterface implements ifs2
{
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
}
public class InterfaceClass {
	public static void main(String[] args) {
		imlinterface i=new imlinterface();
		i.meth1();
		i.meth2();
		i.meth3();
		i.meth4();
	}

}
