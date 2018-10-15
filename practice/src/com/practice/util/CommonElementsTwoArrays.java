// To find common elements between two arrays.
package com.practice.util;

public class CommonElementsTwoArrays {

	public static void main(String[] args) {
		int firstarray[] = {45,67,04,123,89,23,25};
		int secondarray[] = {45,190,67,345,64,04};
		for(int i=0;i<firstarray.length;i++) {
			for(int j=0;j<secondarray.length;j++) {
				if(firstarray[i]==secondarray[j]) {
					System.out.println(firstarray[i]);
				}
			}
		}
		

	}

}