package com.atech.concepts;

public class CustomException{

	public static void main(String[] args) {
	 int i=0;
	 int j=0;
		 try {
			 if(i==0){
			throw new HPException();
			 }
			 if(j==0)
			throw new Error("This is an error.");
				 
		} catch (HPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
class HPException extends Exception{
	String exception = "You can't do this. ^_^";
	public String toString(){
		return exception;
		
	}
}
