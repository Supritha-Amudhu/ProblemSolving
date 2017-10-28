package com.atech.innerclass;

public class InnerClassSample {
	private int a=10;
	class InnerClass{
		public void print(){
			accessInnerClass();
			System.out.println("a from inner class : "+a);
		}
	}
	public static void main(String[] args) {
		InnerClassSample outer = new InnerClassSample();
		outer.accessInnerClass();
		InnerClass inn = outer.new InnerClass();
		inn.print();
	}
	public void accessInnerClass(){
		//InnerClass inn = new InnerClass();
		System.out.println("Outer class method. O.o");
	}

}
