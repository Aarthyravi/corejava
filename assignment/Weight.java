package com.assignment.util;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double left=0,right=0,l=0,r=0;
		System.out.print("\n\tWeigh Machine");
		do {
			System.out.print("\nEnter left side weight : ");
		    left = scanner.nextDouble();
		    System.out.print("\nEnter right side weight : ");
		    right = scanner.nextDouble();
		    l += left;
	    	r += right;	
	        if(l != r) {
		    	System.out.println("\n\tBoth are not Same Weight");
		    } else {
		    	System.out.println("\n\tBoth are Same Weight");
		    }
		    
		}while(l != r); 

        scanner.close();
	}

}
