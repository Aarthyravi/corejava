package com.extra.util;

import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
         Predicate<Integer> predicate = (i) -> i > 20;
         System.out.println(predicate.test(23));
         System.out.println(predicate.test(13));

	}

}