package com.collctoin_map;

import java.util.Map;
import java.util.TreeMap;

public class Trree_map {

	
	public static void main(String[] args) {
		
		//can,t allow duplicate key
				//null not allow 
		//// Ascending order 
		
		TreeMap <Integer,String>pp=new TreeMap<Integer,String>();
		
		pp.put(1, "Israel");
		pp.put(2, "usa");
		pp.put(3, "india");
		pp.put(4, "london");
		pp.put(6, "china");
		pp.put(5, "india");
		pp.put(4, "stephen");
		
		for(Map.Entry dd : pp.entrySet()) {
			System.out.println(dd.getKey()+"  ");
			System.out.println(dd.getValue());
		}
		
		
		
		
	}
}
