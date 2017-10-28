package com.atech.trial1;
import java.sql.Array;
import java.util.*;
//Same as HashSet, the output retrieved is the same order as when given as an input.
public class CollectionsLinkedHashSet
{

	
	public static void main(String[] args)
	{
		Set<String> set = new LinkedHashSet<String>();
		set.add("Hey");
		set.add("There");
		set.add("You");
		System.out.println(set);
		Set<String> set1 = new HashSet<String>();
		set1.add("Hey");
		set1.add("There");
		set1.add("You");
		System.out.println(set1);
		boolean isContainsAll= set1.containsAll(set);
		System.out.println(isContainsAll);
		Object[] str = set1.toArray();
		System.out.println(str[0]);
		
	}

}
