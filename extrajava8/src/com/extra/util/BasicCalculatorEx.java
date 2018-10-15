package com.extra.util;

public class BasicCalculatorEx {

	public static void main(String[] args) {
		Calculator calculator = (int a, int b)-> a+b;
		int sum = calculator.operation(10, 20);
		System.out.println("Result of Sum :"+sum);
		
		calculator = (int a, int b)-> a-b;
		int sub = calculator.operation(40, 20);
		System.out.println("Result of Subtraction :"+sub);
		
	}

}
@FunctionalInterface
interface Calculator{
	int operation(int a ,int b);
}