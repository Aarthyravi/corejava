package com.stringassignment.util;

import java.util.Scanner;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		System.out.println("\n\tFirst Repeated Character");
		System.out.println("Enter the String : ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toLowerCase();
		input.close();
		for(int i=0;i<=str.length()-1;i++) {
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println("\nFirst Repeated Character : "+str.charAt(i));
					return;
				}
			 }
		}
	}
}
