package com.practice.util;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("\nEnter The Decimal Number :");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		int binary[] = new int[20];
		int index=0;
		while(number > 0) {
			binary[index++] = number%2;
			number = number/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
        
	}

}