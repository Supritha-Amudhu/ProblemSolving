package com.atech.innerclass;
//You can override a method definition without actually extending the method.
public class AnonymousInnerClassSample {

	
	public static void main(String[] args) {
		MySample mine = new MySample(){
						
			public void anotherNumber(){
				System.out.println("This is an new method defined inside the anonymous inner class.");
			}
			public void printNumber(){
				System.out.println("This is overridden and printed.");
				anotherNumber();
			}
		};	
		mine.printNumber();
		

	}
	

}
class MySample{
	private int a=2;
	public void printNumber(){
		System.out.println("This is the number : " +a);
	}
	public void trial(){
		System.out.println("Is this overridden too?");
	}
}
