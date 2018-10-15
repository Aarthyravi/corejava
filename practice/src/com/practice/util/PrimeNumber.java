//to check the given number is a prime number or not?
package com.practice.util;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("\nEnter The Number :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		for(int i=2;i<number/2;i++) {
			if(number % i == 0) {
				System.out.println("It is not a prime Number");
				return;
			}
		}
		System.out.println("It is a prime Number");

	}

}