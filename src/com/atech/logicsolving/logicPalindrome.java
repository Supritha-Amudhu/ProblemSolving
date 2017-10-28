package com.atech.logicsolving;

import java.util.Scanner;

public class logicPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("String palindrome");
		System.out.println("Enter a word or a number to check : ");
		String a = scan.nextLine();
		StringBuffer input = new StringBuffer(a);
		StringBuffer reverse = new StringBuffer(input.reverse());
		System.out.println(reverse);
		if(input.toString().equals(reverse.toString()))
		{
			System.out.println("It is a palindrome.");	
		}
		else
		{
			System.out.println("It's not a palindrome.");
		}
		
	}

}
