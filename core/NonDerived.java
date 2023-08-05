package com.p1;

public class NonDerived {
	protection p=new protection();
	NonDerived()
	{
		System.out.println("nonderived's construction");
		System.out.println("n : "+p.n);
		System.out.println("n_pub :"+p.n_pub);
		//System.out.println("n_pri :"+p.n_pri);
		System.out.println("n_pro :"+p.n_pro);
	}

}
