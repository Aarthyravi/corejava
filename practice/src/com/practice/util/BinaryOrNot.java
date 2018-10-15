package com.practice.util;

import java.util.Scanner;
import static java.lang.System.out;

public class BinaryOrNot {

	public static void main(String[] args) {
		out.println("\nEnter The Binary Number :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		while(number != 0) {
			if(number%10 > 1) {
				out.println("Given number is not binary");
				return;
			}
			else {
				number = number/10;
			}
		}
		out.println("Given number is binary");
	}

}