package com.atech.trial1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSentenceReversal {

	
	public static void main(String[] args)
	{
		try
		{
			/**
			 * This one is for reversing every single alphabet.
			String sentence = new String();
			String[] copy = null;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a sentence :|");
			sentence = scan.nextLine();
			copy = sentence.split(" ");
			for(int i=sentence.length(); i>=0; i--)
			{
				System.out.print(copy[i] + "");			
			}
			
			System.out.println("\nThis is another way to do it :)");
			StringBuilder reverse = new StringBuilder(sentence);
			System.out.println(reverse.reverse());
			The next pgm is for reversing just the words in the sentence.**/
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a sentence :");
			StringTokenizer str = new StringTokenizer(scan.nextLine());
			//Counts the number of times the string can be split/nextToken() method can be called, else it ll lead to NullPointerException
			System.out.println("Number of times the nextToken() can be called : " +str.countTokens());
			String[] str1 = new String[50];
			int i=0, count =0;
			while(str.hasMoreTokens())
			{
				str1[i] = str.nextToken();				
				i++;
				count++;
			}
			
			for(int j=count-1; j>=0; j--)
			{
				System.out.print(str1[j] + " ");
			}
			
			}
		catch (Exception ex)
		{
			System.out.println("The exception : " +ex);
		}
		

	}
	
	
}
