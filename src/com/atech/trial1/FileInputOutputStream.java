package com.atech.trial1;
//Converts byte to char and prints
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;



public class FileInputOutputStream 
{

	
	public static void main(String[] args) throws IOException
	{
		try
		{
			File file = new File("sample.txt");
			file.createNewFile();
			char b = 'a';
			byte[] b1 = {66, 67, 69, 100, 123, 122};
			String str = new String();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(b);
			fos.write(b1);
			//Getting the number of elements in the FileOutputStream.
			FileChannel fc = fos.getChannel();
			System.out.println(fc.position());
			fos.flush();
			fos.close();
			FileInputStream fis = new FileInputStream(file);
			int i=0;
			//char c;
			byte[] c;
			for(i=0; ((i=fis.read()) != -1); i++)
			{
				c =  (byte[]) i;
				System.out.println(c);
			}
			
			
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("Finally 8)");
		}

	}

}
