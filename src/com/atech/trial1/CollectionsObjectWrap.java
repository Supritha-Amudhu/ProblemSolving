package com.atech.trial1;
import java.util.*;

public class CollectionsObjectWrap 
{
	
	public static void main(String[] args) 
	{
		//I finally used an array of objects xP
		Students[] s = new Students[5];
		s[0] = new Students("Supritha", 21, "J.K.Rowling");
		s[1] = new Students("xyzSupritha", 46, "Suzanne Collins");
		s[2] = new Students("abcSupritha", 94, "Sidney Sheldon");
		s[3] = new Students("mnoSupritha", 100, "Nicholas Sparks");
		s[4] = new Students("pqrSupritha", 24, "Dan Brown");
		List<Students> list = new LinkedList<Students>();
		for(int i=0; i<5; i++)
		{
			list.add(s[i]);
		}
		System.out.println("List before sorting : " +list);
		Collections.sort(list, new Students());
		System.out.println("List after sorting : " +list);
		//Printing with iterator
		Iterator<Students> itr = list.iterator();
		while(itr.hasNext())
		{
			Students s1 = itr.next();			
			System.out.println(s1);
		}
	}
	
}
class Students implements Comparator<Students>
{
	private String name;
	private int age;
	private String fandom;
	public Students() {
		// TODO Auto-generated constructor stub
	}
	Students(String name, int age, String fandom)
	{
		this.name = name;
		this.age = age;
		this.fandom = fandom;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getFandom()
	{
		return fandom;
	}
	public int compare(Students s1,Students s2)
	{
		return (s1.age - s2.age);
	}
	@Override
	public String toString()
	{
		return new String("Name : " +name + " Age : " +age + " Fandom : " +fandom);		
	}
}
