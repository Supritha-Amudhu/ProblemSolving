package com.atech.linkedlist;
import java.util.*;

public class LinkedList<T>
{	
	public Node<Integer> head;
	public void addAtBeginning(int element)
	{
		try
		{
			Node<Integer> node = new Node<Integer>(element);
			if(head.element==null)
			{
				head=node;
				head.next=null;
			}
			else
			{	
				node.next=head.next;
				node.next=head;				
				head=node;				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught.");
			ex.printStackTrace();
		}
	}
	public void addAtEnd(int element)
	{
		try
		{
			Node<Integer> node = new Node<Integer>(element);
			if(head==null)
			{
				head=node;
				head.next=null;
			}
			else
			{
				Node<Integer> temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=node;
				node.next=null;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught : " +ex);
		}
	}
	public void addInMiddle(int element, int position)
	{
		Node<Integer> check = head;
		int length=1;
		while(check.next!=null)
		{
			check=check.next;
			length++;
		}
		if(position>(length+1))
		{
			System.out.println("Enter a position within " +(length+1));
		}
		else
		{
		try
		{
			Node<Integer> node = new Node<Integer>(element);
			if(head==null)
			{
				head=node;
				head.next=null;				
			}
			else
			{
				Node<Integer> temp=head;
				int i=1;
				while(i<(position-1))
				{
					temp=temp.next;
					i++;
				}
				node.next=temp.next;
				temp.next=node;								
			}			
		}		
		catch(Exception ex)
		{
			System.out.println("Exception caught");
			ex.printStackTrace();
		}
		}
	}
	public void deleteFirst()
	{
		try
		{
			if(head.next==null)
			{
				head.element=null;
				System.out.println("The stack is empty.");
			}
			else
			{		
				head.element=null;
				head=head.next;				
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught.");
			ex.printStackTrace();
		}
	}
	public void deleteEndElement()
	{
		try
		{			
			Node<Integer> temp=head;
			if(temp.next == null)
			{
				temp.element=null;
				System.out.println("The stack is empty.");
			}
			else
			{
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next.element=null;
			temp.next=null;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Deleting at the end. Exception caught.");
			ex.printStackTrace();
		}
	}
	public void deleteMiddleElement(int element)
	{
		try
		{
			Node<Integer> temp =head;
			if(temp.element==null){
				System.out.println("The stack is empty.");
			}
			else if(temp.element == element)
			{
				temp.element=null;
				System.out.println("No more elements to display.");
			}
			else
			{
			while(temp.next.element!=element)
				{							
					temp=temp.next;						
				}	
				temp.next.element=null;
				temp.next=temp.next.next;
			}
		}			  
		catch(Exception ex)
		{
			System.out.println("Exception caught when trying to delete a middle element.");
			ex.printStackTrace();
		}
	}
	public void display()
	{
		Node<Integer> temp = head;
		try{
		if(temp.element == null)
		{
			System.out.println("No elements to display.");
		}
		/*else if(temp.next == null)
		{
			System.out.println(temp.element + "->");
			temp=temp.next;
		}	*/	 
		else
		{
			while(temp.next!=null)
			{
				System.out.println(temp.element + "->");
				temp=temp.next;
			}
			System.out.println(temp.element + "->");
		}
		}
		catch(Exception ex)
		{
			System.out.println("Exception caught while displaying the list.");
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> link = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		int choice=0;
		while(choice!=7)
		{
		System.out.println("" +
				"These are the options : \n" +
				"1. Add an element at the end\n" +
				"2. Add an element in the beginning\n" +
				"3. Add in the middle\n" +
				"4. Delete in the beginning\n" +
				"5. Delete an element in the middle\n" +
				"6. Delete an element in the end\n" +
				"7. Exit");
		choice = scan.nextInt();
				
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter an element : ");
					link.addAtEnd(scan.nextInt());
					link.display();
					break;
				}
				case 2:
				{
					System.out.println("Enter an element");
					link.addAtBeginning(scan.nextInt());
					link.display();
					break;
				}
				case 3:
				{
					System.out.println("Enter an element and its position");
					link.addInMiddle(scan.nextInt(), scan.nextInt());
					link.display();
					break;
					
				}
				case 4:
				{
					link.deleteFirst();
					link.display();
					break;
				}
				case 5:
				{
					System.out.println("Enter the element you want to delete : ");
					link.deleteMiddleElement(scan.nextInt());
					link.display();
					break;
				}
				case 6:
				{
					link.deleteEndElement();
					link.display();
					break;
				}
				case 7 :
				{
					System.out.println("Exiting.");
					break;
				}
				default:
				{
					System.out.println("Enter a value given.");
				}
			}
			
		}
		scan.close();
		

	}

}
