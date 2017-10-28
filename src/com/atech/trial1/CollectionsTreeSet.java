package com.atech.trial1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Same as a Set, it prevents duplicates, automatically sorts elements, access and retrieval times are fast.
public class CollectionsTreeSet
{
	
	public static void main(String[] args)
	{
		//Correct code commented.
		/*int count[] = {24,22,23,21,25,678,777};
		Set<Integer> set1 = new HashSet<Integer>();
		for(int i=0; i<count.length;i++)
		{
			set1.add(count[i]);
		}
		System.out.println("Hash Set : " +set1);
		Set<Integer> set2 = new TreeSet<Integer>(set1);
		System.out.println("Tree Set : " +set2);*/
		try
		{
		Set<Book> book = new TreeSet<Book>();
		Book b1 = new Book("Harry Potter");
		book.add(b1);
		book.add(new Book("Hunger Games"));
		book.add(new Book("Game of Thrones"));
		book.add(new Book("Savage"));
		book.add(new Book("Carrie"));
		//3 ways to print ^_^
		System.out.println(book);
		for(Book b3 : book)
		{
			System.out.println(b3.getBookName());
		}
		Iterator<Book> itr = book.iterator();
		while(itr.hasNext())
		{
			Book b5 = itr.next();
			System.out.println(b5);
		}
		
		}
		catch(Exception e)
		{
			System.out.println("The exception thrown is : " +e);
		}
		
	}

}
class Book implements Comparable<Book>, Comparator<Book>
{
	private String title;
	public Book(String t)
	{
		this.title = t;
	}
	public String getBookName()
	{
		return title;
	}
	public int compareTo(Book b)
	{
		Book book = (Book) b;
		return (title.compareTo(book.title));
	}
	@Override
	public String toString()
	{
		return this.title;
	}
	public int compare(Book b, Book c){
		return (b.compare(b, c));
	}
	
	
}
