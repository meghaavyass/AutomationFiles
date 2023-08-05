package com.core;

interface ifss
{
	static void meth1()
	{
		System.out.println("meth1 defined in ifss");
	}
	
	
	void meth2();
}
interface ifsse extends ifss
{
	void meth3();
	void meth4();
}
class imlinterfacee implements ifsse
{
	
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
public class Interfacestatic {
	public static void main(String[] args) {
		imlinterface i=new imlinterface();
		ifss.meth1();
		i.meth2();
		i.meth3();
		i.meth4();
	}

}
