package com.collction_List;

import java.util.Vector;

public class Vector_list {
	
	public static void main(String[] args) {
		
		Vector<String> gg=new Vector <String>();
		
		gg.add("apple");
		gg.add("mango");
		gg.add("orange");
		
		
		System.out.println(gg);
		
		for (String string : gg) {
			
			System.out.println(string);
			
		}
		
		String string = gg.get(1);
		System.out.println(string);
		
		String remove = gg.remove(2);
		System.out.println(remove);
		
		int size = gg.size();
		System.out.println(size);
		
		
	}

}
