package com.collction_List;

import java.util.ArrayList;

public class Array_List {
	
	
		public static void main(String[] args) {
			
			ArrayList<String> ss=new ArrayList<String>();
			
			ss.add("Stephen");
			ss.add("paul");
			ss.add("mani");
			ss.add("deva");
			ss.add("deva");
			
			System.out.println(ss);
			
		for (String string : ss) {
			System.out.println(string);
		}
				
				int size = ss.size();
				System.out.println(size);
				
//			ss.clear();
//			System.out.println(ss);
			
			String remove = ss.remove(2);
			System.out.println(remove);
			
			String string = ss.get(0);
			System.out.println(string);
			
			
			
		}
	
	
	}

 class integer_arry {
	 
	 public static void main(String[] args) {
		
		ArrayList<Integer> aa=new ArrayList<Integer>();
		
		aa.add(100);
		aa.add(200);
		aa.add(300);
		aa.add(400);
		aa.add(500);
		aa.add(500);
		
		for (int i = aa.size()-1; i>0 ; i--) {
			System.out.println(aa.get(i));

		}
		
		System.out.println(aa);
		
//		for (Integer integer : aa) {
//			System.out.println(integer);
//			
//		}

		Integer integer = aa.get(0);
		System.out.println(integer);
		
		Integer remove = aa.remove(2);
		System.out.println(remove);
		
		int size = aa.size();
		System.out.println(size);
		
			
		}
		
	}
	 
	class Array{
		
		
		public static void main(String[] args) {
			
			
			int n=7;
			
			ArrayList<Integer> ff=new ArrayList<Integer>(n);
			
			for (int i = 0; i <=n; i++) {
				System.out.println(i);
				
				
				
			}
			
			 ff.remove(2);
			System.out.println(ff);
			
			for (int i = 0; i < ff.size(); i++) {
				System.out.println(ff.get(i));
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
	
	

