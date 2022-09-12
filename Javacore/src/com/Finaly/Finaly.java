package com.Finaly;

public class Finaly {
	
	public static void main(String[] args) {
		
//		
//		int a=10;
//		int b=0;               this worng use try(finally) key word  
//		System.out.println(a/b);
//		
		try {
			int a=12;
			int b=0;                   
			System.out.println(a/b);
			
		} catch (ArithmeticException e) {
			
		}
		finally {
			System.out.println("suriya");
		}
		
//		try {
//			int a= 10; i
//			int b =20;
//			System.out.println(a/b);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("suriya"); this if clare, will not excuted but it file excuted this out put
//			
//		}
//		finally {
//			System.out.println("stepne");
//		}
//		
	}

}
