package com.atech.trial1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample 
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("E:\\Supritha\\CGPA.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		System.out.println(br.readLine());
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a line! =D ");
		String str = b.readLine();
		System.out.println("The line you entered is : ");
		System.out.println(str);
		
		
	}

}	
