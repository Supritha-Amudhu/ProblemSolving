package com.atech.trial1;
import java.util.Arrays;
import java.util.Scanner;

public class TrialPgms 
{

	
	public static void main(String[] args) 
	{
		
		String[] str = new String[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the 5 strings : ");
		str[0] = scan.next();
		str[1] = scan.next();
		str[2] = scan.next();
		str[3] = scan.next();
		str[4] = scan.next();
		System.out.println("The strings you entered are : ");
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println(str[i]);
		}
		Arrays.sort(str);
		System.out.println("\nThe Sorted strings are : ");
		for(int i=4 ; i>=0 ; i--)
		{
			System.out.println(str[i]);
		}
		StringBuilder str22 = new StringBuilder("Hello There");
		System.out.println("Hey" +str22.charAt(6));
		
		char[] char22 = {'h', 'a', 'r', 'r','y'};
		str22.insert(6, char22);
		System.out.println(str22.toString());
		Object ob = "Hello There again";
		str22.insert(7, ob);
		System.out.println(str22.toString());
		System.out.println("Char" +char22.toString());
		
		/**int[] array = new int[5];
		
		array[0] = (int) (Math.random() * (100+1));
		array[1] = (int) (Math.random() * 100);
		array[2] = (int) (Math.random() * 100);
		array[3] = (int) (Math.random() * 100);
		array[4] = (int) (Math.random() * 100);
		
		for(int i=0; i<5; i++)
		{
		System.out.println(array[i]);
		}
		Arrays.sort(array);
		for(int i = 4; i>=0; i--)
		{
			System.out.println(array[i]);
		}**/
	}

}
