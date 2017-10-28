package com.atech.newdimension;

public class SquareAndSquareRoot {

	public static void main(String[] args) {
		try{
		int[] a = {0,4,0,10,1,16,2,4,16,2,3,9,81,3,9,81};
		int i=0,j=0,sqrt=0,square=0;
		int sqr = 0, sq =0,c=0, x=0;
		int contains = 0;
		int[] confirmNumber= new int[a.length];
		for(i=0;i<a.length;i++){
			sqrt=0;
			square=0;
			for(j=0;j<a.length;j++){
				if(a[i]==a[j])
					continue;
				else if(i==j)
					continue;
				else{
				if(Math.sqrt(a[i]) == a[j]){
					sqrt++;
					sqr = j;					
				}
				if((a[i]*a[i]) == a[j]){
					square++;
					sq = j;
				}
			}
			}
			
			if(sqrt!=0 && square!=0){
				if(a[i]!=0 && a[i]!=1){
					contains=0;
				for(x=0;x<confirmNumber.length;x++){
						if(a[i]==confirmNumber[x]){
							contains++;
						}
				}
						if(contains<1){
							System.out.println(a[i] + " has a square root and a square.");
							System.out.println("Square root : "+a[sqr] + " Square : "+a[sq]);
						}		
								
			}
				confirmNumber[c] = a[i];
				c++;
			}		

			
		}
	}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Exception caught.");
		}

	}

}