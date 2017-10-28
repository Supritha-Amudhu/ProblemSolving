package com.atech.trial1;

public class ArrayValueChangingExample 
{
	
	public static void main(String[] args)
	{
		int[] a = new int[5];
		a[3] = 4;
		System.out.println(a[3]);
		ArrayValueChangingExample h = new ArrayValueChangingExample();
		ArrayValueChangingExample i = new ArrayValueChangingExample();
		h.changeArray(6);
		i.changeArray(3);
		
		
	}
		
		public static void changeArray(int x)
		{
			System.out.println(x);
			
		}
		

	

}
