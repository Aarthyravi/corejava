package com.collection.util;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("Amala");
		list.add("Kala");
		list.add("Bala");
		list.add("Mala");
		System.out.println("Display The Strings Using Iterator");
		
		// Using ListIterator
		ListIterator<String> itr = list.listIterator();   //hasPrevious only available in 'ListIterator', not available in 'Iterator' 
		
		// Following 4 Lines are not working before hasNext(); 
		//System.out.println("\nBackward List\n");
		//while(itr.hasPrevious()) {
		//	System.out.println(itr.previous());
		//}
		System.out.println("\nForward List\n");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nBackward List\n");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		// Using for loop
		System.out.println("\nDisplay The Strings Using For loop\n");
		for(String s:list) {
			System.out.println(s);
		}
		
	}

}