package com.atech.trial1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFileReader {

	
	public static void main(String[] args) throws IOException
	{
		
		File file = new File("sample.txt");
		try 
		{
			//create a file
			file.createNewFile();
			//System.out.println(file.getUsableSpace());
			FileWriter fw = new FileWriter(file);
			fw.write("Hey, this is one HP fan! :)");
			fw.append("Hello");
			fw.flush();
			fw.close();
			
			//Create a FileReader object 
			FileReader fr = new FileReader(file);
			char c[] = new char[50];
			fr.read(c);
			for (char d : c) 
			{
				System.out.print(d);
			}
			fr.close();
			
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
