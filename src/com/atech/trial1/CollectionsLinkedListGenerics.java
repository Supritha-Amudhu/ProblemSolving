package com.atech.trial1;

import java.util.*;

public class CollectionsLinkedListGenerics {

	public static void main(String[] args) {
		int i = 1;
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("First String");
		linkedList.add("Second String");
		// Adding a String in one particular position
		linkedList.add(2, "Third String");
		// You can create a String object, and add it to the linkedList
		String str = new String("Fourth String");
		linkedList.add(str);
		linkedList.add("Fifth String");
		// Direct printing of the linkedList
		System.out.println("The Current Linked List : \n" + linkedList);
		// Creating a clone out of the existing linkedList
		@SuppressWarnings("unchecked")
		LinkedList<String> linkedListClone = (LinkedList<String>) linkedList.clone();
		// Printing a clone of the linkedList
		System.out.println("Linked List clone : \n" + linkedListClone);
		// Pushing elements into the linkedList
		linkedList.push("New String pushed");
		// The pushed String gets added in the fist position
		System.out.println("The Linked List after a String is pushed \n: "
				+ linkedList);
		// Popping an element from the list - removes the first element
		linkedList.pop();
		System.out.println("The Linked List after the .pop() is called : \n"
				+ linkedList);
		// .remove() removes the first String from the list
		linkedList.remove();
		System.out.println("Linked List after calling .remove() : \n"
				+ linkedList);
		// Removing selective Strings from the list
		linkedList.remove(str);
		System.out
				.println("Linked List after removing a particular string object : \n"
						+ linkedList);
		// All elements of the String can be removed by calling the .removeAll()
		linkedListClone.removeAll(linkedListClone);
		System.out.println("The now-empty, cloned Linked List : \n"
				+ linkedListClone);
		// Creating a sub-list
		List<String> subList = linkedList.subList(0, 2);
		System.out.println("The sub list : \n" + subList);
		// Changing the value of a Linked List
		Object changeVal = linkedList.get(1);
		linkedList.set(1, changeVal + " Changed");
		// Linked List after changing the value
		System.out.println("Value changed : \n" + linkedList);
		// Invoking an iterator
		Iterator<String> itr = linkedList.iterator();
		System.out.println("Printing values with an iterator");
		while (itr.hasNext()) {
			String newString = itr.next();
			System.out.print(i + ". ");
			System.out.println(newString);
			i++;
			// Now the Iterator has more functionalities - it can using the
			// String functions when printing in addition to the normal iterator
			// functionalities
			// Example - to print a character at a particular position for each
			// String
			System.out.println("Character at position 2 : \n"
					+ newString.charAt(2));
		}
	}

}
