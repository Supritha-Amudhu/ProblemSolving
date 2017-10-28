package com.atech.test;

public class While implements A,B{

	public static void main(String[] args) {
		While ob = new While();
		ob.print();

	}

	@Override
	public void print() {
	System.out.println("This is implemented.");
		
	}
	
}
interface A{
	int a=0;
	public void print();
}
interface B{
	int a=0;
	public void print();
}
