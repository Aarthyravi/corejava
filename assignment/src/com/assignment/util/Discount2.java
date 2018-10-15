package com.assignment.util;

import java.util.Scanner;

public class Discount2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double noofcookies,noofcakes;
		System.out.print("\n\tDiscount(5%) to purchases of total over $10.00");
		System.out.print("\n\nInput\n\tEnter the Number of Cookies : ");
		noofcookies = scanner.nextDouble();
		System.out.print("\n\nInput\n\tEnter the Number of Cakes : ");
		noofcakes = scanner.nextDouble();
		double total = noofcookies * 0.05 + noofcakes * 0.03;
		if(total >= 10) {
			double discount =  total - (0.05 * total);
			System.out.println("\nOutput :\n\tDiscount Price : "+discount);
		} else {
			System.out.println("\nOutput :\n\tDiscount Price : No discount "+total);
		}
		
		scanner.close();
	}

}
