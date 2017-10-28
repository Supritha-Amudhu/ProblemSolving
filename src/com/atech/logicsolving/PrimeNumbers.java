package com.atech.logicsolving;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		int[] list = new int[50];
		int i=0,j=0,count=0,array=0;
		for(i=1;i<100;i++){
			count=0;
			//System.out.println("i is : "+i);
			for(j=i;j>1;j--){
				if(i==j)
					continue;
				//System.out.println("j is : "+j);
				if((i%j)==0){
					count++;
				}
			}
			if(count==0){
				list[array]=i;
				System.out.println("Prime "+(array+1)+ " : "+list[array]);
				array++;
			}
		}
		

	}

}
