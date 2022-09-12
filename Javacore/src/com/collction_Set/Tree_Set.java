package com.collction_Set;

import java.util.TreeSet;

public class Tree_Set {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> rr=new TreeSet<Integer>();
		
//             it prints in ascending order
			// it will not allow duplicate value	
			// it will not even single null value
		
		rr.add(100);
		rr.add(200);
		rr.add(500);
		rr.add(150);
		rr.add(550);
		rr.add(350);
		//rr.add(null);  can't allow null value
		//rr.add(null);
		
		System.out.println(rr);
		
		for (Integer integer : rr) {
			System.out.println(integer);
			
		}
	}
}
