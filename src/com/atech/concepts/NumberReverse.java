package com.atech.concepts;
import java.util.*;

public class NumberReverse {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		long a = input.nextInt();
		System.out.println(numberReverse(a));
		
	}
	
	public static long numberReverse(long a){
		long reminder,reverse = 0;
		while(a > 0){
			reminder = a%10;
			a = a/10;
			reverse = reverse*10 + reminder;
		}
		
		
		return reverse;
	}

}
