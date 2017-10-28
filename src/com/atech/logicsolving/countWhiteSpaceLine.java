package com.atech.logicsolving;
import java.util.*;

public class countWhiteSpaceLine
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your line : ");
		String input = scan.nextLine();
		StringBuilder strb = new StringBuilder(input);
		String[] strSplit = input.split("\\s+");
		int count= (input.length())-(input.replaceAll(" ", "").length());
		System.out.println("Count : " +count);
		int count1=0;
		for(char c : input.toCharArray())
		{
			if(c==' ')
			{
				count1++;
			}			
		}
		System.out.println(count1);
		
	}
		

}


