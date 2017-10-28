package com.atech.concepts;
import java.util.Arrays;

public class TestInterview {

	String instanceVariable;
	static int staticVariable = 23;
	public static void main(String[] args) {
		final int finalVar = 146;
		int[] arr = new int[5];
		int arr1[] = {1,2,3,4,5};
		for(int i =0;i<arr1.length;i++){
			System.out.println( "Arr1" +arr1[i]);
		}
		int x = 2;
		switch(x)
		{
		case 1: {
			System.out.println("Case "+arr1[0]);
			break;
		}
		case 2: {
		System.out.println("Case "+arr1[1]);
		break;
		}
		default:
			System.out.println("Default case");
	}
		
		
//		int a = 0, b=7;
//		double c = 3.55555;
//		float d = 5.6F;
//		System.out.println("Final integer: "+finalVar);
//		System.out.println("a:" +a + "\nb:" +b + "\nc:" +c +"\nd:" +d );
//		TestInterview obj = new TestInterview();
//		int localVariable = 1;
//		obj.sampleMethod(localVariable);
//		System.out.println("Static Variable from main()" +staticVariable);
//		nextStaticClass();
//		System.out.println("THis is sample printing: " +i + "and this:" +j);
	}
	
	public static void nextStaticClass() {
		System.out.println("This static method has been called from the Non static method");
//		TestInterview obj2 = new TestInterview();
//		obj2.sampleMethod(5);
	}
	
	//Constructor
	public TestInterview() {
		instanceVariable = new String("test instance variable");
		System.out.println("Static Variable from constructor" +staticVariable);
	}
	void sampleMethod(int localVariable) {
		TestInterview.nextStaticClass(); 
		System.out.println(instanceVariable);
		System.out.println(localVariable);
		System.out.println("Static Variable from method" +staticVariable);
	}
}
