package com.atech.exception;

public class throwException
{
	public static void main(String[] args) throws Exception 
	{
		try
		{
			throwException exobj = new throwException();
			exobj.methodA(exobj);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception handled.");
			ex.printStackTrace();
		}
		finally{
			System.out.println("Method still continues.");
		}
			
	}
public void methodA(throwException exobj)
{
	exobj.methodB(exobj);
}
public void methodB(throwException exobj)
{
	exobj.methodC(exobj);
}
public void methodC(throwException exobj)
{
	try{
	int a =1/0;
	System.out.println(a);
	}
	finally{
		System.out.println("Do I score an extra point?");
	}
}

}
