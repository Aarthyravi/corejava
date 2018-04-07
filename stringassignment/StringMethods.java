package com.stringassignment.util;

public class StringMethods {

	public static void main(String[] args) {
		String str = "This is a String Operation";
		String str1 = "  hey ";
		String str2 = new String("This is a String Operation");
		char ch[] = str2.toCharArray(); // will produces array of chars from chars of string object
		System.out.println("\n\t(Given String) This is a String Operation");
        System.out.println("\nChatAt (3) : "+str.charAt(2));
        System.out.println("\nLength  : "+str.length());
        System.out.println("\nConcatenation : "+str.concat(" Concatenation"));
        System.out.println("\nReplace(T to t) : "+str.replace("T","t"));
        System.out.println("\nSubstring(17 to 26) : "+str.substring(17,26));
        System.out.println("\nLowercase : "+str.toLowerCase());
        System.out.println("\nUppercase : "+str.toUpperCase());
        System.out.println("\nTrim : "+str1.trim());
        System.out.print("\ntoCharArray() : ");
        for(char c:ch) {
        	System.out.print(c);
        }
        System.out.println("\n\nContains(String) : "+str.contains("String"));
	}
}
