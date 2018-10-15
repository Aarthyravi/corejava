package com.assignment.util;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double price;
		System.out.print("\n\tDiscount(5%)\n");
		System.out.print("\nInput\n\tEnter the Item Price : ");
		price = scanner.nextDouble();
		double discount =  price - (0.05 * price);
		System.out.println("\nOutput :\n\tDiscount Price : "+discount);
		scanner.close();
	}

}