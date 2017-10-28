package com.atech.trees;

public class Node<T>
{
	public T element;
	public Node left;
	public Node right;
	public int position;
	
	public Node()
	{
		element=null;
		left=null;
		right=null;	
		position=0;
	}
	public Node(T element)
	{
		this.element=element;
	}
}
