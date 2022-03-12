package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargeInList {

	public static void main(String[] args) {

			
			List <Integer> listToFindSecondLarge = new ArrayList<Integer>();		
			listToFindSecondLarge.add(20);
			listToFindSecondLarge.add(2);
			listToFindSecondLarge.add(11);
			listToFindSecondLarge.add(14);
			listToFindSecondLarge.add(6);
			listToFindSecondLarge.add(17);
			
			
			
	Collections.sort(listToFindSecondLarge);

	int sec= listToFindSecondLarge.size()-2;
	
	for(int i=0;i<listToFindSecondLarge.size(); i++)
	{
System.out.println(listToFindSecondLarge.get(i));

		
}

	System.out.println("The Second Loargest number is "+listToFindSecondLarge.get(sec));
}
		


	}


