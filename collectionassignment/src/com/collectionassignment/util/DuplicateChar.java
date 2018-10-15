package com.collectionassignment.util;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		System.out.println("\n\tDuplicate Character in a String");
		System.out.println("Enter the String : ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		input.close();
		for(int i=0;i<= str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
					
				}
			}
			
		}

	}

}