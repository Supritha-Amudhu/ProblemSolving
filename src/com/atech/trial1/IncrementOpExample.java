package com.atech.trial1;

public class IncrementOpExample implements Runnable {

	    private int x; 
	    private int y; 

	    public static void main(String [] args) 
	    { 
	    	IncrementOpExample that = new IncrementOpExample(); 
	      (new Thread(that)).start( ); /* Line 8 */
	       (new Thread(that)).start( ); /* Line 9 */
	    } 
	    private synchronized void run( ) /* Line 11 */
	    { 
	        for (;;) /* Line 13 */
	        { 
	            x++; 
	            y++; 
	            System.out.println("x = " + x + "y = " + y); 
	        } 
	    } 
	}
