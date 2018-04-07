package com.assignment1.util;

import java.util.Scanner;

public class MethodsBoolean {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("\nEnter the input : ");
		String s = input1.nextLine();
		System.out.println("\nGiven String is an Integer or not");
		System.out.println(IsInteger(s));
		System.out.println("\nGiven String is an Odd Number or not");
		System.out.println(IsOddNumber(s));
		System.out.println("\nGiven String is an Even Number or not");
		System.out.println(IsEvenNumber(s));
		System.out.println("\nGiven String is Prime Number or not");
		System.out.println(IsPrimeNumber(s));
		input1.close();
	}
	public static boolean IsInteger( String str ) { 
	    try { //Try to make the input into an integer
	        Integer.parseInt( str );
	        return true; //Return true if it works
	    }
	    catch( Exception e ) { 
	        return false; //If it doesn't work return false
	    }
	} 
	public static boolean IsOddNumber(String str) {
		try { //Try to make the input into an integer
	        int i = Integer.parseInt( str );
	        if(i % 2 != 0)
	        	return true; //Return true if it works
	    }
	    catch( Exception e ) { 
	        return false; //If it doesn't work return false
	    }
		return false;
		
	}
	public static boolean IsEvenNumber(String str) {
		try { //Try to make the input into an integer
	        int i = Integer.parseInt( str );
	        if(i % 2 == 0) 
	        	return true; //Return true if it works
	    }
	    catch( Exception e ) { 
	        return false; //If it doesn't work return false
	    }
		return false;
		
	}
	public static boolean IsPrimeNumber(String str) {
		try { //Try to make the input into an integer
	        int n = Integer.parseInt( str );
	        if (n <= 1)
	            return false;
	      
	        // Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	      
	       }
	    catch( Exception e ) { 
	        return false; //If it doesn't work return false
	    }
		
		return true;
	}
	
}
