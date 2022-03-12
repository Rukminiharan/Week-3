package org;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "pots";
		
		if (text1.length()==text2.length())
			
		{
			
		System.out.println("The Length of the Strings are same");
			
		char[] text1Char = text1.toCharArray();
		char[] text2Char = text2.toCharArray();
		
		Arrays.sort(text1Char);
		Arrays.sort(text2Char);
		
		//can I not store the sorted array in a variable and print the vaulue of the sorted array?
		
		for(int i = 0; i<text1.length()-1; i++)
		
		// for (int j = 0; j<text2.length()-1; j++);
		{
			
		if(text1Char[i]==text2Char[i]);
		
		{
			System.out.println("Text 1 " +text1Char[i]);
			System.out.println("Text 2 " +text2Char[i]);
			
		}
			
		}
		

	}
		
		else 
			
		{
			System.out.println("The Length are Different");
		}

}
}
