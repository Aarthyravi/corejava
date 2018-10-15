package com.quiz.util;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(56);
		al.add(39);
		al.add(23);
		al.add(98);
		Collections.sort(al);
		for(Integer sort: al)
			System.out.println(sort);
	}
}
