package com.atech.exception;

public class ExceptionThrowAndCatch {

	
	public static void main(String[] args)  {
		try{
			int i=1;
			System.out.println(i/0);
		}
		catch(Exception ex){
			System.out.println("Exception caught");
		}
	}

}
