package com.atech.logicsolving;

public class patternNumbersDescending 
{
	public static void main(String[] args) 
	{
		patternNumbersDescending pattern = new patternNumbersDescending();
		pattern.print();
	}
	public void print()
	{
		for(int i=6;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

}
