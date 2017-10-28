package com.atech.newdimension;

public class SumFromArray {

	public static void main(String[] args) {
		int[] input = {0,1,2,3,5,6,7,11,12,14,20};
		int i=1,check=5,n=input.length,j=0,k=0;
			for(j=1;input[j]<=check;j++){
				i=j;
				k=i-1;
				for(i=j;k>=0;k--){
					if((input[i]+input[k])==check){
						System.out.println(check + " = " + input[i] + " + "+ input[k]);
					}
				}
			}
	}
			

}
