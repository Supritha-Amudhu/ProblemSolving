package com.atech.newdimension;

public class StringReverseLoop {

	public static void main(String[] args) {
		String a = "malayalamm";
		StringBuffer input = new StringBuffer(a);
		StringBuffer reverse = input.reverse();
		System.out.println(input);
		if(reverse.equals(input))
			System.out.println("Palindrome.");
		else
			System.out.println("Nope.");
		/*int i=0,first=0,last=0;
		for(i=input.length()-1;i>=0;i--){
			System.out.print(input.charAt(i));
		}*/
	}

}
