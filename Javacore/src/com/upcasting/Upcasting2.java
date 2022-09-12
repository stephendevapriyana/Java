package com.upcasting;

public class Upcasting2 extends Upcasting{
	
	@Override
	public void Stephen() {
//		// TODO Auto-generated method stub
//		super.Stephen();
		System.out.println("stephen is plaing cricket in street");
	}

	public void Devapriyan() {
		
		System.out.println("deva is working a company");
	}
	
	
	public static void main(String[] args) {
		
		Upcasting2 u=new Upcasting2();
		u.Stephen();
		u.Devapriyan();
		
	}
}
