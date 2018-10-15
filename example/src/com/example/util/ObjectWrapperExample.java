package com.example.util;

public class ObjectWrapperExample {

	public static void main(String[] args) {
		final int data = 23; // static int data = 23; can assign only outside of the 'static void main' class. Inside of the static main class we must use 'final' keyword  
		Integer data1 = new Integer(34);
		
		Integer data2 = 56; //auto-boxing -primitive data type to object conversion without using new
		int data3 = data2; //auto-unboxing- object to primitive data type conversion
		
		System.out.println("data : "+data);
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		System.out.println("data3 : "+data3);

	}
	public static int getInt(double data4) {
		return (int)data4; // convert double data into int data --->casting format
	}

}
