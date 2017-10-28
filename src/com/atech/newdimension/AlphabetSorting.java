package com.atech.newdimension;

import java.util.Scanner;

public class AlphabetSorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AlphabetSorting a = new AlphabetSorting();
		try {
			System.out.println("Enter a String : ");
			String str1 = scan.nextLine();
			String str = str1.toLowerCase();
			String[] c = str.split("");
			a.print(c);
			c = a.sort(c);
			a.print(c);
		}

		catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception caught!");
		}
	}

	public void print(String[] str) {
		System.out.println("Printing first : " +str[0]);
		for (int i = 0; i <str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}
 
	public String[] sort(String[] c) {
		int j = 0;
		String temp = "";
		while (j < c.length) {
			for (int i = 1; i < (c.length-1); i++) {
				/*System.out.println("c[i+1] = "+c[i+1] + " c[i] = "  + c[i]);
				System.out.println("i = "+i+" j = "+j);*/
				if (ascii(c[i + 1]) < ascii(c[i])) {
					temp = c[i + 1];
					c[i + 1] = c[i];
					c[i] = temp;
				}
			}
			j++;
		}
		return c;
	}

	public int ascii(String str) {
		int ascii = str.charAt(0);
		System.out.println("String : " +str + " Ascii : " +ascii);
		return ascii;
	}

}
