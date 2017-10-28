package com.atech.trial1;

public class RecursionFibonacci {
	
	int c=0;
	public static void main(String[] args) {
		int a=0;
		int b=1;
		RecursionFibonacci obj = new RecursionFibonacci();
		obj.fibonacciSeries(a, b);		
	}
	public void fibonacciSeries(int a, int b)
	{
		if((a+b)<50000)
		{			
			System.out.println(c);			
			c = a + b;
			a=b;
			b=c;			
			fibonacciSeries(a,b);
		}
		else
		{
			System.out.println("The loop has ended");
			
		}
	}

}
