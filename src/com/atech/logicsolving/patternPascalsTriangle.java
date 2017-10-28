package com.atech.logicsolving;

import java.util.Scanner;

public class patternPascalsTriangle 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a power for 11 : ");
		Scanner scan = new Scanner(System.in);
		int pow = scan.nextInt();	
		patternPascalsTriangle pattern = new patternPascalsTriangle();
		pattern.printPascalsTriangle(pow);
	}
	public void printPascalsTriangle(int pow)
	{
		
		//int x =(2*pow);
		int y=pow;
		int z=1;
		int mul=1;
		for(int i=0;i<pow;i++)
		{
			for(int j=0;j<y;j++)
			{
				System.out.print(" ");
				System.out.println(y);
				y--;
			}
			//y--;
			for(int k=0;k<z;k++)
			{
				mul = mul*11;
				System.out.print("\t");
				System.out.print(mul);
			}
			
			//z=z+2;
			System.out.println();
		}
		
	}

}
