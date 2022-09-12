package com.String_types;

public class String_vs_buffring {
	
	
public static void main(String[] args) {
		
		String f="suriya";
		String concat = f.concat("Stephen");
		System.out.println(concat.hashCode());
		
		
		
		StringBuffer kk=new StringBuffer("Suriya ");
		
		kk.append("Stephen");
		System.out.println(kk.hashCode());
	}

}
