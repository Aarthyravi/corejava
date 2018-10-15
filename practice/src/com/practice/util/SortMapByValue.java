// to sort a map by value.
package com.practice.util;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<>();
		map.put("Guna", 40);
		map.put("Vani", 34);
		map.put("Rupa", 65);
		map.put("Leena", 23);
		Set<Map.Entry<String,Integer>>set = map.entrySet();
		List<Map.Entry<String,Integer>>list = new ArrayList<Map.Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
			public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
		System.out.println("To sort a map by value\n");
		for(Map.Entry<String,Integer>entry:list) {
			System.out.println("Name : "+entry.getKey()+", Age :"+entry.getValue());
		}
		

	}

}