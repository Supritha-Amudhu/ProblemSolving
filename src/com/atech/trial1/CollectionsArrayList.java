package com.atech.trial1;
//Output displayed in the same order as input. Used for easy storage and retrieval of arrays.
//Has 2 constructors : 1. LinkedList() 2. LinkedList(Collection c) 
import java.util.*;
public class CollectionsArrayList 
{	
	public static void main(String[] args)
	{
		ArrayList arraylist = new ArrayList();
		ListIterator check = arraylist.listIterator();
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		arraylist.add("6");
		arraylist.add("7");
		arraylist.add("8");
		arraylist.add("9");
		arraylist.add("10");
		Collections.reverse(arraylist);
		System.out.println("Reversed : "+arraylist);
		List copyList = new LinkedList();
		Collections.copy(arraylist, copyList);
		System.out.println("Copied list : "+copyList);
		ArrayList cloneList = (ArrayList) arraylist.clone();
		System.out.println("Cloned array list : " +cloneList);
		List m = new LinkedList();
		m.add("A");
		m.add("B");
		System.out.println("Array List : " +arraylist);
		arraylist.add(4, 23);
		System.out.println("Add 23 to Position 5 : " +arraylist);
		arraylist.add("Added new");
		System.out.println("After .add : " +arraylist);
		arraylist.addAll(m);
		System.out.println("After .addAll : " +arraylist);
		System.out.println("Getting a value : " +arraylist.get(4));
		System.out.println("Getting an index : " +arraylist.indexOf("Added new"));
		System.out.println("Getting the last index of 9 : " +arraylist.lastIndexOf("9"));
		System.out.println("Iterator : " +arraylist.iterator());
		System.out.println("List Iterator : " +arraylist.listIterator());
		arraylist.remove(0);
		arraylist.remove("4");
		System.out.println("After removing : " +arraylist);
		System.out.println("Size : " +arraylist.size());
		arraylist.set(5, 0);
		arraylist.set(0, "Newly set");
		System.out.println("Setting a value 42 at index 21 : " +arraylist);
		//You can also create a new sublist as ArrayList. 
		List sub = new LinkedList();
		sub = arraylist.subList(0, 12);
		System.out.println("The sub list : " +sub);
		((ArrayList) arraylist).trimToSize();
		System.out.println(arraylist.size());
		String[] str = new String[20];
		boolean b = Collections.addAll(arraylist, "Extra 1", "Extra 2", "Extra 3");
		System.out.println(arraylist);	
		ArrayList sup = new ArrayList();
		sup.add("Hey");
		sup.add(1);
		System.out.println(sup.get(0));
		System.out.println(sup.get(1));
		Collections.addAll(arraylist, "Here");
		System.out.println(sup);
		System.out.println(arraylist);
		
		ListIterator listiterator = arraylist.listIterator();
		while(listiterator.hasPrevious()){
			Object oo = listiterator.previous();
			System.out.println("Printing : " +oo);
		}
			
		
	}

}
