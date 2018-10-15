package com.practice.util;

import java.util.Scanner;

public class PerfectNoEx {

	public static void main(String[] args) {
		System.out.println("\nEnter the no. :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int temp=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i == 0) {
				temp += i;
			}
		}
		if(temp == number) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not Perfect Number");
		}
		input.close();
	}

}