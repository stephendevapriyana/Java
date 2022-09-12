package com.collction_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listt {

	public static void main(String[] args) {
		
		List<Integer>sd=new ArrayList<Integer>();
		
		
		sd.add(10);
		sd.add(20);
		sd.add(30);
		sd.add(40);
		sd.add(70);
		sd.add(60);
		sd.add(null);
		sd.add(null);
		sd.add(60);
		System.out.println(sd);
		
		for (int i = 0; i < sd.size(); i++) {
			System.out.println(sd.get(i));
			
		}
		System.out.println("=====================================================");
		
		List<Object> sf=new LinkedList<Object>();
		sf.add(10);
		sf.add("string");
		sf.add(12.2);
		sf.add('m');
		System.out.println(sf);
		for (int i = 0; i <sf.size(); i++) {
			System.out.println(sf.get(i));
			
		}
		
		
		}
		
	}
	

