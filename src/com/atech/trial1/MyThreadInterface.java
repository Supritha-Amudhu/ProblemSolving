package com.atech.trial1;

public class MyThreadInterface {

	
	public static void main(String[] args) {
		ThreadInterface th = new ThreadInterface();
		Thread t4 = new Thread(th, "Katniss");
		Thread t5 = new Thread(th, "Peeta");
		Thread t6 = new Thread(th, "Gale");
		t4.start();
		t5.start();
		t6.start();
	}

}
class ThreadInterface implements Runnable{
	private String str = "";
		
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
		}
	}
	public void printElements(){
		int i=0;
		for(i=0;i<60;i++){
			System.out.println(Thread.currentThread().getName() + "I is : " +i + "" +str);
		}
	}
	
}

