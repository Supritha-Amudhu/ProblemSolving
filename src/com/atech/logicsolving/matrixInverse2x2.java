package com.atech.logicsolving;

public class matrixInverse2x2 
{

	public static void main(String[] args) 
	{
		int[][] matrix = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}
			};
			matrixInverse2x2 obj1 = new matrixInverse2x2();
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
