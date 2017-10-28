package com.atech.newdimension;

public class EqualDigitsUsingString {
	public static int length = 1;
	public static int loopCount=0;

	public static void main(String[] args) {
		boolean flagCheck=false, result = false;
		Integer number = 111;
		StringBuilder string = new StringBuilder(number.toString());
		System.out.println("Number : "+string);
		length = string.length();
		System.out.println("Length : "+length);
		System.out.println(string.charAt(length-1) + " " +string.charAt(length-2) );
		if(string.charAt(length-1) == string.charAt(length-2)){
			flagCheck=true;
			result = checkEqual(string,flagCheck);	
		}
		if(result)
			System.out.println("Equal");
		System.out.println("LoopCount : "+loopCount);
	}
	
	public static boolean checkEqual(StringBuilder number, boolean flagCheck) {
		loopCount++;
		boolean result = false;
		if(length==2 && flagCheck){
			result = true;
			System.out.println("Equal");
		}
		else if(length==2 && !flagCheck){
			number.deleteCharAt(number.length()-1);
			System.out.println("Clipped Number : " +number);
			checkEqual(number, flagCheck);
		}
		return result;
			
	}

	public static int findLength(int number) {
		length = 1;
		int lastDigit = 0;
		while ((number / 10) != 0) {
			lastDigit = number % 10;
			number = number / 10;
			length++;
		}
		return length;
	}

}
