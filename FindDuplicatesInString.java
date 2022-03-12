package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindDuplicatesInString {

	public static void main(String[] args) {
		
			
			List <String> list = new ArrayList<String>();
			list.add("Adam");
			list.add("Ben");
			list.add("Zara");
			list.add("Adam");
			list.add("Charlie");
			list.add("James");
			list.add("Ben");
			
			Collections.sort(list);
			for(int i=0;i<list.size(); i++)
			{
		System.out.println( list.get(i));
		
				
		}
			
			System.out.println(list.size());
			
			
			
			for(int i=0; i<list.size()-1;i++)
			{
				
				for(int j=i+1; j<=list.size()-1; j++)
				{
				
				if(list.get(i)==(list.get(j)))
				{
					
					System.out.println("The Duplicate names are  "+list.get(i));
					
									
				}
				
				}
				
					
				
			}
			
			
			
			
			
			}	
		

	}


