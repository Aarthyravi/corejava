package com.collection.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		//HastSet
		HashSet<String> hs = new HashSet<>();           // Display the Strings depends computer memory order
		hs.add("Ravi");
		hs.add("Yog");
		hs.add("Aarthy");
		hs.add("Jai");
		System.out.println("Display the String Using HashSet\n"); 
		//Using Iterator
		Iterator<String>itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//LinkedHastSet
		LinkedHashSet<String> lhs = new LinkedHashSet<>();           // Display the Strings depends user input order
		lhs.add("Ravi");
		lhs.add("Yog");
		lhs.add("Aarthy");
		lhs.add("Jai");
		System.out.println("\nDisplay the String Using LinkedHashSet\n"); 
		//Using Iterator
		Iterator<String>itr1 = lhs.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//TreeSet
		TreeSet<String> ts = new TreeSet<>();           // Display the Strings Sorted order
		ts.add("Ravi");
		ts.add("Yog");
		ts.add("Aarthy");
		ts.add("Jai");
		System.out.println("\nDisplay the String Using TreeSet\n"); 
		//Using Iterator
		Iterator<String>itr2 = ts.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}