package com.atech.trial1;
import java.util.Arrays;

public class SmallExamples
{
	
	public static void main(String[] args)
	{
		int[] number = new int[6];
		number[0] = 23;
		number[1] = 6;
		number[2] = 47;
		number[3] = 35;
		number[4] = 2;
		number[5] = 14;
		Integer x = new Integer(5);
		System.out.println(x);
		
		int j =0;
		while(j<6)
		{
			System.out.println(number[j]);
			j++;			
		}
		Arrays.sort(number);
		int highest = number.length-1;
		System.out.println("The highest number is : " +number[highest]);
		int average =0, sum =0;
		for(int i=0; i<5; i++)
		{
			sum = sum + number[i];
		}
		average = sum/(number.length); 
		System.out.println("The average is : "+average);
		
	}
	

}
