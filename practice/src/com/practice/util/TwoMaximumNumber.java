// To find top maximum nubers in a array
package com.practice.util;

public class TwoMaximumNumber {

	public static void main(String[] args) {
		int number[] = {23,45,67,89,28,100,179,57};
		int first = 0;
		int second = 0;
		for(int i=0;i<number.length;i++) {
			if(first  < number[i]) {
				    second = first;
					first = number[i];
			}
			else if(second < number[i]) {
				second = number[i];
			}
			
		}
		System.out.println(first);
		System.out.println(second);
	
	}

}