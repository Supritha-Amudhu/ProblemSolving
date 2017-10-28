package com.atech.trial1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsArrayListComparator 
{
	
	public static void main(String[] args)
	{
		List<Dog> doglist = new ArrayList<Dog>();
		Dog s = new Dog("Harry", 2);
		doglist.add(s);
		doglist.add(new Dog("Bubbles", 1));
		doglist.add(new Dog("Hugo", 12));
		doglist.add(new Dog("Bubbles", 8));
		doglist.add(new Dog("Bruno", 4));
		doglist.add(new Dog("Captain Jack Sparrow 8)", 5));
		
		
		Collections.sort(doglist);
		
		for(Dog a : doglist)
		{
			System.out.println(a.getDogName() + " " + a.getDogAge());
		}
		System.out.println();
		System.out.println("After sorting : ");
		Collections.sort(doglist, new Dog());//Calling Compare
		System.out.println(" ");
		for (Dog a : doglist)
		{
			System.out.println(a.getDogName() + " " +a.getDogAge());
		}		

	}

}
class Dog implements Comparator<Dog>, Comparable<Dog>
{
	private String name;
	private int age;
	Dog()
	{
		
	}
	Dog(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getDogName()
	{
		return name;
	}
	public int getDogAge()
	{
		return age;
	}
	public String toString()
	{
		return this.name;
	}
	
public int compareTo(Dog d)
{
	return this.name.compareTo(d.name);
}
public int compare(Dog d1, Dog d2)	
{
	return (d1.age-d2.age);
}
}
