package com.stringassignment.util;

public class StringExample {

	public static void main(String[] args) {
		String s =  "This is a Sample Program";
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--) {
			reverse = reverse + s.charAt(i);  
		}
		System.out.println(reverse);
	}
}