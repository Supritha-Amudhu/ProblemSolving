package com.atech.trees;
import java.util.*;

public class binarySearchTree<T>
{
	public Node<Integer> head;
	public Node<Integer> addElement(int element)
	{
		try
		{			
			Node<Integer> node = new Node<Integer>(element);
			if(head.element==null)
			{
				System.out.println("Checking.");
				head=node;
				node.position=0;
				node.left=null;
				node.right=null;				
			}
			else 
			{
				if(element<head.element)
				{
					head=head.left;
					node.left = addElement(element);
				}
				else
				{
					head=head.right;
					node.right = addElement(element);
				}
			}	
			
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught when adding an element");
			ex.printStackTrace();
		}
		return null;
	}
	public void display()
	{
		Node<Integer> temp = head;
		try
		{
			if(temp.element == 0)
			{
				System.out.println("No elements to display");
			}
			else if((temp.right == null) && (temp.left == null))
			{
				System.out.println("temp.element : "+ temp.element + "->");
				temp=temp.right;
			}
			else
			{
				while(temp.right!=null && temp.left!=null)
				{
					System.out.println("Parent : "+temp.element +"->");
					System.out.println("Left child : "+temp.left+ "->");
					System.out.println("Right child : "+temp.right+"->");
				}
				System.out.println("Parent : "+temp.element +"->");
				System.out.println("Left child : "+temp.left+ "->");
				System.out.println("Right child : "+temp.right+"->");
			}
				
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught while printing.");
			ex.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		binarySearchTree tree = new binarySearchTree();
		System.out.println("Enter an element : ");
		Scanner scan = new Scanner(System.in);
		int element = scan.nextInt();
		tree.addElement(element);
		tree.display();
	}

}
