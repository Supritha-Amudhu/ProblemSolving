package com.atech.trees;
import java.util.*;

public class binarySearchTreeArray
{
	public void addElement(int element, int[] tree, int position)
	{
		if((tree.length)==0)
		{
			tree[position] = element;
			position++;
		}
		else if(element<tree[0])
		{
			tree[position*2] = element;
			position++;
		}
		else if(element>tree[0])
		{
			tree[(position*2)+1] = element;
			position++;
		}
	}
	public static void main(String[] args)
	{
		binarySearchTreeArray bin = new binarySearchTreeArray(); 
		int[] tree = null;
		int position=1;
		int element=0;
		Scanner scan = new Scanner(System.in);
		while(element!=99)
		{
			System.out.println("Enter a number");
			element = scan.nextInt();
			bin.addElement(element, tree, position);
		}				

	}

}
