package com.extra.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		
		//  List the number 0 to 10
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		
		// Method 1: Find even Numbers in an Arraylist
		for(int number:list) {
			if(number%2 == 0) {
				System.out.println(number);
			}
		}
		
       // Method 2: Find even Numbers in an Arraylist using 'Streams'
	   List<Integer>collect = list.stream()
			                  .filter(i -> i%2 == 0)
			                  .collect(Collectors.toList());
	   System.out.println("Find an Even numbers using Streams : "+collect);
	}

}