package com.atech.trial1;

abstract public class AbstractSample extends check {

	public void getAge(){
		System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		
		
	}

	public static void main(String[] args) {
		//You cant inatantiate an object until all the abstract methods are overridden.
		AbstractSample ab = new AbstractSample() {
			
			@Override
			public void getAge() {
				System.out.println("redefined");
				
			}
		};
		
			
		System.out.println(ab.getName());
		ab.getAge();
		
		check c = new check() {
			
			@Override
			public void getAge() {
				System.out.println("Hey");
				
			}		
						
		};
		String name = c.getName();
		c.getAge();
		System.out.println(name);
		System.out.println();
		ab.getAge();
		

	}	
	
	

}
abstract class check{
	String str = "Hello";
	int i =10;
	public check(){
		System.out.println("Constructor");
	}
	public String getName()
	{ 
		return str;
	}
	public abstract void getAge();
}

