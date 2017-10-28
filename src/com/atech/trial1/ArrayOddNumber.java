package com.atech.trial1;

import java.util.Random;

public class ArrayOddNumber
{

	public static void main(String[] args)
	{
		int[] Array = new int[10];
		Random rand = new Random();
		int[] oddArray = new int[10];
		int count=0;
		for(int i=0; i<9; i++)
		{
			Array[i]= rand.nextInt(10);
			System.out.println("Number " +(i+1)+ " is : " +Array[i]);
			
			if((Array[i]%2) != 0)
			{
				oddArray[count] = Array[i];
				count++;
			}
			
		}
				
		for(int j=0; j<=count; j++)
		{
			System.out.println("Odd Number : " +oddArray[j]);
		}
		

	}

}
