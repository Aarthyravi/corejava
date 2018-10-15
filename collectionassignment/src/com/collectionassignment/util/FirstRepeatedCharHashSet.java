package com.collectionassignment.util;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatedCharHashSet {
	
	public static void main(String[] args) {
		System.out.println("\n\tFirst Repeated Character using Hashset");
		System.out.println("Enter the String : ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
    	System.out.println(RepeatedChar(str));
	}
	private static char RepeatedChar(String str) {
		char[] c = str.toCharArray();
		HashSet<Character>hs = new HashSet<>();
	    for(int i=0;i<=c.length;i++) {
	    	if (hs.contains(c[i])) {
	    		return c[i];
	    	}
	    	else {
	    		hs.add(c[i]);
	    	}
	    }
		return 0;
			
	}
}