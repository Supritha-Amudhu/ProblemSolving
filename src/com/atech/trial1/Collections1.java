package com.atech.trial1;

import java.util.*;

public class Collections1 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Harry");
		list.add("Ron");
		list.add("Hermione");
		list.add("Snape");
		System.out.println("Array Example : \n" +list);

		List a = new LinkedList<>();
		a.add("Katniss");
		a.add("Peeta");
		a.add("Gale");
		a.add("Primrose");
		System.out.println("Linked List Example : \n" +a);
		
		Set s = new HashSet();
		s.add("Sheldon");
		s.add("Leonard");
		s.add("Raj");
		s.add("Howard");
		s.add("Penny");
		System.out.println("HashSet Example : \n" +s);
		
		Map m = new HashMap();
		m.put("Chandler", 10);
		m.put("Phoebe", 10);
		m.put("Ross", 8);
		m.put("Joey", 8);
		m.put("Monica", 7);
		m.put("Rachel", 6);
		System.out.println("HashMap Example : \n" +m);
		
		Set h = new HashSet();
		h.addAll(s);
		System.out.println("Copied : \n" +h);
		System.out.println("Contains : " +h.contains("Sheldon"));
		System.out.println("Contains All : " +h.containsAll(s));
		System.out.println("Is Empty : " +h.isEmpty());
		System.out.println("Equals : " +h.equals(s));
		System.out.println("Hash Code : " +h.hashCode());
		System.out.println("Is Empty : " +s.isEmpty());
		System.out.println("Iterator : " +h.iterator());
		System.out.println("Remove : " +h.remove("Penny"));
		System.out.println("After removing : " +h);
		System.out.println("Equals wrong : " +h.equals(m));
		s.add("Extra");
		System.out.println("S Before : " +s);
		System.out.println("Retain all : " +s.retainAll(h));
		System.out.println("S" +s);
		System.out.println("H" +h);
		System.out.println("Size of M : " +m.size());
		System.out.println();
		
		Collections.sort(list);
		System.out.println("Sorted : " +list);
		
		Iterator itr1 = s.iterator();
		Iterator itr2 = h.iterator();
		Iterator itr3 = a.iterator();
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext() && itr1.hasNext() && itr2.hasNext() && itr3.hasNext())
		{
			Object element = itr.next();
			Object element1 = itr1.next();
			Object element2 = itr2.next();
			Object element3 = itr3.next();
			
			System.out.println(element);
			System.out.println(element1);
			System.out.println(element2);
			System.out.println(element3);
		}
		ListIterator litr = list.listIterator();
		System.out.println("Straight : ");
		while(litr.hasNext())
		{
			Object estraight = litr.next();
			System.out.println(estraight);
		}
		System.out.println("Reverse : ");
		while(litr.hasPrevious())
		{
			Object e = litr.previous();
			System.out.println(e + "");
		}
			
				
	}

}
