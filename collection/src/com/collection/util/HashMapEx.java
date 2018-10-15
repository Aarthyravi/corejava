package com.collection.util;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String,Integer>hm = new HashMap<>();
		hm.put("Ravi",41);
		hm.put("Aarthy",36);
		hm.put("Jai",12);
		hm.put("yog",9);
		for(Map.Entry<String, Integer> map:hm.entrySet()) {
			System.out.println("Name : "+map.getKey()+", Age :"+map.getValue());
			
		}

	}

}