package com.atech.newdimension;

public class StringToInteger {

	public static void main(String[] args) {
		String str = "123";
		System.out.println("String : "+str);
		Character ch1 = str.charAt(0);
		int a = ch1.getNumericValue(ch1);
		Character ch2 = str.charAt(1);
		int b = ch2.getNumericValue(ch2);
		Character ch3 = str.charAt(2);
		int c = ch3.getNumericValue(ch3);
		int result = (a*100)+(b*10)+c;
		System.out.println("Integer : " +result);
	}
	
}
