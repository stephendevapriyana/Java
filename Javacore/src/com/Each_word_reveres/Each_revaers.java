package com.Each_word_reveres;

public class Each_revaers {
	
	public static void main(String[] args) {
		
		
		String stephen="Stephen paul deva";
		
		String s1=" ";
		
		
//		
//		for (int i =stephen.length()-1; i>=0; i--) {
//			
//			s1+=stephen.charAt(i);
//			
//			}
//		System.out.println(s1);
//		
		String[] sp = stephen.split(s1);
		for (int i = 0; i < sp.length; i++) {
			
			s1=" "+sp[i]+s1;
			
			
		}
		System.out.println(s1);
		}
		
	}



