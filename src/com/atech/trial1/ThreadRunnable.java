package com.atech.trial1;

import java.util.Scanner;

public class ThreadRunnable 
{	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n=0,i=0;
		n = scan.nextInt();
		String input = "";
		for(i=0;i<n;i++){
			System.out.println("Enter String");
			input = scan.nextLine();
			check(input);
		}
}

	public static void check(String input){
		int i=0, count=0;
		for(i=0;i<(input.length())-1;i++){
			if((input.charAt(i)) == (input.charAt(i+1))){
				count++;
			}
		}
		System.out.println("Count is : "+count);
	}

	
}

