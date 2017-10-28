package com.atech.newdimension;
import java.util.*;

public class DynamicMatrix {
	
	static int[][] a;
	static int position=0;
	static int r;
	static int c;
	static int rows;
	static int col;
	
	public static void main(String[] args) {
		DynamicMatrix d = new DynamicMatrix();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		rows = scan.nextInt();
		System.out.println("Enter the number of columns:");
		col = scan.nextInt();
		a = new int[rows][col];
		int inc = 1;
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				a[i][j] = inc;
				inc++;
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<col;j++){
				System.out.print(a[i][j] + " ");				
			}
			System.out.println();
		}
		d.positionCheck();
	}
	public void positionCheck(){
		int x,y;
		r=0;
		for(x=1;x<=rows;x++){
			for(y=1;y<=col;y++){
				c=y-1;				
				System.out.println("Row : " +r + " Column : " +c);				
			}
			r++;		
		}
	}

}
