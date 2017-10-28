package com.atech.newdimension;

public class FindingMultiples1 {

	public static void main(String[] args) {
		int[] a = {10,15,20,25, 6,2,5,4};
		int i=0,j=0,count=0,k=0;
		int[] mul = null;
		for(i=0;i<a.length;i++){
			count=0;
			mul = new int[a.length];
			k=0;
			for(j=0;j<a.length;j++)	{	
				if(a[i]==a[j])
					continue;
				else if((a[i]%a[j])==0){
					count++;
					mul[k] = a[j];
					k++;
				}												
			}
			if(count<1)
			System.out.println("Number : " +a[i] + " Multiples : null");
			else{
				System.out.print("Number : " +a[i] + " Multiples : ");
				int m=0;
				for(m=0;m<mul.length;m++){
					if(mul[m]!=0)
					System.out.print(mul[m] + " ");
				}
				System.out.println();
			}
		}
		
	}
}