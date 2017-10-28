package com.atech.trial1;

import java.util.Scanner;

public class BattleshipExample {

	
	private int[] ship = new int[10];
	private static int[] location = {2,3,4};
	static String userGuess = null;
	static String result = null;
	
	public static void main(String[] args) 
	{
		
		BattleshipExample object = new BattleshipExample();	
		Scanner scan = new Scanner(System.in);
		object.setLocation(location);
		System.out.println("Enter your guess : ");
		userGuess = scan.nextLine();
		result = userGuess.checkResult(userGuess);
				
		

	}
	
public String checkResult(String userGuess1)
{
	userGuess = userGuess1;
	
}


}
