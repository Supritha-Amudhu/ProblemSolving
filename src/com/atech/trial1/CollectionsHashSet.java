package com.atech.trial1;
//Avoids duplicates. Elements wont get added in the insertion order.
//constructors 1. HashSet( ) 2. HashSet(Collection c) 3. HashSet(int capacity) 4. HashSet(int capacity, float fillRatio)

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class CollectionsHashSet 
{
	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		System.out.println("Set after creating : " +set);
		set.removeAll(set);
		System.out.println("Empty : " +set);
		set.add("Harry");
		set.add("Ron");
		set.add("Hermione");
		set.add("Ginny");
		set.add("Snape");
		set.add("Luna");
		set.add("Hermione");
		//Adding a list to a set
		/*LinkedList linky = new LinkedList<>();
		linky.addAll(set);
		System.out.println(linky);*/		
		System.out.println("Set with duplicate element : " +set);
		set.remove("Hermione");
		
		System.out.println("Removed duplicate element : " +set);
		//Removes the original Hermione from the Set cos there is no duplicate Hermione created.
		//set.clear(); removes all elements
		//set.removeAll(set); removes all elements
		boolean check = set.isEmpty();
		System.out.println("Is the HastSet empty? : " +check);
		System.out.println("Does the set contain Harry? : " +set.contains("Harry"));
		System.out.println("Size of the collection : " +set.size());
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			String set1 = itr.next();
			System.out.println("Iterator : " +set1);
		}
		System.err.println("Hey");
		
	
	}

}
