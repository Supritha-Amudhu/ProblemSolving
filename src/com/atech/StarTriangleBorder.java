package com.atech.examples;

import java.util.Scanner;

public class StarTriangleBorder {

	public static void main(String[] args) {
		System.out.println("Enter the number of lines : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		StarTriangleBorder triangle = new StarTriangleBorder();
		triangle.printTriangle(a);
	}

	public void printTriangle(int a) {
		int i = 0, p = 0, j = 0, y = 0, x = (2 * a);
		for (i = 0; i < a; i++) {
			for (p = 0; p < y; p++) {
				System.out.print(" ");
			}
			for (j = (x-1); j > 0; j--) {
				if(i==0 || i==(a-1)){
				System.out.print("*"); 
				}
				else{
					if((j==(x-1)) || (j==1)){
						System.out.print("*");
					} 
					else{
						System.out.print(" ");
					}
				}
			}
			y = y + 1;
			x = x - 2;
			System.out.println();
		}
	}

}
