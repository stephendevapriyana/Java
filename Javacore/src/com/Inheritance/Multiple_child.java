package com.Inheritance;

public class Multiple_child implements  Multiple_grandparent,Multiple_parent {

	@Override
	public void b() {
		System.out.println("she has arrest in polic");
		
	}

	@Override
	public void a() {
		
		System.out.println("they had attacked ");
	}

	public void c() {
		
		System.out.println("i attend java class");
	}
	
	public static void main(String[] args) {
		
		Multiple_child d=new Multiple_child();
	
		d.a();
		d.b();
		d.c();
	}
	
}
