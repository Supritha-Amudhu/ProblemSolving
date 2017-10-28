package com.atech.logicsolving;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class lineSplit
{

	public static void main(String[] args) throws IOException
	{
		ArrayList<String> list = new ArrayList<String>();
		String line;
		int lineCount=0, additionalCount=0, used=0;
		int availableLines = 0;
		Scanner scan = new Scanner(System.in);
		lineSplit lineObject = new lineSplit();		
		BufferedReader br = null;
		try
		{			
			br = new BufferedReader(new FileReader("E:\\Supritha\\Dream, Determined\\hp.txt"));
			while((line = br.readLine())!=null)
			{
				list.add(line);
			}		
			availableLines = list.size();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("The file you mentioned is not available.");
		}
		catch(IOException io){
			System.out.println("IO Exception caught");
		}
		finally
		{
			br.close();
		}
		int choice = 0;		
		while(choice!=3)
		{
			System.out.println("These are a few options that you can do : ");
			System.out.println("1. Display lines from the beginning");
			System.out.println("2. Add more lines");
			System.out.println("3. Exit");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("Used count is : " +used);
					System.out.println("Enter the number of lines that you want to display : ");
					lineCount = scan.nextInt();
					used=lineCount;
					if(lineCount<=availableLines)
					{
						lineObject.displayLines(lineCount, list);
					}
					else
					{
						System.out.println("The number of lines you requested for is more than what is available.");
						System.out.println();
					}		
					break;
				}
			case 2:
				{
					System.out.println("Used count is : " +used);
					System.out.println("Enter the additional lines that you want to display : ");
					additionalCount = scan.nextInt();
					if((additionalCount+used)<=availableLines)
					{
						lineObject.displayLines(additionalCount, used, availableLines, list);
						used=used+additionalCount;
					}					
					else
					{
						System.out.println("The number of lines you requested for is more than what is available.");
						System.out.println();
					}	
					
					break;
				}
			case 3:
			{
				System.out.println("Exiting.");
				break;
			}
			default:
			{
				System.out.println("Please enter a number from the given choice.");
				System.out.println();
				break;
			}
			
			}
		}

	}
public void displayLines(int lineCount, ArrayList<String> list)
{
	Iterator<String> itr = list.iterator();
	int loopcount=1;
	while(itr.hasNext() && loopcount<=lineCount )
	{
		String str = (String) itr.next();
		System.out.println(str);
		loopcount++;		
	}
	System.out.println();
}

public void displayLines(int additionalCount, int used, int availableLines, ArrayList<String> list)
{
	System.out.println("The used count is : " +used);
	Iterator<String> itr = list.iterator();
	String[] str = new String[availableLines];
	int i=0;
	while(itr.hasNext())
	{
		str[i] = (String) itr.next();
		i++;
	}
	for(int j=(used);j<=(used+additionalCount-1);j++)
	{
		System.out.println(str[j]);
	}
	System.out.println();
}

}
