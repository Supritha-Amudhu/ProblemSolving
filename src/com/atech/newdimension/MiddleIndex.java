package com.atech.newdimension;

import java.util.Scanner;

public class MiddleIndex {

	static boolean flag;
	static int n =1, mid, number,sum1,sum2;
	static int[] a;
	public static void main(String[] args) {
		MiddleIndex m = new MiddleIndex();
		try{
		m.getInput();
		m.print();
		m.splitSumCheck();
		
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Exception caught.");
		}
	}
	
	public void getInput() throws Exception{
		Scanner scan = new Scanner(System.in);
		while(n%2 != 0){
		System.out.println("Enter the count of numbers you want to insert (Even) : ");
		n = scan.nextInt();
		if(n%2!=0){
			System.out.println("Please enter an even number : ");
		}		
		else{
			a = new int[n];
			int n1=n, i=0;
			while(n1!=0){
				System.out.println("N1 : " +n1);
			System.out.println("Enter number " +(i+1) + ": ");
			number = scan.nextInt();						
			a[i]=number;
			System.out.println("I : " +i + " N : " +n + " a["+i+"] : " +a[i]);
			i++;
			n1--;
			}
		}
		}
	}
	public void print() throws Exception{
		System.out.println("The numbers are : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");			
		}
		System.out.println();
	}
	public void splitSumCheck() throws Exception{
		int len = a.length;
		for(int i=0;i<len;i++){
			if(i<((len+1)/2)){
				sum1=sum1+a[i];
			}
			else{
				sum2=sum2+a[i];
			}
		}
		if(sum1==sum2){
			System.out.println("The corner numbers are : " +a[(len/2)] +" and " +a[(len/2)-1]);
		}
		else{
			System.out.println("Both the sums are not equal.");
		}
		System.out.println("Sum 1 : "+sum1 + " Sum 2 : "+sum2);
	}

}
