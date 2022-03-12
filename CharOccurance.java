package org;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char[] strArray = str.toCharArray();
		int l = str.length();
		int count = 0;
		
		for(int i=0; i<l; i++)
		{
			if(strArray[i]=='e');
			
			count = count+1;
			
			System.out.println("The Occurance of E is"+count);
			
		}

	}

}//The output of the program is wrong. Not sure where the mistake is.
