package com.Polymorphism;

public class Overload {
	
	public void suriya () {
		
		System.out.println("i am sD");
	}
	
	public void suriya (int a) {
		 
		System.out.println("i bought price "+a);
		
		
	}
	
	public void suriya (double b,String c ) {
		
		System.out.println(b+" bike "+"bike nmae "+c);
		
	}
	
	public static void main(String[] args) {
		
		Overload s=new Overload ();
		s.suriya();
		s.suriya(10000);
		s.suriya(2, "R15");
		
	}

}
