package com.String_method;

public class String_method {
	
	public static void main(String[] args) {
		
		String u=" we doing to work us job in office  ";
		
		int length = u.length();
		System.out.println(length);
		
		boolean equals = u.equals("in the beginning god created the heaven and the earth");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = u.equalsIgnoreCase("in the beginning god created the heaven and the earth");
		System.out.println(equalsIgnoreCase);
		
		String upperCase = u.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = u.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = u.startsWith("in");
		System.out.println(startsWith);
		
		boolean endsWith = u.endsWith("in");
		System.out.println(endsWith);
		
		boolean contains = u.contains("that");
		System.out.println(contains);
		
		int indexOf = u.indexOf(" beginning");
		System.out.println(indexOf);
		
		int lastIndexOf = u.lastIndexOf(" in");
		System.out.println(lastIndexOf);
		
		char charAt = u.charAt(33);
		System.out.println(charAt);
		
		String substring = u.substring(0,8);
		System.out.println(substring);
		
		String replace = u.replace("we","they");
		System.out.println(replace);

		boolean empty = u.isEmpty();
		System.out.println(empty);
		
		String trim = u.trim();
		System.out.println(trim);
		
		String concat = u.concat("new tach");
		System.out.println(concat);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
