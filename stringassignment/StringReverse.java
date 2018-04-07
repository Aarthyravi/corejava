package com.stringassignment.util;

public class StringReverse {

	public static void main(String[] args) {
		String str = "This is a String Operation";
		System.out.println("\n\tReversed String");
		String reverse = " ";
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);  
		}
		System.out.println("\nGiven String : "+str);
		System.out.println("\nReversed String : "+reverse);
		System.out.println("\n\tReverse Every word in a given String");
		String w[] = str.split(" ");
		String r1 = "";
		for(int i=0;i<w.length;i++) {
			String word = w[i];
			String r = "";
			for(int j=word.length()-1;j>=0;j--) {
				r = r + word.charAt(j);  
			}
			r1 = r1 + r + " ";
		}
		
		System.out.println("\nReversed String : "+r1);
	}

}
