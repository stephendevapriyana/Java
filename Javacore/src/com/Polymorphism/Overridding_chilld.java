package com.Polymorphism;

public class Overridding_chilld extends Overridding_parent {

	@Override
	public void a() {
		
		super.a();
	}
	
	public void b() {
		
		super.b();
		
	}

	public void c() {
		
		super.c();
		
		
	}
	
	public void d () {
		
		System.out.println("i am stephem");
		
		
	}
	
	public static void main(String[] args) {
		
		Overridding_chilld k=new Overridding_chilld();
		
		k.a();
		k.b();
		k.c();
		k.d();
				
		
		
		
	}
}
