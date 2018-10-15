package com.assignment.util;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("\tFactorial of n numbers");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\tn Number : ");
		int n = scanner.nextInt();
		int f = 1;
		for(int i=1;i<=n;i++) {
			f = f * i;
		}
		System.out.println("\nOutput : "+f);
		scanner.close();
	}

}