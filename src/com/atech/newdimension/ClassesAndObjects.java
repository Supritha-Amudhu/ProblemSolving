package com.atech.newdimension;

public class ClassesAndObjects extends Second{

	public static void main(String[] args) {
		Second.second();
		Second second = new Second();
		second.first();
		ClassesAndObjects classes = new ClassesAndObjects();
		classes.first();
	}

}
class Second{
	Second(){
		System.out.println("Constructor called");
	}
	public void first(){
		System.out.println("First method");
	}
	public static void second(){
		System.out.println("Second method.");
	}
}
