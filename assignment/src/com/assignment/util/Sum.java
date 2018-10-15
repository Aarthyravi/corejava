package com.assignment.util;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,sum=0,i=0;
		System.out.print("\n\tSum of Integers");
		while(i <5) {
			System.out.print("\nEnter an Integer : ");
			n = scanner.nextInt();
			sum += n;
			System.out.println("\nSum = "+sum);
			i++;
		}
		scanner.close();
	}

}		
