package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
			String text="We learn java basics as part of java sessions in java week1";
			int count=0;
			String Text1 = text.replace(" ", "");
			
			String finalText="";
			
			char[] charArrayText = Text1.toCharArray();
			for(int i=0; i<Text1.length()-1; i++)
			{
				
				for(int j=i+1; j<=charArrayText.length-1;j++)
				{
					
					
					
					if(charArrayText[i]==charArrayText[j])
					{
						
						count=count+1;
						
					
					if(count>1)
					{
						
						charArrayText[i]=' ';
											
					}
					
					}
				
				}
				
			
			}
			
			for(int i=0; i<charArrayText.length-1; i++)
			{
				
				finalText=finalText+charArrayText[i];	
			}
			
			
			String replace = finalText.replace(" ", "");
			System.out.println(replace);
			
		}

	

	}//Not Sure about the output. Slightly confused


