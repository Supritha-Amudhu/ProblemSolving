package com.atech.logicsolving;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionBlockLog {

	
	public static void main(String[] args) {
		BufferedReader br = null;
		int count=0;
		boolean check = false;
		String exception = "";
		try
		{
			String line;
			br = new BufferedReader(new FileReader("E:\\Supritha\\Dream, Determined\\syslog2_master_2.txt"));
			while((line=br.readLine())!=null)
			{
				count++;
				if(check || line.contains("Exception") || line.contains("exception"))
				{
					exception += line;
					check = true;
					if(line.contains("Exception"))
					System.out.println("Exception occurs at line " +count + " in the file.");					
				}				
				if(line.contains("Scanner.java:"))
				{
					check = false;
				}
			}
		}
		catch(Exception ex){
			System.out.println("Exception caught");
			ex.printStackTrace();
		}
		finally{
			try {
				System.out.println(exception);
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
