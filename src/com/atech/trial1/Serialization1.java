package com.atech.trial1;
import java.io.*;

public class Serialization1 implements Serializable
{	
	private int width;
	private int height;
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	public static void main(String[] args)
	{
		Serialization1 s = new Serialization1();
		s.setWidth(20);
		s.setHeight(40);
		try
		{
			FileOutputStream fs = new FileOutputStream("example.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(s);
			os.close();
			FileInputStream fs1 = new FileInputStream("example.ser");
			ObjectInputStream os1 = new ObjectInputStream(fs1);
			Object s1 = os1.readObject();
			Serialization1 s2 = (Serialization1) s1;
			System.out.println(s2.height);
			System.out.println(s2.width);
			os1.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
