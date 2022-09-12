package com.collction_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Seet {
	
	public static void main(String[] args) {
		
		Set<Object> dd=new HashSet<Object>();
		
		dd.add(10);
		dd.add(10);
		dd.add(30);
		dd.add(20);
		dd.add("stephen");
		System.out.println(dd);
		
		Iterator<Object> iterator = dd.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	

	Set<String> se=new LinkedHashSet<String>();
	
	se.add(null);
	se.add("stephen");
	se.add("danny");
	se.add(null);
	System.out.println(se);
	
	Set<Object> df=new TreeSet<Object>();
	
	df.add(100);
	df.add(29);
	df.add(23);
	
	System.out.println(df);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
