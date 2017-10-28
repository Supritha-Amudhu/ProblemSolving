package com.atech.logicsolving;

public class patternStarDescending
{
	public static void main(String[] args) 
	{
		patternStarDescending stars = new patternStarDescending();
		stars.printPattern();

	}
	public void printPattern()
	{
		for(int i=5;i>0;i--)
		{			
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
