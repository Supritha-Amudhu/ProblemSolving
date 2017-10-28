package com.atech.newdimension;

public class StringLettersInAWordReverse {

	public static void main(String[] args) {
		String str = new String("I am a human being");
		String[] split = str.split(" ");
		StringBuilder strb;
		int i=0;
		for(i=0;i<split.length;i++){
			strb = new StringBuilder(split[i]);
			System.out.print(strb.reverse() + " ");
		}
	}

}
