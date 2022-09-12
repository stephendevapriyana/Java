package com.Inheritance;

public class Singal_parent_child extends Singel_Parent {
	
	public void c() {
		
		System.out.println("i arise 5 clock");
	}
	
	public static void main(String[] args) {
		
		Singal_parent_child t=new Singal_parent_child();
		
		t.a();
		t.b();
		t.c();
		
	}

}
