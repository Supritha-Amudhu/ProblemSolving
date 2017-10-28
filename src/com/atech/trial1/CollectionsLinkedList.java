package com.atech.trial1;
//Output displayed in the same order as the input is added. Has more functionalities to add at the beginning, end, retrieved from end beginning, delete n so on.
//Has 3 constructors : 1. ArrayList() 2. ArrayList(Collection c) 3. ArrayList(int capacity)
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsLinkedList {

	
	public static void main(String[] args) 
	{
		LinkedList link = new LinkedList();
		link.add("A");
		link.add("B");
		link.add(2, "C");
		link.add("D");
		link.add("E");
		LinkedList link1 = (LinkedList) link.clone();
		link.addFirst("First");
		link.addLast("Last");
		link.addFirst(2);
		System.out.println("Clone : " +link1);
		System.out.println("Initial List : " +link);
		link.remove("Last");
		link.remove(0);
		link.remove();
		link.remove();
		System.out.println("Link : " +link);
		System.out.println("Size : " +link.size());
		List sublink = link.subList(0, 2);
		System.out.println("Sub linked list : " +sublink);
		Object val = link.get(1);
		link.set(1, val + " This is changed");
		System.out.println("Link after changing : " +link);
		System.out.println("Get Index : " +link.get(1));
		System.out.println("Get First : " +link.getFirst());
		System.out.println("Get Last : " +link.getLast());
		System.out.println("Get Class : " +link.getClass());
		
		ListIterator iterator = link.listIterator();
		while(iterator.hasNext()){
			Object ob1 = iterator.next();
			System.out.println("Initial : " +ob1);
		}
	
		while(iterator.hasPrevious()){
			System.out.println("sdfsdfsdf");
			Object ob = iterator.previous();
			System.out.println("Printing : " +ob);
			
		}

	}

}
