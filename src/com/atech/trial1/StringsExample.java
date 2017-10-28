package com.atech.trial1;

public class StringsExample 
{
	
	public static void main(String[] args)
	{
		float floatVar = 0;
		int intVar = 0;
		String stringVar = " Hello";
		String newString = new String("Harry");
		String newString1 = new String("Potter");
		System.out.println(newString + " " + newString1);
		System.out.println(newString.concat(newString1));
		System.out.println("Harry".concat(" Potter"));
		System.out.printf("The value of Float is %f The value of int is" + "%d The value of string is" + "%s", floatVar, intVar, stringVar);
		System.out.println("" + "");
		String newString2;
		newString2 = String.format("%f, %d, %s", floatVar, intVar, stringVar);
		System.out.println(newString2);
		
	}

}
