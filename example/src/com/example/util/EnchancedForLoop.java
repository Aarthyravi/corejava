package com.example.util;

public class EnchancedForLoop {

	public static void main(String[] args) {
		System.out.println("Average of given Number");
		System.out.println(average(1,2,4,5,6));
	}
	
	public static int average(int...number) { // ... means we don't know how many numbers
		int total = 0;
		for(int x:number) {
			total += x;
		}
		return total/number.length;
	}
	

}
