package com.collctoin_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Liked_hash_map {
	
	public static void main(String[] args) {
		
		// //can,t allow duplicate key
		//null   duplicate not allow 
		// Insertion
		
		LinkedHashMap<Integer,String> zz=new LinkedHashMap<Integer,String>();
		
		zz.put(1, "Israel");
		zz.put(2, "usa");
		zz.put(3, "india");
		zz.put(4, "london");
		zz.put(6, "china");
		zz.put(5, "india");
		zz.put(4, "stephen");
		zz.put(7, null);
		
		for(Map.Entry gg:zz.entrySet()) {
			System.out.println(gg.getKey());
			System.out.println(gg.getValue());
		}
			
		
	}

}
