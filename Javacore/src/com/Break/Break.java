package com.Break;

public class Break {

	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			
			if (i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("============");
	for (int i = 0; i <10; i++) {
		
		if (i==5) {
			continue;
		}
		System.out.println(i);
		
	}
	
	
	}
	
}

//public static void main(String[] args) {
//	
//	int i =0;
//	
//	do {
//		i++;
//		if (i==5) {
//		break;	
//		}
//		System.out.println(i);
//	} while (i<10);
//}