package com.atech.linkedlist;
import java.util.Scanner;

import com.atech.trial1.StackExample;

public class Stack {

	public StackNode head;
	
	public void Push(Integer element)throws Exception{
		StackNode node = new StackNode(element);
		if(head.element==null){
			head=node;
			head.next=null;
		}
		else{
			node.next=head.next;
			node.next=head;
			head=node;
		}
		
	}
	
	public void Pop()throws Exception{
		if(head.next==null){
			head.element=null;
			System.out.println("The stack is empty.");
		}
		else{
			head.element=null;
			head=head.next;
		}
	}
	public void print()throws Exception{
		StackNode temp = head;
		if(temp.element==null){
			System.out.println("Stack is empty.");
		}
		else{
			while(temp.next!=null){
				System.out.println(temp.element+"->");
				temp=temp.next;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		 int choice = 0;
		 Stack newStack = new Stack();
         while(choice!=4)
         {
         System.out.println("There are the operations that you can perform using Stack :\n 1. Push a number.\n 2. Pop a number.\n 3. Print Stack contents.\n 4. Exit");
         System.out.println("Enter any choice for the corresponding stack operation :");
         try{
         Scanner scan = new Scanner(System.in);
         choice = scan.nextInt();
         
         switch(choice)
         {
             case 1 :
             {
                 Integer element;
                 System.out.println("Enter the number that you want to insert :");
                 element = scan.nextInt();
                 newStack.Push(element);   
                 newStack.print();
                 break;
             }
             case 2 :
             {
            	 newStack.Pop();  
            	 newStack.print();
                 break;
             }
             case 3 :
             {
                 System.out.println("Stack contents :");
                 newStack.print();
                 break;
             }
             case 4 :
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
         
         catch(Exception ex){
        	 System.out.println("Exception caught.");
        	 ex.printStackTrace();
         }
         }

	}

}
