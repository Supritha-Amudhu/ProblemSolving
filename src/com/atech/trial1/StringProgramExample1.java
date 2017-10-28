package com.atech.trial1;

import java.util.Scanner;

public class StringProgramExample1 
{
	public static void main(String[] args)
	{
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String vowelCheck = new String(scan.nextLine());
		System.out.println("This is the string entered by you : " +vowelCheck);
		String splitString[] = vowelCheck.split("");
		String individual[] = new String[20];
		for(int i =0; i<splitString.length; i++)
		{
			if(splitString[i].equals("a") || splitString[i].equals("e") || splitString[i].equals("i") || splitString[i].equals("o") || splitString[i] .equals("u"))
			{
				if(count%2 == 0)
				{
					individual[i] = "*";
					
				}
				else
				{
					individual[i]="#";
				}
				count++;
			}	
			else
			{
				individual[i]=splitString[i];
			}
		}		
		for(int i=0; i<splitString.length; i++)
		{
			System.out.print(individual[i]);
		}
		
	}
}
