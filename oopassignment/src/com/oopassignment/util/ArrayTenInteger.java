package com.oopassignment.util;

public class ArrayTenInteger {

	public static void main(String[] args) {
		System.out.println("Arrary with 10 integers and print all the elements with its index number");
		int number[] = {21,62,73,84,56,67,73,86,99,10};
		System.out.println("\nIndex  Number");
		for(int x=0;x<number.length;x++) {
			System.out.println(x+"\t"+number[x]);
		}
	}

}
