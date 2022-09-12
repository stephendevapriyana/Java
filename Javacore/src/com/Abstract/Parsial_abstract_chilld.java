package com.Abstract;

public class Parsial_abstract_chilld extends Parsial_abstract_parent {

	@Override
	public void a() {
		System.out.println("deva");
		
	}

	@Override
	public void b() {
		System.out.println("stephen");
		
	}
	
	public static void main(String[] args) {
		
		 Parsial_abstract_chilld f= new Parsial_abstract_chilld();
		 
		 f.a();
		 f.b();
		 f.c();
		 
	}

}
