// Reverse a Given Number

package com.practice.util;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = input.nextInt();
		input.close();
        int reverse = 0;
        while(number !=0) {
        	reverse = (reverse*10)+(number % 10);
        	number = number/10;
        }	
        System.out.println("Reverse a Given Number : "+reverse);
	}

}