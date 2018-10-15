package com.oopassignment.util;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c=1;
		System.out.println("\n\tFibonacci Series\n\t");
		System.out.println("Enter the no of series : ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("\nOuput\n\t");
		if(n == 1 || n == 0 ) {
			System.out.println(a);
		}
		else if(n == 2) {
			System.out.println(a);
			System.out.println(b);
	    }
		else {
			System.out.println(a);
			System.out.println(b);
			for(int i=2;i<n;i++) {
				c = a + b;
				a = b;
				b = c;
			    System.out.println(c);
				
		}
	  }		
		input.close();
	}

}