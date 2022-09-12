package com.Constructor;

public class Stephen {
	
	public Stephen () {
		
	System.out.println("i am stephen");
		
		
	}
	
	public Stephen (long a) {
		
		System.out.println("my age "+a);
		
	}

	public Stephen(String b,int c) {
		
		System.out.println("my collage name "+b+c+" pin no");
	}

	public void aa() {
		System.out.println("ss");
	}

	public static void main(String[] args) {
		
	
    	Stephen a= new Stephen ();
    	a.aa();
		Stephen l=new Stephen(24);
		Stephen ll=new Stephen(888);
		Stephen b=new Stephen("Bharath University",603210);
		
		
		
	}
}
