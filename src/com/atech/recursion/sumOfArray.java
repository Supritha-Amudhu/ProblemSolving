package com.atech.recursion;
import java.util.*;

public class sumOfArray
{
	public static void main(String[] args)
	{
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		sumOfArray sum = new sumOfArray();
		int i = 0;
		System.out.println(sum.findSum(num, i));
	}
	public int findSum(int[] num, int i)
	{
		
		System.out.println(num);
		if(num.length == 1)
		{
			return num[0];
		}
		else
		{
			while(1<9)
			{
				i++;
				return (num[i] + findSum(num, i));
			}
			
		}				
			
		
		
	}

}
