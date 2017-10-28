package com.atech.logicsolving;

public class patternStarAscending 
{
	public static void main(String[] args) 
	{
		patternStarAscending stars = new patternStarAscending();
		stars.printPattern();
	}

	public void printPattern()
	{
		for(int i=1;i<6;i++)
		{			
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}
