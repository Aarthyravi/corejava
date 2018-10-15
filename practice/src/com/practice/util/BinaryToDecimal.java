package com.practice.util;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		System.out.println("\nEnter The Binary Number :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		int decimal=0;
		int power = 0;
		while(number != 0) {
			int temp = number % 10;
			decimal += temp * Math.pow(2, power);
			number = number/10;
			power++;
		}
        System.out.println("Decimal Number : "+decimal);
	}

}