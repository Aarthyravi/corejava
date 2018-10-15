package com.extra.util;

import java.util.function.Function;


public class FunctionInterfaceEx {

	public static void main(String[] args) {
		Function<String,Integer> function = (st) -> st.length();
        System.out.println(function.apply("Hello World"));
        System.out.println(function.apply("I am a String"));
	}

}