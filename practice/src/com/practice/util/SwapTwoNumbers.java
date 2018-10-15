//To swap two numbers without using temporary variable
package com.practice.util;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		System.out.println("\nEnter the first number :");
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		System.out.println("\nEnter the second number :");
		int number2 = input.nextInt();
		input.close();
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println("After swaping :");
		System.out.println("\nThe first number :"+number1);
		System.out.println("\nThe second number :"+number2);
		

	}

}