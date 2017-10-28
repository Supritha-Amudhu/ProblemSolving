package com.atech.newdimension;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveElementsToEndArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		List list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int i=0,n=a.length;
		for(i=0;i<n;i++){
			list.add(a[i]);
		}
		System.out.println("Enter : ");
		int move = scan.nextInt();
		for(i=0;i<move;move--){
			list.add(list.get(i));
			list.remove(i);			
		}
		System.out.println(list);
	}

}
