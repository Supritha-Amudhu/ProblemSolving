package com.atech.trial1;

public class StringSOExample {

	/**
	 * i'm writing code to read simple statement of words like "one two three", and put each word into an array String [] token, i wanted to input the statement using Scanner but it only read the first word. when i use the main method to input the statement it works well. can i know what is my mistake?
		here are the 2 Codes:
		Using main, the result at the console will be:
		one two three
		Using Scanner
		if i write at console:
		one two three
		then press enter the result will be:
		one
	 */
	public static void main(String[] args) 
	{
		String statement = "one two three";
		screen(statement);

	}
	public static void screen(String statement)
	{
		String token[] = statement.split("");
		for (int i=0; i<token.length; i++)
		{
			System.out.println(token[i]);
		}
	}

}
