package com.If_class;

import java.util.Scanner;

public class If_scanner_class {
	
	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		
		int a=100;
		
	
		System.out.println("open");		
		
		int c=k.nextInt();
		
		
		if (c==a) {
			System.out.println("====");
			
		}
		
		
		else if (a<c){
			
			System.out.println(a+"+++++++");
			
			int b=20;
			System.out.println("close");
			
			int d=k.nextInt();
			
			if (b>d) {
				System.out.println("yes");
				
				
			}
			
		}
		else {
			
			System.out.println("-----------------");
		}
	}
	
//	this answer
//	open
//	150
//	100+++++++
//	close
//	10
//	yes

}
