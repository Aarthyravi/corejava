package com.quiz.util;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		input.close();
		String reverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		System.out.println("Reverse the Given String : "+reverse);
	}

}
