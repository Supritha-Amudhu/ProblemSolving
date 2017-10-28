package com.atech.newdimension;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedWordDeletion {

	public static void main(String[] args) {
		System.out.println("Enter your string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String lower = str.toLowerCase();
		String[] split = lower.split(" ");
		Set<String> set = new LinkedHashSet<String>();
		int i=0;
		for(i=0;i<split.length;i++){
			set.add(split[i]);
		}
		Iterator<String> itr = set.iterator();
		System.out.println("String with repeated words removed : ");
		while(itr.hasNext()){
			String result = itr.next();
			System.out.print(result + " ");
		}
				

	}

}
