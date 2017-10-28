package com.atech.trial1;

import com.atech.trial1.OuterClass.InnerClass;

public class InnerClassSample 
{		
	public static void main(String[] args)
	{
		//OuterClass outer = new OuterClass();
		//OuterClass.InnerClass innerObj = new OuterClass().new InnerClass();
		/*innerObj.print();
		innerObj.outerPrint();*/
		//innerObj.outerPrint();
	}
}
class OuterClass
{
		
	
	private static int b=0;
	public void outerPrint()
	{
		InnerClass inner = new InnerClass();
		inner.outerPrint();
		System.out.println("OUTER : b's value : " +b);
	}
static class InnerClass
{
	private int a=0;
	public void outerPrint()
	{
		System.out.println("Outer Print over-ridden.");
	}
	public void print()
	{
		System.out.println("INNER : Value of a and b : " +a+ " " +b);
	}
	
}
}

