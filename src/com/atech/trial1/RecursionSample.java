package com.atech.trial1;

public class RecursionSample {

	
	public static void main(String[] args) 
	{
		RecursionSample obj = new RecursionSample();
		obj.recursiveMethod(20);
;
	}
	public int recursiveMethod(int a)
	{	
		System.out.println("The value of a is : " +a);
		a--;
		if(a==0)
		{
			return 0;
		}
		else
		{
			return (recursiveMethod(a));
		}
	}
	public void doNothing(){
		return;
	}

}
