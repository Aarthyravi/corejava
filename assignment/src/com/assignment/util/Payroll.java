package com.assignment.util;

public class Payroll {

	public static void main(String[] args) {
		double hours= 160;
		double rate = 25;
		double salary = hours * rate;
		System.out.println("\n Excercise1: Payroll Program\n");
		System.out.println("Input :\n\tHours Worked : "+hours);
        System.out.println("\tPay/hour : "+rate);
        System.out.println("Ouput :\n\tSalary/Month : "+salary);
	}

}