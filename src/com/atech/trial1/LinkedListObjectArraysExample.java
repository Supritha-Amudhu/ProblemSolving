package com.atech.trial1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListObjectArraysExample
{		
	private int[] linkedlist = new int[10];
	private int size = linkedlist.length, filled =0, position =0;
	//LinkedListObjectArraysExample[] Link = new LinkedListObjectArraysExample[20]; 
	
	public static void main(String[] args) 
	{
		int choice = 0, number =0;
		Scanner in = new Scanner(System.in);
		ObjectArraysLinkedList object = new ObjectArraysLinkedList();
		while(choice!=9)
		{
			System.out.println("Operations :\n 1. Add in the beginning.\n 2. Add in the end.\n 3. Add in the middle.\n 4. Delete in the beginning.\n 5. Delete in the end.\n 6.Delete a particular number.\n 7.Delete a number in that particular position \n 8. Print List \n 9. Exit");
	        System.out.println("Enter any choice for the corresponding stack operation :");
	        Scanner scan = new Scanner(System.in);
	        choice = scan.nextInt();
        
	        switch(choice)
	        {
	        	case 1 :
	        	{
	        		System.out.println("Enter the number that you want to insert :");
                    number = scan.nextInt();
	        		object.addElementBeginning(number);
	        		break;
	        	}
	        	
	        	case 2:
	        	{
	        		System.out.println("Enter the number that you want to insert :");
                    number = scan.nextInt();
	        		object.addElementEnd(number);
	        		break;
	        	}
	        	
	        	case 3:
	        	{
	        		System.out.println("Enter the number that you want to insert,and the position :");
                    number = scan.nextInt();
                    object.setPosition(scan.nextInt());
	        		object.addElementMiddle(number, object.getPosition());
	        		break;
	        	}
	        	
	        	case 4:
	        	{
	        		object.deleteElementBeginning();
	        		break;
	        	}
	        	
	        	case 5:
	        	{
	        		object.deleteElementEnd();
	        		break;
	        	}
	        	
	        	case 6:
	        	{
	        		System.out.println("Enter the number that you want to delete :");
                    number = scan.nextInt();
	        		object.deleteParticularElement(number);
	        		break;


	        	}
	        	
	        	case 7:
	        	{
	        		System.out.println("Enter the position you want to delete :");
                    object.setPosition(scan.nextInt());
	        		object.deleteParticularPosition(object.getPosition());
	        		break;
	        	}
	        	
	        	case 8:
	        	{
	        		object.printList();
	        		break;
	        	}
	        	
	        	case 9:
	        	{
	        		System.out.println("Exiting!");
                    break;
	        	}
	        	default :
	        	{
	        		System.out.println("Please enter a number from the ones mentioned above.\n");
                    break;
	        	}
            
        	}
		}
        
	}
	
	public void addElementBeginning(int a)
	{
		try
		{
			if(LinkedList[0] == 0)
			{
				linkedlist[0] = a;
			}
			else
			{
				for(int i =filled; i>=0; i--)
				{
					linkedlist[i+1] = linkedlist[i];					
				}
				linkedlist[0] = a;
			}
			filled++;
			for(int i : linkedlist)
			{
			System.out.print(i+ " ");
			}
			System.out.println("\n");
			
		}
		catch (Exception ex)
		{
			System.out.println("The exception caught is : " +ex);
		}
		
	}
	
	public void addElementEnd(int a)
	{
		try
		{
			if(linkedlist[size-1] == 0)
			{
				linkedlist[size-1] = a;				
			}
			else 
			{
				linkedlist = Arrays.copyOf(linkedlist, linkedlist.length+1);
				size++;
				linkedlist[size-1] = a;
			}
			filled++;
			for(int i : linkedlist)
			{
			System.out.print(i+ " ");
			}
			System.out.println("\n");
			
		}
		catch (Exception ex)
		{
			System.out.println("The exception caught is : " +ex);
		}
	}
	
	public void addElementMiddle(int position, int a)
	{
		try
		{
			if(linkedlist[position-1] == 0)
			{
				linkedlist[position-1] = a;
			}
			else
			{
				linkedlist = Arrays.copyOf(linkedlist, linkedlist.length+1);
				for(int i =(position-1); i<=size; i++)
				{
					linkedlist[position+1] = linkedlist[position];
				}
				linkedlist[position] = a;
				
			}
			filled++;
			for(int i : linkedlist)
			{
			System.out.print(i+ " ");
			}
			System.out.println("\n");
		}
		catch(Exception ex)
		{
			System.out.println("The exception thrown is : " +ex);
		}
		
	}
	
	public void deleteElementBeginning()
	{
		try
		{
			if(linkedlist[0] == 0)
			{
				System.out.println("There is no element at the beginning of the list");
			}
			else
			{
				linkedlist[0] = 0;
			}
			filled--;
			for(int i : linkedlist)
			{
			System.out.print(i+ " ");
			}
			System.out.println("\n");
			
		}
		catch (Exception ex)
		{
			System.out.println("The exception caught is : " +ex);
		}
	}
	
	public void deleteElementEnd()
	{
		try
		{
			if(linkedlist[size-1] == 0)
			{
				System.out.println("There is no element to delete");				
			}
			
			else
			{
				linkedlist[size-1] = 0;
				System.out.println("Element deleted");
			}
		}
	
		catch(Exception ex)
		{
			System.out.println("The exception thrown is : " +ex);
		}
		filled--;
		for(int i : linkedlist)
		{
		System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	
	public void deleteParticularElement(int a)
	{
		try
		{
			for(int i =0; i<size-1; i++)
			{
				if (linkedlist[i] == a)
				{
					linkedlist[i] = 0; 
					filled--;
				}
				else
				{
					System.out.println("The elemt is not present in the linked list");
				}
			}
			for(int i : linkedlist)
			{
			System.out.print(i+ " ");
			}
			System.out.println("\n");
			
		}
		catch(Exception ex)
		{
			System.out.println("The exception thrown is : " +ex);
		}
	}
	
	public void deleteParticularPosition(int a)
	{
		try
		{
			if(linkedlist[a-1] != 0 && a<(size-1))				
			{
				linkedlist[a-1] = 0;
			}
			else
			{
				System.out.println("Enter a valid position");
			}
			for(int i : linkedlist)
			{
			System.out.print(i+ " ");
			}
			System.out.println("\n");
		}
		catch(Exception ex)
		{
			System.out.println("The exception thrown is : " +ex);
		}
	}
	
	public void printList()
	{
		for(int i : linkedlist)
		{
		System.out.print(i+ " ");
		}
		System.out.println("\n");
	}

	
	public int getPosition() {
		return position;
	}

	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int getFilled() {
		return filled;
	}

	
	public void setFilled(int filled) {
		this.filled = filled;
	}
}