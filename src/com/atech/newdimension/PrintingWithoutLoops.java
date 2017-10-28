package com.atech.newdimension;

public class PrintingWithoutLoops {

	public static void main(String[] args) {
		int a=1;
		PrintingWithoutLoops printObject = new PrintingWithoutLoops();
		printObject.printOneToHundred(a);

	}
	public void printOneToHundred(int a){
		if(a<=100){
			System.out.println(a);
			a++;
			printOneToHundred(a);
		}
		else{			
			printHundredToOne(a-1);
		}
			
	}
	public void printHundredToOne(int a){
		if(a>0){
			System.out.println(a);
			a--;
			printHundredToOne(a);
		}
	}

}
