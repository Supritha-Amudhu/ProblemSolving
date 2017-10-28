package com.atech.trial1;
import com.atech.concepts.*;

public class PrivateModifier extends PrivateModifierCheck{

	
	public static void main(String[] args) {
		PrivateModifier obj1 = new PrivateModifier();
		obj1.getLength();
		System.out.print("Hey");
		System.out.println(7+2);
		System.out.println(" " +56+89+ "Too");
		String str = "";
		if(str instanceof String){
			System.out.println("Yeah");
		}
		if(obj1 instanceof PrivateModifier){
			System.out.println("Yeah again");
		}
		float f = new Float(2.2f);
		System.out.println(f);
		double f1 = 2.2f;
		System.out.println(f1);
		double d = 3.21f;
		System.out.println(d);
		double d1 = 3.21d;
		System.out.println(d1);
		if(f1 == 2.2){
			System.out.println("Hello");
		}
		else{
			System.out.println("Bye");
		}
		if(d == 3.21){
			System.out.println("Hello again");
		}
		else{
			System.out.println("Bye again");
		}
		float[] g1 = new float[2];
		float[] g2 = g1;
		float[] g3 = new float[2];
		System.out.println(g1[0]);
		System.out.println(g1.equals(g2));
		System.out.println(g1.equals(g3));
		System.out.println(g1[0] + " " + g3[0]);
		System.out.println(g1 == g3);
		int abc = 1;
		double abc1 = 1.0d;
		if(abc == abc1){
			System.out.println("Yesss");
		}
		else{
			System.out.println("Noooo");
		}

	}

}
