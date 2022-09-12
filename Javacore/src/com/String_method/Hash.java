package com.String_method;

public class Hash {
	
public static void main(String[] args) {
		
		String a="i have come inside ";
		
		int hashCode = a.hashCode();
		
		System.out.println(hashCode);
		
		String concat = a.concat("suriya");
		int hashCode2 = concat.hashCode();
		System.out.println(hashCode2);
		
		

		String substring = concat.substring(0,6);
		int hashCode3 = substring.hashCode();
		System.out.println(hashCode3);

}
} 