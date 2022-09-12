package com.without_creat_object_use_static;

public class Static {
	
	public static void Stephen() {
		
		String name="paul";
		int b=13;
		int c=24;
		int d=b+c;
		System.out.println(name);
		System.out.println(b+c);
		
	}
	
	public void Deva() {
		
		String a="bharath university";
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Static withobjaect=new Static();
		 withobjaect.Deva();
		
		Stephen();
	}

}
