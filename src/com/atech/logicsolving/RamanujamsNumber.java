package com.atech.logicsolving;
import java.util.*;

public class RamanujamsNumber 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a =0,b=0, sum=0;
		try
		{
			System.out.println("Enter a 2 digit number : ");
			a = scan.nextInt();
			System.out.println("Enter another : ");
			b = scan.nextInt();
			sum = (a*a*a) + (b*b*b);
			RamanujamsNumber ram = new RamanujamsNumber();
			ram.find(a,b,sum);			
		}
		catch(Exception ex)
		{
			System.out.println("Uh-Oh. Caught an exception!");
		}		

	}
	public void find(int a, int b, int sum)
	{
		System.out.println("Checking for matches .. ");
		try
		{
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i!=a && i!=b && j!=a && j!=b)
				{
				if(((i*i*i)+(j*j*j) == sum))
				{
					System.out.println("The numbers are : " +i+ " and " +j);					
				}
				}
			}
		}
		}
		catch(Exception ex)
		{
			System.out.println("An exception!!");
		}
	}

}
