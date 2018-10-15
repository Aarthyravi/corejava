package com.assignment.util;

public class Average3 {

	public static void main(String[] args) {
		int sub1 = 50; int sub2 = 40; int sub3 = 60; 
		int sub4 = 20; int sub5 = 60; int sub6 = 80;
		for(int i=1;i<4;i++) {
			double total = sub1+sub2+sub3+sub4+sub5+sub6;
			double avg = total / 6;
			System.out.println("\n\tStudent"+i);
			System.out.println("Total Marks :"+total);
			System.out.println("Average :"+avg);
			sub1 += 10; sub2 += 10; sub3 += 10;
			sub4 += 10; sub5 += 20; sub6 += 20;
	   }

	}

}