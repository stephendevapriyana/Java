package com.Inheritance;

public class Multilevel_chilld extends Mulitlevel_parent {
	
	public void   c () {
		
		System.out.println("my name is stephen");
		

	}
	
	public static void main(String[] args) {
		
		Multilevel_chilld e=new Multilevel_chilld();
		e.a();
		e.b();
		e.c();
	
	}

}
