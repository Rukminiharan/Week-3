package org;

public class Palindrome {

	public static void main(String[] args) {
		
		String value ="sir";
		String rev="";
		char[] value1 = value.toCharArray();
		for (int i=value1.length-1; i>=0; i--)//Eg. In Madam the length of the string is 5. We are
			//checking the index position of the string which is 4, hence value1.length-1. It is 
			//checking from reserver.
		{
			
			rev=rev + value1[i];//initially rev is null and when the value1[i] is given it will first
			//take m. in the next iteration it will be ma and so on it will be madam

	}
		if(value.equals(rev))
		{
			System.out.println(value+ " is Palindrome");
		}
		
		else
		{
			System.out.println(value+ " is not Palindrome");
		}
		

	}


}

