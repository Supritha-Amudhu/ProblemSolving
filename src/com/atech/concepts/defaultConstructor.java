package com.atech.concepts;

public class defaultConstructor {

	
	public static void main(String[] args) {
		int b = 0;
		defaultConstructor name = new defaultConstructor(b);
		defaultConstructor n = new defaultConstructor();
		
		

	}
	public defaultConstructor(int a){
		System.out.println("Value is : " +a);
	}
	public defaultConstructor() {
		// TODO Auto-generated constructor stub
	}

}
