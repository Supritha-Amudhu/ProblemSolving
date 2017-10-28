package com.atech.newdimension;

import java.util.Scanner;

public class ArrayPositioning {

	static int[][] a;
	static int position=0;
	static int r;
	static int c;
	static int rows;
	static int col;
	
	public static void main(String[] args) {
		int element=0;
		ArrayPositioning ap = new ArrayPositioning();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows = scan.nextInt();
		System.out.println("Enter the number of columns:");
		col = scan.nextInt();
		a = new int[rows][col];		
		ap.enterElements();
		ap.print();
		System.out.println("Enter the position : ");
		position = scan.nextInt();
		System.out.println("Enter the element that you want to insert : ");
		element = scan.nextInt();
		ap.insert(element);
		ap.print();
	}
	
public void insert(int element){
			r = position/(col+1);
			if(position%col == 0){
				r=(position/col) -1;
				c=col-1;
			}
			else{
				r = (position/col);
				c= (position%col) -1;
			}
			System.out.println("R : " +r + " C : " +c);
		a[r][c] = element;		
	
}
public void enterElements(){
	int inc = 1;
	for(int i=0;i<rows;i++){
		for(int j=0;j<col;j++){
			a[i][j] = inc;
			inc++;
		}
	}
}
public void print(){
	for(int i=0;i<rows;i++){
		for(int j=0;j<col;j++){
			System.out.print(a[i][j] + " ");				
		}
		System.out.println();
	}
}
}