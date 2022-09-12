package com.collction_List;

import java.util.LinkedList;

public class Linked_list {
	
	public static void main(String[] args) {
		
		LinkedList<String> bb=new LinkedList<String>();
		
		bb.add("Israel");
		bb.add("usa");
		bb.add("india");
		
		System.out.println(bb);
		
		for (String string : bb) {
			System.out.println(string);
			
		}
		
		boolean containsAll = bb.contains("usa");
		System.out.println(containsAll);
		
		String removeFirst = bb.removeFirst();
		System.out.println(removeFirst);
		
		String removeLast = bb.removeLast();
		System.out.println(removeLast);
		
		String remove = bb.remove();
		System.out.println(remove);
	}

}
