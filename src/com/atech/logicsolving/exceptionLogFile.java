package com.atech.logicsolving;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class exceptionLogFile
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = null;
		int count=0;
		try
		{
			String line;
			br = new BufferedReader(new FileReader("E:\\Supritha\\Dream, Determined\\syslog2_master_2.txt"));
			while((line=br.readLine())!=null)
			{
				count++;
				String[] split = line.split(" ");
				for(String c : split)
				{
					if(c.equals("exception") || c.equals("Exception"))
					{
						System.out.println(c + " occurs at line " +count + " in the file.");
					}
				}
			}
			
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("The file does not exist.");
		}
		finally
		{
			br.close();
		}
		
		

	}

}
