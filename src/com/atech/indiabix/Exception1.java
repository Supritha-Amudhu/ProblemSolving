package com.atech.indiabix;

public class Exception1 {

	public static void main(String[] args) {
		try{
			int[] a = new int[2];
			System.out.println(a[0]);
			System.out.println(a.length);
			
			
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			
		}
		finally{
			System.out.println("This");
		}
		try 
		{ 
		    int x = 0; 
		    int y = 5 / x; 
		} 
		catch (Exception e) 
		{
		    System.out.println("Exception"); 
		} 
		//This creates error during compile time
		/*catch (ArithmeticException ae) 
		{
		    System.out.println("Arithmetic Exception"); 
		}*/ 
		System.out.println("finished");

	}

}
