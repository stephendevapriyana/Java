package com.collctoin_map;

import java.util.HashMap;
import java.util.Map;

public class HasMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> sd=new HashMap<Integer,String>();
		
		//can,t allow duplicate key
		//null   duplicate not allow 
		
		//Ascending order 
		
		sd.put(1, "Israel");
		sd.put(2, "usa");
		sd.put(3, "india");
		sd.put(4, "london");
		sd.put(6, "china");
		sd.put(5, "india");
		sd.put(4, "stephen");
		
		sd.put(null, null);
		
		
		
		
		for(Map.Entry dp : sd.entrySet()){
			System.out.println(dp.getKey()+" ");
			System.out.println(dp.getValue()+" ");
			
		
			
		}
		
	}

}
