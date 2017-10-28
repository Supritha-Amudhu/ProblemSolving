package com.atech.newdimension;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		BiggerNumber b = new BiggerNumber();
		int[] set = b.getInput();
		b.sort(set);
		System.out.println("The 2 bigger numbers from the set are : " +set[set.length-1] + " and " +set[set.length-2]);

	}
	public int[] getInput(){
		int count1,i=0,ctr=1;
        int[] set = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the count of numbers : ");
        count1 = scan.nextInt();
        set = new int[count1];
        while(i<count1){
            System.out.println("Enter number " +ctr+ " : ");
            set[i] = scan.nextInt();
            i++;ctr++;
     }
        print(set);
		return set;
	}
	public void print(int[] set){
		System.out.println("The numbers you entered are : ");
        for(int i=0;i<set.length;i++){
               System.out.println(set[i]);
        }
	}
	public void sort(int[] set){
		int j=0, temp=0;
		for(int i=1;i<set.length;i++){
			j=i;
			while(j>=1){
				if(set[j]<set[j-1]){
					temp=set[j];
					set[j]=set[j-1];
					set[j-1]=temp;
				}
				j--;
			}
		}
		print(set);
	}

}
