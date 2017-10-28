package com.atech.logicsolving;
import java.util.*;

public class BinarySearchSample
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		BinarySearchSample object = new BinarySearchSample();
		int actual=0, guess=0;
		int[] values = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		try
		{
			System.out.print("The secret number between 0 to 20 is : ");
			actual = rand.nextInt(20);
			System.out.println(actual);			
			while(guess!=actual)
			{
				System.out.println("Keep Guessing .. !!");
				guess = scan.nextInt();
				object.startGuessing(guess, actual, values);
			}		
			
		}
		catch(Exception ex)
		{
			System.out.println("Caught!");
		}
		finally
		{
			scan.close();			
		}

	}
	public void startGuessing(int guess, int actual, int[] values)
	{
		int lower=0, upper=values.length-1;
		if(guess<actual)
		{
			System.out.println("You guessed lesser.");
			lower=guess+1; 
			upper=values.length-1;
			System.out.println("The range you should be searching in is : " +lower+ " to " +upper);
		}
		else if(guess>actual)
		{
			System.out.println("You guess higher.");
			lower=0;
			upper=guess-1;
			System.out.println("The range you should be searching in is : " +lower+ " to " +upper);
		}
		else if(guess==actual)
		{
			System.out.println("Yes you found it !!");
		}
	}

}
