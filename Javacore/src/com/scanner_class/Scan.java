package com.scanner_class;

import java.util.Scanner;

public class Scan {
	
	public static void main(String[] args) {
		
		Scanner Deva=new Scanner(System.in);
		
		System.out.println("Enter your Nmae");
		
		
		String Name=Deva.nextLine();
		System.out.println("My name "+Name);
		
		System.out.println("what is your +12 mark");
		
		int Mark=Deva.nextInt();
		System.out.println("my +2 mark "+Mark);
		
		
	}

}
class Scan1{
	
	public static void main(String[] args) {
		
		   Scanner uu=new Scanner(System.in);
		   System.out.println("hi");
		   
		   int o=uu.nextInt();
		   
		   for (int i = 0; i <=o ; i++) {
			   
			   System.out.println(i);
			
		}
				   
				   
			
		}
		
}