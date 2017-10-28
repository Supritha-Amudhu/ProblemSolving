package com.atech.trial1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberTutor 
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);	
		Random rand = new Random();
		int number1 = 0, number2 = 0,userresult = 0, result = 0;
		while((userresult) == result)
		{
		System.out.print("This is the first number : ");
		number1 = rand.nextInt(20);
		System.out.println(number1);
		System.out.print("This is the second number : ");
		number2 = rand.nextInt(20);
		System.out.println(number2);
		System.out.println("Enter you result : ");
		userresult = scan.nextInt();			
		result = (number1*number2);
		System.out.println("'"+number1+"' X '"+number2+"' =" +userresult);
		if((userresult) == result)
		{
			System.out.println("The answer is correct!");
		}
		else
		{
			System.out.println("Incorrect, the answer is "+result);
		}
		}

	}

}
