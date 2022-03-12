package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
	
		List <Integer> list1 = new ArrayList<Integer>();		
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(17);
		list1.add(16);
		list1.add(18);	
	
Collections.sort(list1);
for(int i=0;i<list1.size(); i++)
{
System.out.println("i value " +"i="+i +" "+ list1.get(i));
}

for(int i=list1.get(0); i<=list1.size(); i++) 
{
	
	if(i+1!=list1.get(i))
	{
	System.out.println("The Missing Number is "+(i+1));
		break;				
	}
	
	

	}
	}



	}

