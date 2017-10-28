package com.atech.trial1;

import java.util.Random;

public class RandomNumber1 
{

	
	public static void main(String[] args)
	{
		int a=0, b=0, count=0;
		Random rand = new Random();
		while((a+b)!=7)
		{
			a = rand.nextInt(6);
			b = rand.nextInt(6);
			count++;
		}
			if ((a+b) == 7)
			{
				System.out.println("The result is 7 after " +count+ " times");
			}
		}
	}


