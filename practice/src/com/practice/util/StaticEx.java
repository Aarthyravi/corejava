package com.practice.util;

public class StaticEx {

	public static void main(String[] args) {
	     CarRace race1 = new CarRace("Sanjay","Kumar");
	     CarRace race2 = new CarRace("Vikram","Desai");
	     CarRace race3 = new CarRace("Kala","vasanth");
	   
	}
	
}
class CarRace{
	String firstname;
	String lastname;
	private static int member = 0;
	public CarRace(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		member++;
		System.out.printf("%d st place in Car Race is %s %s\n",member,firstname,lastname);
		
	}
	
}