package com.atech.newdimension;

import java.util.*;

public class FunctionComponents {

	public static void main(String[] args) {
		//String function = "public static void getData(int a, char b)";
		/*String str = "A2B3C4";
		char ch;
		StringBuilder output = new StringBuilder();
		int i=0,n=str.length(),len=0;
		for(i=0;i<n;i++){
			ch = str.charAt(i);
			if(((int)ch > 48) && ((int)ch < 57)){
				//len = Integer.parseInt();
				output.append(str.charAt(i-1));
			}
			else{
				output.append(ch);
			}
		}
		*/
		StringBuilder output = new StringBuilder();
		int[] a = {1,2,3,4};
		int[] b = {1,5,6,2,3,4};
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		int i=0;
		for(i=0;i<a.length;i++){
			set1.add(a[i]);
		}
		for(i=0;i<b.length;i++){
			set2.add(b[i]);
		}
		set2.removeAll(set1);
		System.out.println(set2);
	}
	

}
