package com.atech.trial1;

import java.util.Enumeration;
import java.util.Vector;

public class DataStructuresEnumeration {

	
	public static void main(String[] args) {
		Enumeration characters;
		Vector char1 = new Vector();
		char1.add("Harry");
		char1.add("Ron");
		char1.add("Hermione");
		char1.add("Ginny");
		char1.add("Snape");
		characters = char1.elements();
		while(characters.hasMoreElements())
		{
			System.out.println(characters.nextElement());
		}
		

	}

}
