package com.quiz.util;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		input.close();
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		if(str.equals(reverse))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
