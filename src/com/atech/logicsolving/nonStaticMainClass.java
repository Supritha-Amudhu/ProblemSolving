package com.atech.logicsolving;

public class nonStaticMainClass {
	
	public static void main(String[] args) 
	{
		nonStaticMainClass object = new nonStaticMainClass();
		System.out.println("Hello");
		for(String i : args)
		{
			System.out.println("This" +i);
		}
		String sample ="Hey";
		sample = "Hey"+"There";
		System.out.println(sample);
		StringBuilder stringObject = new StringBuilder();
		char[] str = {'a','a','a'};		
		stringObject.append(str);
		sample = sample + str[0] +str[1] +str[2];
		System.out.println(sample);
		System.out.println(str);
		char c[] = {'a','b'};
		System.out.println(c);
		String n = "";
		sample.replace('y', 'Y');
		System.out.println(sample);
		//sample.replace(n, sample);
		System.out.println("n is" +n);
		String str1 = "Hey you there";
		CharSequence c1 = "Harry Potter";
		String str2 = c1.toString();
		object.foo(str2);
		String str3 = (String) c1;
		System.out.println(str3);
		
	}
	public void foo(CharSequence c1)
	{
		System.out.println("String to charSequence : " +c1);
	}

}
