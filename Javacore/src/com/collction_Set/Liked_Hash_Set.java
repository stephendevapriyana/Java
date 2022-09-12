package com.collction_Set;

import java.util.LinkedHashSet;

public class Liked_Hash_Set {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> rr=new LinkedHashSet<Integer>();
		
		
		//  it prints in insertion order
		// it will not allow duplicate value	
		// it will allow single null value,not a duplicate null value 	
			
		rr.add(100);
		rr.add(200);
		rr.add(500);
		rr.add(150);
		rr.add(550);
		rr.add(350);
		rr.add(null); 
		rr.add(null);
		
		System.out.println(rr);
		
		for (Integer integer : rr) {
			System.out.println(integer);
			
		}
		
		boolean contains = rr.contains(20);
		System.out.println(contains);
		
	}

}
