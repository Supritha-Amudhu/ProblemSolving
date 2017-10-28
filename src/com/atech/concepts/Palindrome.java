package com.atech.concepts;
import java.util.*;

public class Palindrome {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = input.nextLine();
		System.out.println(palindrome(str));
	}
	
	public static String palindrome(String str){
		String reverse = "";
		int i=0;
		for(i=str.length();i>0;i--){
			reverse = reverse + str.charAt(i-1);
		}
		return reverse;
	}

}
