package com.atech.logicsolving;

public class patternNumbersAscending
{
	public static void main(String[] args)
	{
		patternNumbersAscending pattern = new patternNumbersAscending();
		pattern.print();

	}
	public void print()
	{
		for(int i=2;i<7;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

}
