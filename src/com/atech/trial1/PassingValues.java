package com.atech.trial1;

public class PassingValues {
	
	public static void main(String[] args) {
		int sys = 0;
		System.out.println(sys);
		float f1 = 0.2222f;
		double d1 = 0.2;
		System.out.println(f1 + " " + d1);
		float f3 = (float) (f1 + d1);
		System.out.println(f3);
		double d3 = f1 + d1;
		System.out.println(d3);
		
		Value val = new Value();
		val.a = 3;
		System.out.println(val.a);
		change(val);
		System.out.println("New Value : " +val.a);
		
		int x=3;
		System.out.println("X before changing : " +x);
		changeValue(x);
		System.out.println("X after changing, pass by value : " +x);
	}
	public static void change(Value b){
		System.out.println("Value before changing : " +b.a);
		b.a += 3;
		System.out.println("Value after changing : " +b.a);
		
	}
	public static void changeValue(int y)
	{
		System.out.println("X passed as Y before changing : " +y);
		y+=3;
		System.out.println("X passed as Y after changing : " +y);
	}

}
class Value{
	int a;
}
