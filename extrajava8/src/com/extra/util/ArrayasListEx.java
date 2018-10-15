package com.extra.util;

import java.util.Arrays;
import java.util.List;

public class ArrayasListEx {

	public static void main(String[] args) {
		
		//Method1
		String str[] = new String[] {"Aarthy","Ravi","Jai","Yogu"};
		List<String> names = Arrays.asList(str);
		System.out.println("Names : "+names);
		for(String s:names) {
			System.out.println(s);
		}
		
		//Method2
		List<String> names1 = Arrays.asList("Hello","World");
		System.out.println("Names : "+names1);
		for(String s:names1) {
			System.out.println(s);
		}
	}

}