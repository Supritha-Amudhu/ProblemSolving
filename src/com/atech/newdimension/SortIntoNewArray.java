package com.atech.newdimension;

public class SortIntoNewArray {

	public static void main(String[] args) {
		int[] a1 = {1,4,6,0,2};
		int[] a2 = {3,1,7,0,5}; 
		sortArray(a1);
		sortArray(a2);
		int[] a3 = new int[a1.length+a2.length];
		mergeArray(a1, a2, a3);
		System.out.println("Output :");
		printArray(a3);
		
	}
	public static void sortArray(int[] a){
		int i=0,j=0, n=a.length,temp=0;
		for(i=0;i<n;i++){
			for(j=0;j<n-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void mergeArray(int[] a1, int[] a2, int[] a3){
		int i=0,j=0, a1Length=a1.length,a2Length=a2.length,a3Index=0,count=0;
		for(count=0;count<(a1Length+4);){
			if((i==a1Length) && (j==a2Length))
				break;
			if(a1[i]==a2[j]){
				a3[a3Index]=a1[i];
				i++;j++;
				a3Index++;
			}
			else if(a1[i]<a2[j]){
				a3[a3Index]=a1[i];
				i++;
				a3Index++;
			}
			else if(a2[j]<a1[i]){
				a3[a3Index]=a2[j];
				j++;
				a3Index++;
			}
			if((i==(a1Length))){
				a3[a3Index]=a2[j];
				j++;
				a3Index++;
			}
			else if((j==(a1Length))){
				a3[a3Index]=a1[i];
				i++;
				a3Index++;
			}
			count++;
		}
		
	}
	public static void printArray(int[] a){
		int i=0;
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
