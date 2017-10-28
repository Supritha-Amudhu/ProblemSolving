package com.atech.trial1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StackExample
    {
        int size =10, top =0;
        int[] array = new int[size];
        
        public static void main(String[] args) 
        {    
            
            int choice = 0;
            StackExample object = new StackExample();
            while(choice!=4)
            {
            System.out.println("There are the operations that you can perform using Stack :\n 1. Push a number.\n 2. Pop a number.\n 3. Print Stack contents.\n 4. Exit");
            System.out.println("Enter any choice for the corresponding stack operation :");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    int number;
                    System.out.println("Enter the number that you want to insert :");
                    number = scan.nextInt();
                    object.itemPush(number);                    
                    break;
                }
                case 2 :
                {
                    object.itemPop();                                
                    break;
                }
                case 3 :
                {
                    System.out.println("Stack contents :");
                    object.printArray();
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
            
        }    
        public void itemPush(int a) 
        {    
            try
            {
                if (top < (size))
                {
                    array[top] = a;
                    top++;
                    System.out.println("The number is inserted.\n");
                    for (int i = (top-1); i>=0; i--)
                    {
                        System.out.println(array[i]);
                    }
                    
                }
                else
                {            
                    System.out.println("The Stack is full, sorry :( \n");
                }
            } 
            catch (Exception exception) 
            {
                System.out.println("The exception thrown is : " +exception);
            }
        }
    
        public void itemPop()
        {
            try
            {
                int a;
                if(top > 0)
                {
                    top--;
                    array[top] = 0;
                    System.out.println("The number is removed.\n");
                    for (int i = (top-1); i>=0; i--)
                    {
                        System.out.println(array[i]);
                    }
                }
                else
                {
                    System.out.println("The Stack is empty, sorry!\n");
                }
            }
            catch (Exception exception)
            {
                System.out.println("The exception thrown is : " +exception);
            }
        }
            
        public void printArray()
        {
            try
            {
                for (int i = (top-1); i>=0; i--)
                {
                    System.out.println(array[i]);
                }
            }
            catch(Exception ex)
            {
                System.out.println("There are no elements in the Stack. \n");
            }
        }
    }