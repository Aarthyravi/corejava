package com.assignment.util;

import java.util.Scanner;

public class Discount1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double price;
		System.out.print("\n\tDiscount(5%) to purchases over $10.00");
		System.out.print("\n\nInput\n\tEnter the Item Price : ");
		price = scanner.nextDouble();
		if(price >= 10) {
			double discount =  price - (0.05 * price);
			System.out.println("\nOutput :\n\tDiscount Price : "+discount);
		} else {
			System.out.println("\nOutput :\n\tDiscount Price : No discount");
		}
		
		scanner.close();
	}

}
