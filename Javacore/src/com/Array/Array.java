package com.Array;

public class Array {
	
	public static void main(String[] args) {
		
//		int[]a= {10,20,30};
		
		int a[]=new int[7];
		
		a[0]=10;
		a[1]=20;
		a[2]=30	;	
		a[3]=40;		
		a[4]=50;
		a[5]=60;
		a[6]=70;
		
//		System.out.println(a[1]); this only one value call 
				
			for (int i = 0; i < a.length; i++) { 		//front		
//				   
				System.out.println(a[i]);  				
			}	
			
			System.out.println("=====================");
			
			for (int i = a.length-1; i>=0; i--) {  //back
//				     
				System.out.println(a[i]);
				
				
			}
			System.out.println("=================");
			for (int i : a) {                              //String front only
				
				System.out.println(i);
				
			}	
	}
	
	

}


//public static void main(String[] args) {
//	
//	int[]qq= {13,23,35,46,56};
//	
//	for (int i=qq.length-1; i >=0; i--) {
//		System.out.println(qq[i]);
//		
//	
//		
//	}
//	for (int o = 0; o < qq.length; o++) {
//		
//		System.out.println(qq[o]);
//}
	

























