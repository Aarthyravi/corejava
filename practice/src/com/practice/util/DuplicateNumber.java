// Find out Duplicate Number between 1 to N numbers.
package com.practice.util;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 'N' Number : ");
		int number = input.nextInt();
		System.out.println("Enter the Number : ");
        int number1 = input.nextInt();
        input.close();
       	if(number>=number1) {
       		for(int i=0;i<number;i++) {
       			if(i == number1) {
       				System.out.println("Duplicate Number is :"+number1);
       				return;
        	     }
        	 }
       	}else{
        	System.out.println("Out of Range");
        }
	}

}