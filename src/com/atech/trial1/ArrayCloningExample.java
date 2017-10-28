package com.atech.trial1;

public class ArrayCloningExample 
{
	
	public static void main(String[] args)
	{
		int a1[] = {1,2,3,4,5};
				
		for(int i=0; i<=4; i++)
		{
			System.out.println(a1[i]);
		}
		int a2[] = new int[5];
		a2 = a1.clone();
		for(int i=0; i<=4; i++)
		{
			System.out.println(a2[i]);
		}
		System.out.println(a1.getClass().getSuperclass());
	}

}
