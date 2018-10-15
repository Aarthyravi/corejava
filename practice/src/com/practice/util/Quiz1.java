package com.practice.util;

public class Quiz1 {

	public static void main(String[] args) {
		String keyName = "Empid";
		String valueName = "EmpName";
		String[] keys = {"1","2","3"};
		String[] values = {"Ram","Raju","Vijay"};
		generateOutput(keyName, valueName, keys, values);
	}
	
    public static void generateOutput(String keyName, String valueName, String[] keys, String[] values) {
		for(int i=0;i<keys.length;i++)
			for(int j=i;j<values.length;j++) {
				System.out.println(keyName+":"+keys[i]+" and "+valueName	+":"+values[j]);
			    break;	}    
	}
}
		

		

	


