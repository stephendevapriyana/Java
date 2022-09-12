package com.Inheritance;

public class Hierarchical_child3 extends Hierarchical_parent {
	
	public void d() {
		
		System.out.println("i have bought new car");
	}

	
	public static void main(String[] args) {
		
		Hierarchical_chilld_1 j=new Hierarchical_chilld_1();
		
		j.a();
		j.b();
		
		 Hierarchical_chilld2 w=new  Hierarchical_chilld2();
		 
		 w.a();
		 w.c();
		 
		 Hierarchical_child3 p=new Hierarchical_child3();
		 
		 p.a();
		 p.d();
		 
	}
}
