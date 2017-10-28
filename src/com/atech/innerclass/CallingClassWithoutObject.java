package com.atech.innerclass;

public class CallingClassWithoutObject {

	public static void main(String[] args) {
		CallingClassWithoutObject now = new CallingClassWithoutObject();
		now.A();
		
	}
	public void A(){
		System.out.println("Method A is called");
		B();
	}
	public void B(){
		System.out.println("Method B is called.");
		C();
	}
	public void C(){
		System.out.println("Method C is called.");
	}

}
