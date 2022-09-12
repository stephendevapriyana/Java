package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	
	
	public static void main(String[] args) {
		
		
		//1. Arithmetic
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println(e);		
			}
		finally {
			System.out.println("the exception is catched");
	
		}
	
      //2. null pointer	
		
		try {
			String a=null;
			int length = a.length();
			System.out.println(length);
			
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("stephen");
		}
		
		// 3.input mismatched
		try {

			Scanner gg=new Scanner(System.in);
			
			System.out.println("id no");
			int c=gg.nextInt();
			System.out.println(c);
		} catch (InputMismatchException e ) {
			System.out.println(e);
		}
		finally {
			
			System.out.println("deva");
		}
		
		//4. Array index of bound
	   try {
		   int [] fg=new int [3];
		     
		     fg[0]=10;
		     fg[1]=20;
		     fg[2]=30;
		     fg[4]=40;
		     for (int i : fg) {
		    	 System.out.println(fg[i]);
				
			}
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	   finally {
		   System.out.println("stephen");
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
