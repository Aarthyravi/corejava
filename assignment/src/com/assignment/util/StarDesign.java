package com.assignment.util;

import java.util.Scanner;

public class StarDesign {
	public static void main(String[] args) {
		System.out.println("\tStar design");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\tn Number : ");
		int n = scanner.nextInt();
		System.out.println("\nOutput:\n\t");
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
