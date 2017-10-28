package com.atech.designpatterns;

public class singleton {

	
	public static void main(String[] args) {
		int i=0;
		while(i<5)
		{
			Test t = Test.getInstance();
			t.display();
			i++;
		}
	}

}
class Test{
	private static Test object;
	//You can also create 2 instances.
	//private static Test object2;
	
	private Test(){
		System.out.println("Privte constructor initialised.");
	}
	public static Test getInstance(){
		if(object == null)
		{
			object = new Test();
			/*object2 = new Test();
			System.out.println(object);
			System.out.println(object2);*/
			System.out.println("Object created.");
			return object;			
		}
		else
		{
			System.out.println("Obejct returned.");
			return object;
		}
	}
	public void display(){
		System.out.println("Another function in singleton class.");
	}
}
