package com.assignment.util;

import java.util.Scanner;

public class Square1 {

	public static void main(String[] args) {
		System.out.println("\tDisplay Value and with their square values");
		System.out.println("\nInput:\n\tEnter a & b Value : ");
		Scanner scanner = new Scanner(System.in);
		int a,b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("\nOutput:\n\t");
		for(int i=a;i<=b;i++) {
			int s = i * i;
			System.out.println(+i+" "+s);
		}
		scanner.close();

	}

}