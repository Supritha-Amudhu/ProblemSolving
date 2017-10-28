package com.atech.concepts;

public class ObjectCreation extends ABC{
		public static void main(String[] args) {
		ObjectCreation o = new ObjectCreation(5);

}
		public ObjectCreation(){
			System.out.println("Child Constructor");
		}
		public ObjectCreation(int a){
			System.out.println("Child parameterised constructor");
		}
}
class ABC{
	public ABC(){
		System.out.println("Parent constructor");
	}
	public static void m1() {
		System.out.println("m1");
	}
	public ABC(int a){
		System.out.println("Parent parameterized constructor");
	}
	
}

