package com.quiz.util;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("C:\\Users\\AarthyRavi\\filedata.txt");
		BufferedReader bufferedReader=new BufferedReader(reader);
	    String data;
		while ((data=bufferedReader.readLine())!=null) 
			System.out.println(data);
		reader.close();
		bufferedReader.close();
	}
}
