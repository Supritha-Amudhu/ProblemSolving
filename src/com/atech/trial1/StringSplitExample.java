package com.atech.trial1;

public class StringSplitExample {

	
	public static void main(String[] args) 
	{
		String str = "Hey-You-There";
		String[] str1 = str.split("-");
		String Str = "Hey.You.There";
		String[] Str1 = Str.split("\\.");
		//By default it splits into 3 string objects here
		//This Java String split example describes how Java String is split into multiple Java String objects.
		for(int i=0; i<str1.length; i++)
		{
			System.out.print(str1[i] + " ");
			System.out.print(Str1[i] + " ");
		}
		

	}

}
