package com.atech.logicsolving;

import java.util.*;

public class numberToOctal 
{

	public static void main(String[] args) 
	{
		numberToOctal octal = new numberToOctal();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		System.out.println(args[0]);
		int num = scan.nextInt();
		octal.octal(num);
			
	}
	public void octal(int a)
	{
		System.out.println("Hello");
		ArrayList str = new ArrayList();
		int i=0,r=0;
		int d=a/8;
		while(d>=8)
		{
			r=a%8;
			System.out.println("Reminder is : " +r);
			str.add(r);
			d=a/8;
			System.out.println("Divisor is : " +d);
			a=d;			
			i++;
		}				
		Iterator itr = str.iterator();
		Collections.reverse(str);
		System.out.println("The octal representation is : ");
		System.out.print(d);
		while(itr.hasNext())
		{
			Object num = itr.next();
			System.out.print(num);		
		}	
		
	}

}
