package com.assignment.util;

public class Average {

	public static void main(String[] args) {
		System.out.println("\n\tFind the total marks and average of the student");
		int sub1 = 50; int sub2 = 40; int sub3 = 60; 
		int sub4 = 20; int sub5 = 60; int sub6 = 80;
		double total = sub1+sub2+sub3+sub4+sub5+sub6;
		double avg = total / 6;
		System.out.println("\nOuput : \n\tTotal : "+total+"\n\tAverage :"+avg);

	}

}
