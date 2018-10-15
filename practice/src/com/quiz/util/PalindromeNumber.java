package com.quiz.util;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int reverse;
		int sum=0;
		int temp;    
		System.out.println("Enter the Number : ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		temp=number;    
		while(number>0) 
		{ 
		  reverse = number % 10;  
		  sum = (sum * 10) + reverse;    
		   number = number / 10;    
		}    
		  if(temp == sum)    
		   System.out.println("Palindrome");    
		  else    
		   System.out.println("Not Palindrome");    
		}  
	}


