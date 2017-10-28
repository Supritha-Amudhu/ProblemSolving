package com.atech.newdimension;

import java.util.*;

public class MatrixInverse {
	static int rows, col;
	static int[][] a;
	static int position, r, c, determinant;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		MatrixInverse m = new MatrixInverse();
		
		System.out.println("Enter the number of rows:");
		rows = scan.nextInt();
		System.out.println("Enter the number of columns:");
		col = scan.nextInt();
		a = new int[rows][col];
		m.enterElements();
		m.print();
		m.findDeterminant();
		m.transpose();
	}

	public void enterElements() {
		System.out.println("Rows : " +rows + " Col : " +col);
		int count=0;
		System.out.println("Enter the numbers : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Position : i " +i + " j : " +j);
				a[i][j] = scan.nextInt();
			}
		}
	}
	public void print()  {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}


	public int pos(int position) {
		r = position / (col + 1);
		if (position % col == 0) {
			r = (position / col) - 1;
			c = col - 1;
		} else {
			r = (position / col);
			c = (position % col) - 1;
		}
		return a[r][c];
	}

	public void findDeterminant() {
		determinant = (pos(1) * ((pos(5) * pos(9)) - (pos(6) * pos(8)))
				- pos(2) * ((pos(4) * pos(9)) - (pos(6) * pos(7))) + pos(3)
				* ((pos(4) * pos(8)) - (pos(5) * pos(7))));
		System.out.println("The determinant is : " +determinant);
	}
	
	public void transpose(){
		swap(1,0);
		swap(2,0);
		swap(1,2);
		System.out.println("Matrix transpose : \n");
		print();
	}
	public void swap(int b, int c){
		int temp=0;
		temp=a[b][c];
		a[b][c]=a[c][b];
		a[c][b]=temp;		
	}

}
