package com.assignment.util;

import java.util.Scanner;

public class Sumsquare {

	public static void main(String[] args) {
		System.out.println("\tSum of square of first n numbers");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\tn Number : ");
		int n = scanner.nextInt();
		System.out.println("\nOutput:\n\t");
		int s=0,s1=0;
		for(int i=1;i<=n;i++) {
			s +=  i * i;
			s1 = n*(n+1)*(2*n+1) / 6;
			System.out.println(+i+" "+s);
			
		}
		System.out.println("\nSum Of square first n numbers : "+s1);
        scanner.close();
	}

}
