package com.collectionassignment.util;

import java.util.HashSet;
import java.util.Set;

public class SumOfPair {

	public static void main(String[] args) {
		int a[] = {1,8,3,4,5,6,7,2,9};
		int n = 10;
		pairs(a,n);
		pairsUsingHashSet(a,n);
	}
	static void pairs(int a[], int n) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] + a[j] == n) {
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}	
		
	static void pairsUsingHashSet(int a[], int n) {
		Set<Integer>hs = new HashSet<>();
		System.out.println("\nUsing HashSet");
		for(int i=0;i<a.length;i++) {
			if(hs.contains(a[i])) {
				System.out.println(a[i]+","+(n-a[i]));
			}
			else {
				hs.add(n-a[i]);
			}
			
		}
	}


}
