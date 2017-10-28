package com.atech.concepts;

public class constructorSample1 extends Super {

	
	public static void main(String[] args) {
		constructorSample1 con = new constructorSample1("Hey. >.<");
		con.a = 5;

	}
	public constructorSample1(String text){
		super("Hey");
		a =2;
		System.out.println("Now its correct!");
	}

}
class Super{
	public int a=0;
	
	public Super(String text){
		a=1;
	}
}

/*OR this program. Both are correct.

package com.atech.concepts;

public class constructorSample1 extends Super {

	
	public static void main(String[] args) {
		constructorSample1 con = new constructorSample1();
		con.a = 5;

	}
	public constructorSample1(){
		//super("Hey");
		a =2;
		System.out.println("Now its correct!");
	}

}
class Super{
	public int a=0;
	
	public Super(){
		a=1;
	}
}
*/