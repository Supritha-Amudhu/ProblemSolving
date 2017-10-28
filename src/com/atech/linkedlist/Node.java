package com.atech.linkedlist;

class Node<T>
{
	public T element;
	public Node<T> next;		
		
	public Node() 
	{
		element=null;
		next = null;
	}
	
	public Node(T element)
	{
		this.element = element;
	}
}