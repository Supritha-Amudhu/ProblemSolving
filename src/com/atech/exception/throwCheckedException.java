package com.atech.exception;
import java.io.*;

public class throwCheckedException {

	
	public static void main(String[] args) throws IOException  {
		
		throwCheckedException th = new throwCheckedException();
		th.methodA(th);
		int a=0;
		throw new IOException("The file you searched for, was not found !");
		
	}
	public void methodA(throwCheckedException th) throws IOException
	{
		System.out.println("Hi there methodA");
		th.methodB(th);
	}
	public void methodB(throwCheckedException th) throws IOException
	{
		System.out.println("Hi there methodB");
		th.methodC();
	}
	public void methodC() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("E:\\Supritha\\Dream, Determined\\my_logs.txt"));
		while(br.readLine()!=null)
		{
			System.out.println("Hello");
		}
		System.out.println("Hi there methodC");
	}

}
