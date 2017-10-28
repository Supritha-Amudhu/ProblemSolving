package com.atech.logicsolving;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class countOfWhiteSpaces 
{
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		BufferedReader br = null;
		try
		{
			ArrayList<Object> list = new ArrayList<>(); 
			String current;
			br = new BufferedReader(new FileReader("E:\\Supritha\\Dream, Determined\\hp.txt"));
			while((current = br.readLine())!= null)
			{
				System.out.println(current);
				list.add(current);
			}				
			System.out.println("Size of the list : " +list.size());
			int i=0;
			for(char c : list.toString().toCharArray())
			{
				if(c == ' ')
				{
					i++;
				}
			}
			System.out.println("Count of white spaces : " +i);
					
		}
		catch(FileNotFoundException fex)
		{
			fex.printStackTrace();
		}
		finally
		{
			br.close();
		}
		
	}

}
