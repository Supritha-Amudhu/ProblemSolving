package com.atech.logicsolving;
import java.util.*;
import java.util.Map.Entry;

public class alphabetRepetition
{
	
	public static void main(String[] args) 
	{
		try
		{			
			Scanner scan = new Scanner(System.in);
			Map input = new HashMap<String, Integer>();		
			System.out.println("Enter a string : ");
			String word = scan.nextLine();				
			for(int i=0;i<word.length();i++)
			{
				int count1=1;
				String loop = "" +word.charAt(i);
				//System.out.println("L : " +loop.toLowerCase());
				if(input.containsKey(loop.toLowerCase()))
				{					
					int temp =  (int) input.get(loop.toLowerCase());
					count1 = temp;
					count1++;
					input.put(loop.toLowerCase(), count1);
									
				}
				else
				{
					input.put(loop.toLowerCase(), count1);
				}			
				
			}
			Set set = input.entrySet();
			Iterator itr = set.iterator();
			while(itr.hasNext())
			{
				Map.Entry m = (Map.Entry) itr.next();
				System.out.print("Alphabet : " +m.getKey() + "\t");
				System.out.println("Count of occurance : " +m.getValue());
			}
			
		}
		catch(NullPointerException ex)
		{
			System.out.println("There is a null pointer exception.");
		}
		catch(ClassCastException ex)
		{
			System.out.println("Class Cast exception caught");
			ex.printStackTrace();
		}
	}

}
