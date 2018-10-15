package com.oopassignment.util;

public class ThousandNumbers {

	public static void main(String[] args) {
		System.out.println("Generate 1000 Numbers");
		for(int i=0;i<=1000;i++) {
			System.out.print(i+",");
		}
		System.out.println("\n\nGenerate multiple of 5 and less than 1000");
		for(int i=0;i<=1000;i++) {
			if(i%5 == 0) {
				System.out.print(i+",");
			}   
		}
		System.out.println("\n\nGenerate odd numbers up to 1000");
		for(int i=0;i<=1000;i++) {
			if(i%2 != 0) {
				System.out.print(i+",");
			}   
		}
	}

}
