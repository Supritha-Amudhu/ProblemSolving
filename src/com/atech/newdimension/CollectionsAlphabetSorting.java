package com.atech.newdimension;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsAlphabetSorting {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try{
			System.out.println("Enter a String : ");
			String str = scan.nextLine();
			String[] s = str.split("");
			Set set = new TreeSet();
			for(int i=0;i<s.length;i++){
				set.add(s[i]);
			}
			Iterator itr = set.iterator();
			while(itr.hasNext()){
				Object c = itr.next();
				System.out.println(c);
			}
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Exception caught !");
		}

	}

}
