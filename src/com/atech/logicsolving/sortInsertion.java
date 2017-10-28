package com.atech.logicsolving;
//Incomplete

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class sortInsertion
{
	public static void main(String[] args)
	{
		ArrayList<Integer> intArraay = new ArrayList<Integer>(); 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a series of numbers. If you want to quit entering, enter 0.");
		for(int i=0;i<100;i++)
		{
			Integer a = scan.nextInt();
			if(a!=0)
			{
				intArraay.add(a);
			}
			else
			{
				break;
			}
			
		}
		System.out.println(intArraay);
	}

	
	

}
