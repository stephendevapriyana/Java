package com.Abstract;

public class Fully_abstract_chilld extends Fully_abstract_parent {

	@Override
	public void a() {
		
		System.out.println("happy");
		
	}

	@Override
	public void b() {
		
		System.out.println("angery");
		
		
	}

	@Override
	public void c() {
		
		System.out.println("smille");
		
	}
	
	
	public void d() {
		//this method child
		
		System.out.println("no happy");
		
	}
	
	public static void main(String[] args) {
		
		Fully_abstract_chilld g=new Fully_abstract_chilld();
		g.a();
		g.b();
		g.c();
		g.d();
		
		
	}

}
