package com.stringassignment.util;

public class StringExample2 {

	public static void main(String[] args) {
		String s =  "This is a Sample Program";
		String s1 = new String("Ravi");
		System.out.println(s1);
		s1 = "Aarthy";
		System.out.println(s1);
		//method1
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println("Reverse String : "+reverse);
		
		
		// Using StringBuffer class
	    StringBuffer buffer = new StringBuffer(s);
	    System.out.println("Reverse String : "+buffer.reverse());
	    
		//method2
		StringBuilder input = new StringBuilder();
		input.append(s);
		input = input.reverse();
    	System.out.println("\nReverse String : "+input); 

	}

}
