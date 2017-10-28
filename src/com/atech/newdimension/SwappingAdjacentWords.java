package com.atech.newdimension;

public class SwappingAdjacentWords {

	public static void main(String[] args) {
		String str = "Potter Harry is life.";
		StringBuffer strb = new StringBuffer(str);
		String s1 = "Potter", s2 = "Harry";
		int s1Index=0,s2Index=0;
		System.out.println(strb);
		s1Index = strb.indexOf(s1);
		s2Index = strb.indexOf(s2);
		System.out.println(strb.indexOf(s1));
		System.out.println(strb.indexOf(s2));
		strb.replace(s2Index, (s2Index+s2.length()), s1);
		System.out.println(strb);
		strb.replace(s1Index, (s1Index+s1.length()), s2);
		System.out.println(strb);	
		
		
	}

}
