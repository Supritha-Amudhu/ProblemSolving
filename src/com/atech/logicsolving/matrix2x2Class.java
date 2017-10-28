package com.atech.logicsolving;
import java.util.*;

public class matrix2x2Class
{
	public static void main(String[] args)
	{
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		matrix2x2Class obj1 = new matrix2x2Class();
		obj1.print(matrix);
	}
	
	public void print(int[][] arr)
	{
		int rows=arr.length;
		int col = arr[1].length;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
