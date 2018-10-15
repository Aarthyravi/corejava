package com.quiz.util;

import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		str = str.toLowerCase();
		for(char ch='A'; ch<='z'; ch++)
        {
            int count=0;
            for(int i=0; i<str.length(); i++)
            {
                if(str.charAt(i) == ch)
                  count++;
            }
            if(count>0)
              System.out.println(ch+ " - "+ count + " times");
         }

	}

}
