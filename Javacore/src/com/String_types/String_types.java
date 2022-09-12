package com.String_types;



public class String_types {

	public static void main(String[] args) {
		
		
		String_types gg=new String_types();
		String []name= {"Isreal","usa","india"};
		
		gg.joinwords(name);
		
	}

	private void joinwords(String[] name) {
		
		String a=" ";
		
		StringBuffer sd=new StringBuffer();
		
		
		for (String string : name) {
			
		System.out.println("string hashcod"+string.hashCode());
		 
		 sd.append(name);
		 System.out.println("buffer"+name.hashCode());
		 
		 a=a+name; 
		 System.out.println("immutble"+a.hashCode());
//		 this change modifire
		}
	}
	}
