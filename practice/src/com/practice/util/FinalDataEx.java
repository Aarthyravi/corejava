package com.practice.util;

public class FinalDataEx {

	public static void main(String[] args) {
		Sum sum = new Sum();
	    for(int i=0;i<5;i++) {
	    	 sum.add();
	    }

	}

}
class Sum{
	private int sum;
	private final int number=10;
	public void add() {
		sum += number;
		System.out.println("Sum of the Numbers : "+sum);
	
	}
	
}