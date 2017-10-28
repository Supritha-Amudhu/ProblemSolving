package com.atech.concepts;

public class InvertedTriangle {
	public static void main(String[] args)	{
		int a = 9;
		InvertTriangle(a);
		Triangle(a);
//		int i =a;
//		Integer j=a;
//		while(j>=0){
//				System.out.println(repeat(j.toString(),i));
//				i--;
//			j--;
//		}
//	}
//	public static String repeat(String str, int times){
//		return new String(new char[times]).replace("\0", str);
	}
	
	public static void InvertTriangle(int a){
		int i=0,j=0;
		for(i=a;i>=0;i--){
			j=i;
			while(j>=0){
				System.out.print(i);
				j--;
			}
			System.out.println("");
		}
	}
	public static void Triangle(int a){
		int i=0,j=0;
		for(i=1;i<=a;i++){
			j=1;
			while(j<=i){
				System.out.print(i);
				j++;
			}
			System.out.println("");
		}
	}
}
