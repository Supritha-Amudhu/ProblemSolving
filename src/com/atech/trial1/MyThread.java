package com.atech.trial1;

public class MyThread {

	
	public static void main(String[] args) {
		Thread t1 = new Threads("Harry");
		Thread t2 = new Threads("Ron");
		Thread t3 = new Threads("Hermione");
		//Another method.
		Thread t = new Thread(t1, "sdfsdfd");
		t1.start();
		t2.start();
		t3.start();
	}
	
}
class Threads extends Thread{
	private String str = "";
	public Threads(String str){
		this.str = str;		
	}
	@Override
	public void run() {
		try{
			printElements();
			
		}
		catch(Exception ex){
			System.out.println("Exception caught!");
			ex.printStackTrace();
		}
		finally{
		System.out.println("Exiting thread." +str );
		System.out.println(Thread.currentThread().getName());
		}
	}
	public void printElements(){
		int i=0;
		for(i=0;i<60;i++){
			System.out.println("I is : " +i + "" +str );
		}
	}
	
}
