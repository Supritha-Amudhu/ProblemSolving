package com.atech.newdimension;

public class StringSpace {
	
	public static void main(String[] args) {
		String input = new String("Hello World");
		String[] splitString = input.split("");
		StringBuffer output = new StringBuffer();
		for(int i=0;i<splitString.length;i++){
			output.append(splitString[i]+ " ");
		}
		System.out.println(output);

	}

}
