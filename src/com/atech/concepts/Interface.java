package com.atech.concepts;

public class Interface implements Fool41{

	public static void main(String[] args) {
		int i;
		Interface object = new Interface();
		i=object.k;
		System.out.println(i);
		i=Interface.k;
		System.out.println(i);
		i=Fool41.k;
		System.out.println(i);
		String str = "abcdefghijk";
		String sub = str.substring(1,8);
		System.out.println(sub);
		

	}

}
interface Fool41{
	int k=0;
}
