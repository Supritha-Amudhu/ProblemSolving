package com.atech.trial1;
import java.util.*;

public class ArrayListToArrayMethod {

	
	public static void main(String[] args) 
	{
		ArrayList<Integer> ia = new ArrayList<Integer>();
		ia.add(10);
		ia.add(11);
		ia.add(12);
		ia.add(14);
		ia.add(15);
		Integer[] inti = new Integer[1]; //Declaring a higher number will still print the elements from the final line, but will throw a null pointer exception alongside.
		ia.trimToSize();
		inti = ia.toArray(inti);
		for(int i : inti)
		{
			System.out.println(i);
		}
		
		

	}

}
