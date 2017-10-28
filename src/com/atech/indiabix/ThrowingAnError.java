package com.atech.indiabix;

public class ThrowingAnError {

	
	public static void main(String[] args) {
		try{
			method();
			System.out.println("A");
		}
		catch(Exception ex){
			System.out.println("B");
		}
		catch(Error e){			
			System.out.println("Error caught");
			e.printStackTrace();
		}
		finally{
			System.out.println("C");
		}
		System.out.println("D");

	}
	private static void method(){
		throw new Error("Its meeeeeeeeeeeeeeeee");
	}

}
