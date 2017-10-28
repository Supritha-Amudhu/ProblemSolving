package com.atech.newdimension;
//Given a word, find the sum of ASCII values of each letter of the word.

public class SumOfASCIIValues {

	public static void main(String[] args) {
		int sum=0,i=0;
		String input = "Hey There";
		for(i=0;i<input.length();i++){
			sum+=(int)input.charAt(i);
		}
		System.out.println("Final sum : "+sum);
	}

}
