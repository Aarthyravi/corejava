package com.example.util;

public class InterfaceEx {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	    System.out.println("Interface data : "+A.data);
	    System.out.println("Interface data : "+C.data1);
	    b.run();
	}
}

interface A {
	int data = 12; //public final static int data = 12;(fixed data) 
    void display();  // public abstract void display(); 
    default void run() {
    	System.out.println("Hey");
    }
}

interface C{
	int data1 = 24;
}

class B implements A, C{                  // Multiple interface inheritance

	@Override
	public void display() {
		System.out.println("Inside child class");
	}
	
}
