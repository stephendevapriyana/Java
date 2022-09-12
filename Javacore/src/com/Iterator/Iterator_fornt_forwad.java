package com.Iterator;

import java.util.Iterator;
import java.util.LinkedList;



public class Iterator_fornt_forwad {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> jj=new LinkedList<Integer>();
		
		jj.add(10);
		jj.add(20);
		jj.add(30);
		jj.add(40);
		
		
		
		
		jj.add(50);
		
		Iterator sd=jj.iterator();
		while (sd.hasNext()) {
			System.out.println(sd.next()+" ");
			
		}
			
			
		
		
	}

}
