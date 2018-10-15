package com.extra.util;

public class FuctionInterface {

	public static void main(String[] args) {
		Sample sample = () -> System.out.println("Hello Functinal Interface");        //  '-> this means' Lambda Expression
        sample.functionA();
        sample = () -> {
        	System.out.println("Funtional Interface must have only one abstract method");
        	System.out.println("End");
        };
        sample.functionA();
	}

}

@FunctionalInterface
interface Sample{
	void functionA();
}