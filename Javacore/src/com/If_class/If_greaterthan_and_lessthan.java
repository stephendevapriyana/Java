package com.If_class;

public class If_greaterthan_and_lessthan {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		int c=300;
		
		if (a>b && a>c) {
			
			System.out.println(a);
			
		}
		
		else if(b>a && b>c) {
			
			System.out.println(b);
		}
		
		else if(c>a && c>b) {
			System.out.println(c);
			
			}
		else{
			System.out.println("no");
			
			
		}
	}

}
