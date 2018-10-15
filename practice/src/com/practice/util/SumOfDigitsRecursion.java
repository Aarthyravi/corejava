//To find sum of each digit in the given number using recursion.
package com.practice.util;

import java.util.Scanner;

public class SumOfDigitsRecursion {

	public static void main(String[] args) {
		System.out.println("\nEnter The Number :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		SumOfDigits sod = new SumOfDigits();
		System.out.println("Sum of Digits Using Recursion : "+sod.sumofdigits(number));
	}
}
class SumOfDigits{
	int sum=0;
	public int sumofdigits(int num) {
		
		if(num == 0)
			return sum;
		else {
			sum += (num % 10);
			sumofdigits(num/10);
		}
		return sum;
	}

}