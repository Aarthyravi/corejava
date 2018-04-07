package com.assignment.util;

public class Quadratic2 {

	public static void main(String[] args) {
		System.out.println("\n Excercise3 : Find roots for the equation a*X^2 + b*X + c\n");
		int a = 1;
		int b = 4;
		int c = -21;
		double squareroot = Math.pow(b,2)- 4*a*c;
		System.out.println("Input :\n\ta Value : "+a);
		System.out.println("\tb Value : "+b);
		System.out.println("\tc Value : "+c);
		if (squareroot > 0) {
			double r = (-b + Math.sqrt(squareroot)) / 2*a;
			double r1 = (-b - Math.sqrt(squareroot)) / 2*a;
			System.out.println("Output :\n\tX value : "+r +',' +r1);
		} else if (squareroot < 0) {
			System.out.println("Output :\n\tNo Roots");
		}
			
	}

}
