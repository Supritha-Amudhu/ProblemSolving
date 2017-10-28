package com.atech.recursion;
import java.util.*;

public class factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		factorial fact = new factorial();
		System.out.println(fact.findFactorial(num));
	}
	public int findFactorial(int num)
	{
		if(num == 1)
		{
			return num;
		}
		else
		{
			return (num * findFactorial(num-1));
		}
	}

}
