package com.assignment1.util;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("\n\tBasic Calculator");
		System.out.println("Enter the first number : ");
		int number1 = input1.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = input1.nextInt();
		System.out.println("ouput\n");
		System.out.println("Addition : "+sum(number1,number2));
		System.out.println("Subtraction : "+sub(number1,number2));
		System.out.println("Multiplication : "+mul(number1,number2));
		System.out.println("Division : "+div(number1,number2));
		input1.close();
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
}
