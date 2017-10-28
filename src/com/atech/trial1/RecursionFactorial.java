package com.atech.trial1;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			RecursionFactorial obj = new RecursionFactorial();
			System.out.println("Enter the number for which the factorial is to be calculated");
			int fact = scan.nextInt();			
			fact = obj.factorialCalc(fact);
			System.out.println("The factorial is : " +fact);
	}
	
	public int factorialCalc(int a)
	{
		int fact=0;
		if(a == 1)
		{
			return 1;
		}		
		fact = a*(factorialCalc(a-1));
		return fact;
				
	}

}
