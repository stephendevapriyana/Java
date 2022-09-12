package com.For;

public class Loop_project_sir_told {
	
	public static void main(String[] args) {
		
	
	
	
		String abc=" java is very danger";
		
		
		String[] split = abc.split(" ");
		
		for (String string : split) {
			
			System.out.println(string);
			
			for (int i = 0; i < 20; i++) {
				char[]m1=split[i].toCharArray();
				
				for (int j = m1.length-1; j>=0 ; j--) {
					
					System.out.println(m1[j]);
					
				}
				
				System.out.println(" ");
			}
		}
	}
}

//public static void main(String[] args) {
//	
//	
//	
//	String [] abc={" java is very danger"};
//	
//	
//
//		for (int i = 0; i < 20; i++) {
//			char[]m1=abc[i].toCharArray();
//			
//			for (int j = m1.length-1; j>=0 ; j--) {
//				
//				System.out.println(m1[j]);
//				
//			}
//			
//			System.out.println(" ");
//		}
//	}
	

//public static void main(String[] args) {
//	
//	String p="stephen coming form office ";
//	
//	String[] split = p.split("  ");
//	System.out.println(split);
//	
//	
//	for (int i = 0; i < split.length; i++) {
//		
//		char[] kk = split[i].toCharArray();
//		
//		for (int j = kk.length-1; j >0 ; j--) {
//			
//			System.out.println(kk[j]);
//			
//		}
//	
//		
//	}
//
//			
//			
//		
//		
//		
//	
//	
//	
//}

	

