package com.atech.trial1;

import java.util.Scanner;

public class RecursionMultipleBy3 {
	static Scanner scan = new Scanner(System.in);
		public static void main(String[] args) {
		System.out.println("Enter a number : ");
		float a = scan.nextFloat();
		RecursionMultipleBy3 obj = new RecursionMultipleBy3();
		float result = obj.multipleNow(a);
		System.out.println(result);

	}
	public void multipleNow(float a)
	{
		System.out.println(a);
		float b = 0;
		if(a==1.0)
		{
			System.out.println(a);
		}
		System.out.println("Check");
		
		b = 3 * multipleNow(a-1);
		System.out.println(b);
		
	}

}
