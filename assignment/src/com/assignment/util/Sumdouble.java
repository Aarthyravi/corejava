package com.assignment.util;

import java.util.Scanner;

public class Sumdouble {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n,sum=0;
		int i=0;
		System.out.print("\n\tSum of Integers");
		while(i <5) {
			System.out.print("\nEnter an Integer : ");
			n = scanner.nextDouble();
			sum += n;
			System.out.println("\nSum = "+sum);
			i++;
		}
		scanner.close();
	}

}		