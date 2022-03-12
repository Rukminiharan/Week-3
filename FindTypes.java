package org;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] arrValue = test.toCharArray();
		int  letter = 0, space = 0, number = 0, specialChar = 0;
		
		for(int i=0; i<arrValue.length; i++)
		{
			if(Character.isLetter(arrValue[i])) {
                letter++;
                
            }
			
			else if(Character.isDigit(arrValue[i]))
						
			{
				number++;
				
            }	
			
			else if(Character.isWhitespace(arrValue[i]))
			{
				space++;	
			}
			
			else
			{
				specialChar++;
			}
			
		}
		
	System.out.println("No of Alphabets - "+letter);
	System.out.println("No of Digits - "+number);
	System.out.println("No of White Spaces - "+space);
	System.out.println("No of Special Character - "+specialChar);
	
		
		
		
		
		

	}
}
