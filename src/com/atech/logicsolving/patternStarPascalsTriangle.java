package com.atech.logicsolving;

import java.util.Scanner;

public class patternStarPascalsTriangle 
{
	public static void main(String[] args)
	{	
		System.out.println("Enter a power of 11 : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();	
		patternStarPascalsTriangle pattern = new patternStarPascalsTriangle();
		pattern.printPascalTriangle(a);
	}
	public void printPascalTriangle(int a)
	{
		//int x =(2*a);
		int y=a;
		int z=1;
		long m =1;
		String m1;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<z;k++)
			{
				m = m*11;
				m1 = "" + m;
				for(int s=0;s<m1.length();s++)
				{
					System.out.print(m1.charAt(s)+ " ");
				}
			}
			y=y-1;
			System.out.println();
		}
		
	}


}
